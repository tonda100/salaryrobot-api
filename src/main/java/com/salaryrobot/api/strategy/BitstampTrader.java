/**
 *
 */
package com.salaryrobot.api.strategy;

import com.salaryrobot.api.entity.ExchangePair;

/**
 * @author m.tkadlec
 */
public interface BitstampTrader {

    /**
     * This method buys an amount of commodity units for market price.
     * Default exchangePair is BTC_USD.
     *
     * @param commodityUnits - how much commodity want a user buy
     */
    void buyCommodity(double commodityUnits);

    /**
     * This method buys an amount of commodity units for market price.
     *
     * @param exchangePair   exchange pair for buying commodity
     * @param commodityUnits - how much commodity want a user buy
     */
    void buyCommodity(ExchangePair exchangePair, double commodityUnits);


    /**
     * This method sells an amount of commodity units for market price.
     * Default exchangePair is BTC_USD.
     *
     * @param commodityUnits - how much commodity want a user sell
     */
    void sellCommodity(double commodityUnits);

    /**
     * This method sells an amount of commodity units for market price.
     *
     * @param exchangePair   exchange pair for selling commodity
     * @param commodityUnits - how much commodity want a user sell
     */
    void sellCommodity(ExchangePair exchangePair, double commodityUnits);

}
