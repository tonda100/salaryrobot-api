package com.salaryrobot.api.entity;

import javax.json.bind.annotation.JsonbProperty;

/**
 * @author Antonin Stoklasek
 */
public class Ticker {

    /** Lowest sell order */
    @JsonbProperty("ask")
    private Double ask;

    /** Highest buy order */
    @JsonbProperty("bid")
    private Double bid;

    /** The lowest price paid in last 24 hours */
    @JsonbProperty("low")
    private Double lowest24h;

    /** The highest price paid in last 24 hours */
    @JsonbProperty("high")
    private Double highest24h;

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

    public Double getLowest24h() {
        return lowest24h;
    }

    public void setLowest24h(Double lowest24h) {
        this.lowest24h = lowest24h;
    }

    public Double getHighest24h() {
        return highest24h;
    }

    public void setHighest24h(Double highest24h) {
        this.highest24h = highest24h;
    }

    @Override
    public String toString() {
        return "Ticker{" +
            "ask=" + ask +
            ", bid=" + bid +
            ", lowest24h=" + lowest24h +
            ", highest24h=" + highest24h +
            '}';
    }
}
