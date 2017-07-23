package com.salaryrobot.strategy.example; /**
 *
 */

import com.salaryrobot.api.entity.Commodity;
import com.salaryrobot.api.entity.ExchangePair;
import com.salaryrobot.api.strategy.StrategyScript;
import com.salaryrobot.api.entity.StrategyParam;

/**
 * @author m.tkadlec
 */
public class SimpleValueAveraging extends StrategyScript {

    private Double targetValue;

    private Commodity commodity;

    private ExchangePair exchangePair;

    private Double step;

    private Double threshold;

    @Override
    public void init() {
        // TODO Auto-generated method stub

    }

    @Override
    public void tick() {
        double usd = wallet.getAvailableUSD();
        double curr = wallet.getAvailable(commodity);
        double bid = tickerMap.get(exchangePair).getBid();
        double ask = tickerMap.get(exchangePair).getAsk();
        double currInUSD = curr * (bid + ask) / 2;
        double totalUSD = usd + currInUSD;

        double currentTarget = (double) storage.getOrDefault("currentTarget", currInUSD);
        if (currentTarget < targetValue) {
            currentTarget += step;
            storage.put("currentTarget", currentTarget);
        }

        double borderBuy = currentTarget - threshold;
        if (borderBuy > currInUSD && usd > threshold) {
            double needCURR = (currentTarget - currInUSD) / ask;
            bitstamp.buyCommodity(exchangePair, needCURR);
            log.info("byuing " + needCURR + " for ask: " + ask);
        }

        double borderSell = currentTarget + threshold;
        if (borderSell < currInUSD && currInUSD > threshold) {
            double needCURR = (currInUSD - currentTarget) / bid;
            bitstamp.sellCommodity(ExchangePair.XRP_USD, needCURR);
            log.info("selling " + needCURR + " for bid: " + bid);
        }

        graphs.plot("USD", usd);
        graphs.plot(commodity.toString(), curr);
        graphs.plot(commodity.toString() + "_IN_USD", currInUSD);
        graphs.plot("TOTAL_USD", totalUSD);
        graphs.plot(commodity.toString() + "_PRICE", (bid + ask) / 2);
        graphs.plot("CURRENT_TARGET", currentTarget);
        log.info("USD:\t" + usd);
        log.info(commodity.toString() + ":\t" + curr);
        log.info(commodity.toString() + "_IN_USD:\t" + currInUSD);
        log.info("TOTAL_USD:\t" + totalUSD);
        log.info("ask:\t" + ask);
        log.info("bid:\t" + bid);
        log.info("Current Target:\t" + currentTarget);
        log.info("tick finished\n");

    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub

    }

    //// helper methods

    private double calculateTotalUSD() {
        double usd = wallet.getAvailableUSD();
        double curr = wallet.getAvailable(commodity);
        double bid = tickerMap.get(exchangePair).getBid();
        double ask = tickerMap.get(exchangePair).getAsk();
        double currInUSD = curr * (bid + ask) / 2;
        double totalUSD = usd + currInUSD;
        return totalUSD;

    }

    //// Parametrization methods:

    /**
     * @param commodity commodity or null
     * @return the array of possible currencies with selected one in the first place
     */
    @StrategyParam(name = "Trading Commodity", description = "Commodity to be traded, e.g. BTC", index = 0)
    public Commodity defineTradedCommodity(Commodity commodity) {
        if (commodity == null) {
            commodity = Commodity.BTC;
        }
        this.commodity = commodity;
        switch (commodity) {
            case LTC:
                this.exchangePair = ExchangePair.LTC_USD;
                break;
            case XRP:
                this.exchangePair = ExchangePair.XRP_USD;
                break;
            default:
                this.exchangePair = ExchangePair.BTC_USD;
        }

        return commodity;
    }

    /**
     * @param value
     * @return the provided value. If value==null, returns default calculated value
     */
    @StrategyParam(name = "Target Value", description = "Amount in USD the strategy will be targeting to keep in invested commodity (e.g. BTC)"
        , index = 1)
    public double defineTargetValue(Double value) {
        if (value == null) {
            value = calculateTotalUSD() * 0.8;
        }
        this.targetValue = value;
        return value;
    }

    /**
     * @param step
     * @return the provided value. If value==null, returns default calculated value
     */
    @StrategyParam(name = "Onboarding step", description = "Amount in USD the strategy will be increasing with every tick while onboarding the investment", index = 2)
    public double defineOnboardingStep(Double step) {
        if (step == null) {
            step = 0.8 / 30 / 24 / 60;
        }
        this.step = step;
        return step;
    }

    /**
     * @param threshold
     * @return the provided value. If value==null, returns default calculated value
     */
    @StrategyParam(name = "Trading threshold", description = "Amount in USD the strategy will buy or sell, depending on the commodity pair progression. Must me 6 USD or more.", index = 3)
    public double defineTradingThreshold(Double threshold) {
        if (threshold == null || threshold < 6) {
            threshold = 6d;
        }
        this.threshold = threshold;
        return threshold;
    }
}
