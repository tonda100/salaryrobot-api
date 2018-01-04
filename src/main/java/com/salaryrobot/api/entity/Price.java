package com.salaryrobot.api.entity;

import java.time.ZonedDateTime;


/**
 * @author Antonin Stoklasek
 */
public class Price {

    private final ZonedDateTime timestamp;

    private final Double ask;

    private final Double bid;

    public Price(ZonedDateTime timestamp, Double ask, Double bid) {
        this.timestamp = timestamp;
        this.ask = ask;
        this.bid = bid;
    }

    public ZonedDateTime getTimestamp() {
        return timestamp;
    }

    public Double getAsk() {
        return ask;
    }

    public Double getBid() {
        return bid;
    }

    @Override
    public String toString() {
        return "Price{" +
                "timestamp=" + timestamp +
                ", ask=" + ask +
                ", bid=" + bid +
                '}';
    }
}
