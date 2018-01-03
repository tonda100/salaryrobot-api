package com.salaryrobot.api.entity;

import java.time.ZonedDateTime;


/**
 * @author Antonin Stoklasek
 */
public class Price {

    private ZonedDateTime timestamp;

    private Double ask;

    private Double bid;

    public ZonedDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(ZonedDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public Double getAsk() {
        return ask;
    }

    public void setAsk(Double ask) {
        this.ask = ask;
    }

    public Double getBid() {
        return bid;
    }

    public void setBid(Double bid) {
        this.bid = bid;
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
