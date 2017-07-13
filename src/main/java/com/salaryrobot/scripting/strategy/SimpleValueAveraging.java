/**
 * 
 */
package com.salaryrobot.scripting.strategy;

import com.salaryrobot.scripting.api.Currency;
import com.salaryrobot.scripting.api.ExchangePair;
import com.salaryrobot.scripting.api.StrategyScript;
import com.salaryrobot.scripting.api.annotation.ParamDescription;
import com.salaryrobot.scripting.api.annotation.ParamIndex;
import com.salaryrobot.scripting.api.annotation.ParamName;

import java.util.Arrays;
import java.util.List;

/**
 * @author m.tkadlec
 *
 */
public class SimpleValueAveraging extends StrategyScript{
	
	private Double targetValue;
	private Currency currency;
	private ExchangePair exchangePair;
	private Double step;
	private Double threshold;

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tick() {
		double usd = bitstamp.getAmount(Currency.USD) + bitstamp.getWaitingAmount(Currency.USD);
        double curr = bitstamp.getAmount(currency) + bitstamp.getWaitingAmount(currency);
        double bid = bitstamp.getBidPrice(exchangePair);
        double ask = bitstamp.getAskPrice(exchangePair);
        double last = bitstamp.getLastPrice(exchangePair);
		double currInUSD = curr * last;
		double totalUSD = usd + currInUSD;
		
		double currentTarget = (double) storage.getOrDefault("currentTarget", currInUSD);
		if(currentTarget < targetValue) {
			currentTarget += step;
			storage.put("currentTarget", currentTarget);
		}
		
		double borderBuy = currentTarget - threshold;
		if(borderBuy > currInUSD && usd > threshold){
            double needCURR = (currentTarget - currInUSD) / ask;
            bitstamp.buyCommodity(exchangePair, needCURR);
            log.info("byuing " + needCURR + " for ask: " + ask);
        }
		
		double borderSell = currentTarget + threshold;
        if(borderSell < currInUSD && currInUSD > threshold){
            double needCURR = (currInUSD - currentTarget) / bid;
            bitstamp.sellCommodity(ExchangePair.XRP_USD, needCURR);
            log.info("selling " + needCURR + " for bid: " + bid);
        }
        
        graphs.plot("USD", usd);
        graphs.plot(currency.toString(), curr);
        graphs.plot(currency.toString() + "_IN_USD", currInUSD);
        graphs.plot("TOTAL_USD", totalUSD);
        graphs.plot(currency.toString() + "_PRICE", last);
        graphs.plot("CURRENT TARGET", currentTarget);
        log.info("USD:\t" + usd);
        log.info(currency.toString() + ":\t" + curr);
        log.info(currency.toString() + "_IN_USD:\t" + currInUSD);
        log.info("TOTAL_USD:\t" + totalUSD);
        log.info("ask:\t" + ask);
        log.info("bid:\t" + bid);
        log.info("last:\t" + last);
        log.info("Current Target:\t$" + currentTarget);
        log.info("tick finished\n");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}
	
	//// helper methods
	
	private double calculateTotalUSD(){
        double usd = bitstamp.getAmount(Currency.USD) + bitstamp.getWaitingAmount(Currency.USD);
        double xrp = bitstamp.getAmount(currency) + bitstamp.getWaitingAmount(currency);
		double xrpInUSD = xrp * bitstamp.getLastPrice(exchangePair);
		double totalUSD = usd + xrpInUSD;
		return totalUSD;
        						
	}

	//// Parametrization methods:
	
	/**
	 * @param currency currency or null
	 * @return the array of possible currencies with selected one in the first place
	 */
	@ParamName("Trading Currency")
	@ParamDescription("Currency to be traded, e.g. BTC")
	@ParamIndex(0)
	public Currency[] defineTradedCurrency(Currency currency){
		if(currency == null){
			currency = Currency.BTC;
		}
		this.currency = currency;
		if(currency == Currency.LTC) this.exchangePair = ExchangePair.LTC_USD;
		else if(currency == Currency.XRP) this.exchangePair = ExchangePair.XRP_USD;
		else this.exchangePair = ExchangePair.BTC_USD;
		
		List<Currency> values = Arrays.asList(Currency.values());
		values.remove(currency);
		values.add(0, currency);
		return values.toArray(new Currency[values.size()]);
	}
	
	/**
	 * @param value
	 * @return the provided value. If value==null, returns default calculated value
	 */
	@ParamName("Target Value")
	@ParamDescription("Amount in USD the strategy will be targeting to keep in invested currency (e.g. BTC)")
	@ParamIndex(1)
	public double defineTargetValue(Double value){
		if(value == null){
			value = calculateTotalUSD() * 0.8;
		}
		this.targetValue = value;
		return value;		
	}
	
	/**
	 * @param step
	 * @return the provided value. If value==null, returns default calculated value
	 */
	@ParamName("Onboarding step")
	@ParamDescription("Amount in USD the strategy will be increasing with every tick while onboarding the investment")
	@ParamIndex(2)
	public double defineOnboardingStep(Double step){
		if(step == null){
			step =  0.8 / 30 / 24 / 60;
		}
		this.step = step;
		return step;		
	}
	
	/**
	 * @param threshold
	 * @return the provided value. If value==null, returns default calculated value
	 */
	@ParamName("Trading threshold")
	@ParamDescription("Amount in USD the strategy will buy or sell, depending on the currency pair progression. Must me $6 or more.")
	@ParamIndex(3)
	public double defineTradingThreshold(Double threshold){
		if(threshold == null || threshold < 6){
			threshold =  6d;
		}
		this.threshold = threshold;
		return threshold;		
	}
}
