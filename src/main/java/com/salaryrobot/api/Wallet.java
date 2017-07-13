package com.salaryrobot.api;

import javax.json.bind.annotation.JsonbProperty;

/**
 * @author Antonin Stoklasek
 */
public class Wallet {
    @JsonbProperty("btc_available")
    private Double btcAvailable;

    @JsonbProperty("btc_balance")
    private Double btcBalance;

    @JsonbProperty("btc_reserved")
    private Double btcReserved;

    @JsonbProperty("btceur_fee")
    private Double btcEurFee;

    @JsonbProperty("btcusd_fee")
    private Double btcUsdFee;

    @JsonbProperty("eur_available")
    private Double eurAvailable;

    @JsonbProperty("eur_balance")
    private Double eurBalance;

    @JsonbProperty("eur_reserved")
    private Double eurReserved;

    @JsonbProperty("eurusd_fee")
    private Double eurUsdFee;

    @JsonbProperty("ltc_available")
    private Double ltcAvailable;

    @JsonbProperty("ltc_balance")
    private Double ltcBalance;

    @JsonbProperty("ltc_reserved")
    private Double ltcReserved;

    @JsonbProperty("ltcbtc_fee")
    private Double ltcBtcFee;

    @JsonbProperty("ltceur_fee")
    private Double ltcEurFee;

    @JsonbProperty("ltcusd_fee")
    private Double ltcUsdFee;

    @JsonbProperty("usd_available")
    private Double usdAvailable;

    @JsonbProperty("usd_balance")
    private Double usdBalance;

    @JsonbProperty("usd_reserved")
    private Double usdReserved;

    @JsonbProperty("xrp_available")
    private Double xrpAvailable;

    @JsonbProperty("xrp_balance")
    private Double xrpBalance;

    @JsonbProperty("xrp_reserved")
    private Double xrpReserved;

    @JsonbProperty("xrpbtc_fee")
    private Double xrpBtcFee;

    @JsonbProperty("xrpeur_fee")
    private Double xrpEurFee;

    @JsonbProperty("xrpusd_fee")
    private Double xrpUsdFee;

    public Double getBtcAvailable() {
        return btcAvailable;
    }

    public void setBtcAvailable(Double btcAvailable) {
        this.btcAvailable = btcAvailable;
    }

    public Double getBtcBalance() {
        return btcBalance;
    }

    public void setBtcBalance(Double btcBalance) {
        this.btcBalance = btcBalance;
    }

    public Double getBtcReserved() {
        return btcReserved;
    }

    public void setBtcReserved(Double btcReserved) {
        this.btcReserved = btcReserved;
    }

    public Double getBtcEurFee() {
        return btcEurFee;
    }

    public void setBtcEurFee(Double btcEurFee) {
        this.btcEurFee = btcEurFee;
    }

    public Double getBtcUsdFee() {
        return btcUsdFee;
    }

    public void setBtcUsdFee(Double btcUsdFee) {
        this.btcUsdFee = btcUsdFee;
    }

    public Double getEurAvailable() {
        return eurAvailable;
    }

    public void setEurAvailable(Double eurAvailable) {
        this.eurAvailable = eurAvailable;
    }

    public Double getEurBalance() {
        return eurBalance;
    }

    public void setEurBalance(Double eurBalance) {
        this.eurBalance = eurBalance;
    }

    public Double getEurReserved() {
        return eurReserved;
    }

    public void setEurReserved(Double eurReserved) {
        this.eurReserved = eurReserved;
    }

    public Double getEurUsdFee() {
        return eurUsdFee;
    }

    public void setEurUsdFee(Double eurUsdFee) {
        this.eurUsdFee = eurUsdFee;
    }

    public Double getLtcAvailable() {
        return ltcAvailable;
    }

    public void setLtcAvailable(Double ltcAvailable) {
        this.ltcAvailable = ltcAvailable;
    }

    public Double getLtcBalance() {
        return ltcBalance;
    }

