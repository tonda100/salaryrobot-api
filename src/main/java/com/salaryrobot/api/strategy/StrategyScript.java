/**
 *
 */
package com.salaryrobot.api.strategy;

import java.time.ZonedDateTime;
import java.util.Map;

import com.salaryrobot.api.entity.Wallet;


/**
 * @author m.tkadlec
 */
public abstract class StrategyScript {

    // storage which survives the ticks
    protected Map storage;

    // buy and selling commodity
    protected Trader trader;

    // account balances
    protected Wallet wallet;

    // provide price of commodity
    protected Ticker ticker;

    // logging the run
    protected Logger log;

    // graph drawing
    protected Graphs graphs;

    protected ZonedDateTime now = ZonedDateTime.now();

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

    public void setNow(ZonedDateTime now) {
        this.now = now;
    }

    public void setStorage(Map storage) {
        this.storage = storage;
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

    public void setTrader(Trader trader) {
        this.trader = trader;
    }

    public void setTicker(Ticker ticker) {
        this.ticker = ticker;
    }
}
