package com.salaryrobot.api.entity;

import javax.json.JsonObject;
import javax.json.bind.annotation.JsonbProperty;


/**
 * @author Antonin Stoklasek
 */
public class Wallet {

    private static final String AVAILABLE_SUFFIX = "_available";

    private static final String RESERVED_SUFFIX = "_reserved";

    private static final String TOTAL_SUFFIX = "_balance";

    private static final String FEE_SUFFIX = "_fee";

    private final JsonObject data;


    public Wallet(JsonObject data) {
        this.data = data;
    }

    /**
     * This method returns available balance of given asset.
     * How much can be used in next transaction.
     *
     * @param asset - commodity or payment currency which balance should be returned.
     * @return - available balance of given asset.
     */
    public Double getAvailable(Asset asset) {
        String key = asset.getCode() + AVAILABLE_SUFFIX;
        if (data.containsKey(key)) {
            String value = data.getString(key);
            return Double.valueOf(value);
        }
        return null;
    }

    /**
     * This method returns reserved balance of given asset.
     * How much is stuck in open transactions.
     *
     * @param asset - commodity or payment currency which balance should be returned.
     * @return - reserved balance of given asset.
     */
    public Double getReserved(Asset asset) {
        String key = asset.getCode() + RESERVED_SUFFIX;
        if (data.containsKey(key)) {
            String value = data.getString(key);
            return Double.valueOf(value);
        }
        return null;
    }

    /**
     * This method returns total balance of given asset.
     * available + reserved = total
     *
     * @param asset - commodity or payment currency which balance should be returned.
     * @return - total balance of given asset.
     */
    public Double getTotal(Asset asset) {
        String key = asset.getCode() + TOTAL_SUFFIX;
        if (data.containsKey(key)) {
            String value = data.getString(key);
            return Double.valueOf(value);
        }
        return null;
    }


    /**
     * This method returns fee for given exchange pair in percent.
     * How much percent is the fee for transaction.
     *
     * @param exchangePair - exchange pair which fee percentage should be returned.
     * @return - fee percentage of given exchange pair.
     */
    public Double getFeePercentge(ExchangePair exchangePair) {
        String key = exchangePair.getCode() + FEE_SUFFIX;
        if (data.containsKey(key)) {
            String value = data.getString(key);
            return Double.valueOf(value);
        }
        return null;
    }


    @Override
    public String toString() {
        return "Wallet{" +
                "data=" + data +
                '}';
    }
}