    public void setLtcBalance(Double ltcBalance) {
        this.ltcBalance = ltcBalance;
    }

    public Double getLtcReserved() {
        return ltcReserved;
    }

    public void setLtcReserved(Double ltcReserved) {
        this.ltcReserved = ltcReserved;
    }

    public Double getLtcBtcFee() {
        return ltcBtcFee;
    }

    public void setLtcBtcFee(Double ltcBtcFee) {
        this.ltcBtcFee = ltcBtcFee;
    }

    public Double getLtcEurFee() {
        return ltcEurFee;
    }

    public void setLtcEurFee(Double ltcEurFee) {
        this.ltcEurFee = ltcEurFee;
    }

    public Double getLtcUsdFee() {
        return ltcUsdFee;
    }

    public void setLtcUsdFee(Double ltcUsdFee) {
        this.ltcUsdFee = ltcUsdFee;
    }

    public Double getUsdAvailable() {
        return usdAvailable;
    }

    public void setUsdAvailable(Double usdAvailable) {
        this.usdAvailable = usdAvailable;
    }

    public Double getUsdBalance() {
        return usdBalance;
    }

    public void setUsdBalance(Double usdBalance) {
        this.usdBalance = usdBalance;
    }

    public Double getUsdReserved() {
        return usdReserved;
    }

    public void setUsdReserved(Double usdReserved) {
        this.usdReserved = usdReserved;
    }

    public Double getXrpAvailable() {
        return xrpAvailable;
    }

    public void setXrpAvailable(Double xrpAvailable) {
        this.xrpAvailable = xrpAvailable;
    }

    public Double getXrpBalance() {
        return xrpBalance;
    }

    public void setXrpBalance(Double xrpBalance) {
        this.xrpBalance = xrpBalance;
    }

    public Double getXrpReserved() {
        return xrpReserved;
    }

    public void setXrpReserved(Double xrpReserved) {
        this.xrpReserved = xrpReserved;
    }

    public Double getXrpBtcFee() {
        return xrpBtcFee;
    }

    public void setXrpBtcFee(Double xrpBtcFee) {
        this.xrpBtcFee = xrpBtcFee;
    }

    public Double getXrpEurFee() {
        return xrpEurFee;
    }

    public void setXrpEurFee(Double xrpEurFee) {
        this.xrpEurFee = xrpEurFee;
    }

    public Double getXrpUsdFee() {
        return xrpUsdFee;
    }

    public void setXrpUsdFee(Double xrpUsdFee) {
        this.xrpUsdFee = xrpUsdFee;
    }


    @Override
    public String toString() {
        return "Wallet{" +
                "btcAvailable=" + btcAvailable +
                ", btcBalance=" + btcBalance +
                ", btcReserved=" + btcReserved +
                ", btcEurFee=" + btcEurFee +
                ", btcUsdFee=" + btcUsdFee +
                ", eurAvailable=" + eurAvailable +
                ", eurBalance=" + eurBalance +
                ", eurReserved=" + eurReserved +
                ", eurUsdFee=" + eurUsdFee +
                ", ltcAvailable=" + ltcAvailable +
                ", ltcBalance=" + ltcBalance +
                ", ltcReserved=" + ltcReserved +
                ", ltcBtcFee=" + ltcBtcFee +
                ", ltcEurFee=" + ltcEurFee +
                ", ltcUsdFee=" + ltcUsdFee +
                ", usdAvailable=" + usdAvailable +
                ", usdBalance=" + usdBalance +
                ", usdReserved=" + usdReserved +
                ", xrpAvailable=" + xrpAvailable +
                ", xrpBalance=" + xrpBalance +
                ", xrpReserved=" + xrpReserved +
                ", xrpBtcFee=" + xrpBtcFee +
                ", xrpEurFee=" + xrpEurFee +
                ", xrpUsdFee=" + xrpUsdFee +
                '}';
    }
}
