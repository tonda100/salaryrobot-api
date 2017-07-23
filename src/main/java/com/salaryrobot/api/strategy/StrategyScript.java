/**
 *
 */
package com.salaryrobot.api.strategy;

import java.util.Map;

import com.salaryrobot.api.entity.ExchangePair;
import com.salaryrobot.api.entity.Ticker;
import com.salaryrobot.api.entity.Wallet;

/**
 * @author m.tkadlec
 */
public abstract class StrategyScript {

    // fields to be set by bindings
    protected Map storage;

    protected BitstampTrader bitstamp;

    protected Logger log;

    protected Graphs graphs;

    protected Wallet wallet;

    protected Map<ExchangePair, Ticker> tickerMap;

    /**
     * method called when the strategy is starting for the first time within the
     * plan
     */
    public abstract void init();

    /**
     * method called regularly based on the strategy plan frequency
     */
    public abstract void tick();

    /**
     * method called on strategy plan finish
     */
    public abstract void stop();


    public void setStorage(Map storage) {
        this.storage = storage;
    }

    public void setBitstamp(BitstampTrader bitstamp) {
        this.bitstamp = bitstamp;
    }

    public void setLog(Logger log) {
        this.log = log;
    }

    public void setGraphs(Graphs graphs) {
        this.graphs = graphs;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    public void setTickerMap(Map<ExchangePair, Ticker> tickerMap) {
        this.tickerMap = tickerMap;
    }
}
