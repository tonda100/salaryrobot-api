package com.salaryrobot.api.strategy;

import com.salaryrobot.api.entity.Asset;
import com.salaryrobot.api.entity.ExchangePair;


/**
 * This inteface represents stock market wallet.
 * It provides information about balances of your account.
 *
 * @author Antonin Stoklasek
 */
public interface Wallet {

    /**
     * This method returns available balance of given asset.
     * How much can be used in next transaction.
     *
     * @param asset - commodity or payment currency which balance should be returned.
     * @return - available balance of given asset.
     */
    Double getAvailable(Asset asset);

    /**
     * This method returns reserved balance of given asset.
     * How much is stuck in open transactions.
     *
     * @param asset - commodity or payment currency which balance should be returned.
     * @return - reserved balance of given asset.
     */
    public Double getReserved(Asset asset);

    /**
     * This method returns total balance of given asset.
     * available + reserved = total
     *
     * @param asset - commodity or payment currency which balance should be returned.
     * @return - total balance of given asset.
     */
    public Double getTotal(Asset asset);


    /**
     * This method returns fee for given exchange pair in percent.
     * How much percent is the fee for transaction.
     *
     * @param exchangePair - exchange pair which fee percentage should be returned.
     * @return - fee percentage of given exchange pair.
     */
    public Double getFeePercentage(ExchangePair exchangePair);
}
