package com.salaryrobot.api.entity;

import java.io.Serializable;

import javax.json.bind.annotation.JsonbProperty;

/**
 * @author Antonin Stoklasek
 */
public class Ticker implements Serializable {

    public static final long serialVersionUID = -1L;

    /**
     * Lowest sell order
     */
    @JsonbProperty("ask")
    private Double ask;

    /**
     * Highest buy order
     */
    @JsonbProperty("bid")
    private Double bid;

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
        return "Ticker{" +
            "ask=" + ask +
            ", bid=" + bid +
            '}';
    }
}
