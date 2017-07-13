/**
 *
 */
package com.salaryrobot.scripting.api;

import java.time.Duration;

/**
 * @author m.tkadlec
 */
public interface Bitstamp {

    /**
     * This method buys a amount of commodity units for market price.
     * Default exchangePair is BTC_USD.
     * Default timeout 60 seconds.
     *
     * @param commodityUnits - how much commodity want a user buy
     */
    void buyCommodity(double commodityUnits);

    /**
     * This method buys a amount of commodity units for market price.
     * Default timeout 60 seconds.
     *
     * @param exchangePair exchange pair for buying commodity
     * @param commodityUnits - how much commodity want a user buy
     */
    void buyCommodity(ExchangePair exchangePair, double commodityUnits);

    /**
     * This method tries to buy a amount of commodity units.
     *
     * @param exchangePair exchange pair for buying commodity
     * @param commodityUnits - how much commodity want a user buy
     * @param pricePerUnit   - demanded price for a single unit of commodity
     * @param timeout        - time frame in which the trade can successfully happen
     */
    void buyCommodity(ExchangePair exchangePair, double commodityUnits, double pricePerUnit, Duration timeout);
    /**
     * This method sells a amount of commodity units for market price.
     * Default exchangePair is BTC_USD.
     * Default timeout 60 seconds.
     *
     * @param commodityUnits - how much commodity want a user sell
     */
    void sellCommodity(double commodityUnits);

    /**
     * This method sells a amount of commodity units for market price.
     * Default timeout 60 seconds.
     *
     * @param exchangePair exchange pair for selling commodity
     * @param commodityUnits - how much commodity want a user sell
     */
    void sellCommodity(ExchangePair exchangePair, double commodityUnits);


    /**
     * This method tries to sell a amount of commodity units.
     *
     * @param exchangePair exchange pair for selling commodity
     * @param commodityUnits - how much commodity want a user sell
     * @param pricePerUnit   - demanded price for a single unit of commodity
     * @param timeout        - time frame in which the trade can successfully happen
     */
    void sellCommodity(ExchangePair exchangePair, double commodityUnits, double pricePerUnit, Duration timeout);

    /**
     * @return bid price of 1 commodity unit
     * Default exchangePair is BTC_USD.
     */
    double getBidPrice();

    /**
     * @param exchangePair bid price for given exchange pair
     * @return bid price of 1 commodity unit
     */
    double getBidPrice(ExchangePair exchangePair);

    /**
     * @return ask price of 1 commodity unit
     * Default exchangePair is BTC_USD.
     */
    double getAskPrice();

    /**
     * @param exchangePair ask price for given exchange pair
     * @return ask price of 1 commodity unit
     */
    double getAskPrice(ExchangePair exchangePair);
    
    /**
     * @param exchangePair last price for given exchange pair
     * @return ask price of 1 commodity unit
     */
    double getLastPrice(ExchangePair exchangePair);
    
    /**
     * @return amount of currency currently present on the trading account
     */
    double getAmount(Currency currency);


    /**
     * @return value of waiting transactions in USD.
     * E.g. if there is pending transaction to sell 1 BTC for 1000 USD, this will return +1000 in case of USD,
     * while it will return -1 in case of BTC
     */
    double getWaitingAmount(Currency currency);


}
