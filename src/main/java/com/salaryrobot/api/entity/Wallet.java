package com.salaryrobot.api.entity;

import javax.json.bind.annotation.JsonbProperty;

/**
 * @author Antonin Stoklasek
 */
public class Wallet {

    /**
     * How much USD can be used in next transaction
     */
    @JsonbProperty("usd_available")
    private Double availableUSD;

    /**
     * How much EUR can be used in next transaction
     */
    @JsonbProperty("eur_available")
    private Double availableEUR;

    /**
     * How much BTC can be used in next transaction
     */
    @JsonbProperty("btc_available")
    private Double availableBTC;

    /**
     * How much XRP can be used in next transaction
     */
    @JsonbProperty("xrp_available")
    private Double availableXRP;

    /**
     * How much LTC can be used in next transaction
     */
    @JsonbProperty("ltc_available")
    private Double availableLTC;

    /**
     * How much ETH can be used in next transaction
     */
    @JsonbProperty("eth_available")
    private Double availableETH;


    /**
     * How much USD is stuck in open transactions.
     */
    @JsonbProperty("usd_reserved")
    private Double reservedUSD;

    /**
     * How much EUR is stuck in open transactions.
     */
    @JsonbProperty("eur_reserved")
    private Double reservedEUR;

    /**
     * How much BTC is stuck in open transactions.
     */
    @JsonbProperty("btc_reserved")
    private Double reservedBTC;

    /**
     * How much XRP is stuck in open transactions.
     */
    @JsonbProperty("xrp_reserved")
    private Double reservedXRP;

    /**
     * How much LTC is stuck in open transactions.
     */
    @JsonbProperty("ltc_reserved")
    private Double reservedLTC;

    /**
     * How much ETH is stuck in open transactions.
     */
    @JsonbProperty("eth_reserved")
    private Double reservedETH;


    /**
     * The amount of USD in total. availableUSD + reservedUSD = balanceUSD
     */
    @JsonbProperty("usd_balance")
    private Double balanceUSD;

    /**
     * The amount of EUR in total. availableEUR + reservedEUR = balanceEUR
     */
    @JsonbProperty("eur_balance")
    private Double balanceEUR;

    /**
     * The amount of BTC in total. availableBTC + reservedBTC = balanceBTC
     */
    @JsonbProperty("btc_balance")
    private Double balanceBTC;

    /**
     * The amount of XRP in total. availableXRP + reservedXRP = balanceXRP
     */
    @JsonbProperty("xrp_balance")
    private Double balanceXRP;

    /**
     * The amount of LTC in total. availableLTC + reservedLTC = balanceLTC
     */
    @JsonbProperty("ltc_balance")
    private Double balanceLTC;

    /**
     * The amount of ETH in total. availableETH + reservedETH = balanceETH
     */
    @JsonbProperty("eth_balance")
    private Double balanceETH;


    /**
     * How much percent is the fee for transaction between BTC and EUR
     */
    @JsonbProperty("btceur_fee")
    private Double feePercentBTCEUR;

    /**
     * How much percent is the fee for transaction between BTC and EUR
     */
    @JsonbProperty("btcusd_fee")
    private Double feePercentBTCUSD;

    /**
     * How much percent is the fee for transaction between EUR and USD
     */
    @JsonbProperty("eurusd_fee")
    private Double feePercentEURUSD;

    /**
     * How much percent is the fee for transaction between XRP and BTC
     */
    @JsonbProperty("xrpbtc_fee")
    private Double feePercentXRPBTC;

    /**
     * How much percent is the fee for transaction between XRP and EUR
     */
    @JsonbProperty("xrpeur_fee")
    private Double feePercentXRPEUR;

    /**
     * How much percent is the fee for transaction between XRP and USD
     */
    @JsonbProperty("xrpusd_fee")
    private Double feePercentXRPUSD;

    /**
     * How much percent is the fee for transaction between LTC and BTC
     */
    @JsonbProperty("ltcbtc_fee")
    private Double feePercentLTCBTC;

    /**
     * How much percent is the fee for transaction between LTC and EUR
     */
    @JsonbProperty("ltceur_fee")
    private Double feePercentLTCEUR;

    /**
     * How much percent is the fee for transaction between LTC and USD
     */
    @JsonbProperty("ltcusd_fee")
    private Double feePercentLTCUSD;

    /**
     * How much percent is the fee for transaction between ETH and USD
     */
    @JsonbProperty("ethusd_fee")
    private Double feePercentETHUSD;

    /**
     * This method returns available balance of given commodity.
     * @param commodity - commodity which balance should be returned.
     * @return - available balance of given commodity.
     */
    public Double getAvailable(Commodity commodity) {
        switch (commodity) {
            case BTC:
                return availableBTC;
            case LTC:
                return availableLTC;
            case XRP:
                return availableXRP;
            case ETH:
                return availableETH;
            default:
                throw new IllegalArgumentException("No available balance for commodity: " + commodity);
        }
    }

    /**
     * This method returns available balance of given currency.
     * @param currency - currency which balance should be returned.
     * @return - available balance of given currency.
     */
    public Double getAvailable(PaymentCurrency currency) {
        switch (currency) {
            case BTC:
                return availableBTC;
            case EUR:
                return availableEUR;
            case USD:
                return availableUSD;
            default:
                throw new IllegalArgumentException("No available balance for currency: " + currency);
        }
    }

    public Double getAvailableUSD() {
        return availableUSD;
    }

    public void setAvailableUSD(Double availableUSD) {
        this.availableUSD = availableUSD;
    }

    public Double getAvailableEUR() {
        return availableEUR;
    }

    public void setAvailableEUR(Double availableEUR) {
        this.availableEUR = availableEUR;
    }

    public Double getAvailableBTC() {
        return availableBTC;
    }

    public void setAvailableBTC(Double availableBTC) {
        this.availableBTC = availableBTC;
    }

    public Double getAvailableXRP() {
        return availableXRP;
    }

    public void setAvailableXRP(Double availableXRP) {
        this.availableXRP = availableXRP;
    }

    public Double getAvailableLTC() {
        return availableLTC;
    }

    public void setAvailableLTC(Double availableLTC) {
        this.availableLTC = availableLTC;
    }

    public Double getReservedUSD() {
        return reservedUSD;
    }

    public void setReservedUSD(Double reservedUSD) {
        this.reservedUSD = reservedUSD;
    }

    public Double getReservedEUR() {
        return reservedEUR;
    }

    public void setReservedEUR(Double reservedEUR) {
        this.reservedEUR = reservedEUR;
    }

    public Double getReservedBTC() {
        return reservedBTC;
    }

    public void setReservedBTC(Double reservedBTC) {
        this.reservedBTC = reservedBTC;
    }

    public Double getReservedXRP() {
        return reservedXRP;
    }

    public void setReservedXRP(Double reservedXRP) {
        this.reservedXRP = reservedXRP;
    }

    public Double getReservedLTC() {
        return reservedLTC;
    }

    public void setReservedLTC(Double reservedLTC) {
        this.reservedLTC = reservedLTC;
    }

    public Double getBalanceUSD() {
        return balanceUSD;
    }

    public void setBalanceUSD(Double balanceUSD) {
        this.balanceUSD = balanceUSD;
    }

    public Double getBalanceEUR() {
        return balanceEUR;
    }

    public void setBalanceEUR(Double balanceEUR) {
        this.balanceEUR = balanceEUR;
    }

    public Double getBalanceBTC() {
        return balanceBTC;
    }

    public void setBalanceBTC(Double balanceBTC) {
        this.balanceBTC = balanceBTC;
    }

    public Double getBalanceXRP() {
        return balanceXRP;
    }

    public void setBalanceXRP(Double balanceXRP) {
        this.balanceXRP = balanceXRP;
    }

    public Double getBalanceLTC() {
        return balanceLTC;
    }

    public void setBalanceLTC(Double balanceLTC) {
        this.balanceLTC = balanceLTC;
    }

    public Double getFeePercentBTCEUR() {
        return feePercentBTCEUR;
    }

    public void setFeePercentBTCEUR(Double feePercentBTCEUR) {
        this.feePercentBTCEUR = feePercentBTCEUR;
    }

    public Double getFeePercentBTCUSD() {
        return feePercentBTCUSD;
    }

    public void setFeePercentBTCUSD(Double feePercentBTCUSD) {
        this.feePercentBTCUSD = feePercentBTCUSD;
    }

    public Double getFeePercentEURUSD() {
        return feePercentEURUSD;
    }

    public void setFeePercentEURUSD(Double feePercentEURUSD) {
        this.feePercentEURUSD = feePercentEURUSD;
    }

    public Double getFeePercentXRPBTC() {
        return feePercentXRPBTC;
    }

    public void setFeePercentXRPBTC(Double feePercentXRPBTC) {
        this.feePercentXRPBTC = feePercentXRPBTC;
    }

    public Double getFeePercentXRPEUR() {
        return feePercentXRPEUR;
    }

    public void setFeePercentXRPEUR(Double feePercentXRPEUR) {
        this.feePercentXRPEUR = feePercentXRPEUR;
    }

    public Double getFeePercentXRPUSD() {
        return feePercentXRPUSD;
    }

    public void setFeePercentXRPUSD(Double feePercentXRPUSD) {
        this.feePercentXRPUSD = feePercentXRPUSD;
    }

    public Double getFeePercentLTCBTC() {
        return feePercentLTCBTC;
    }

    public void setFeePercentLTCBTC(Double feePercentLTCBTC) {
        this.feePercentLTCBTC = feePercentLTCBTC;
    }

    public Double getFeePercentLTCEUR() {
        return feePercentLTCEUR;
    }

    public void setFeePercentLTCEUR(Double feePercentLTCEUR) {
        this.feePercentLTCEUR = feePercentLTCEUR;
    }

    public Double getFeePercentLTCUSD() {
        return feePercentLTCUSD;
    }

    public void setFeePercentLTCUSD(Double feePercentLTCUSD) {
        this.feePercentLTCUSD = feePercentLTCUSD;
    }

    public Double getAvailableETH() {
        return availableETH;
    }

    public void setAvailableETH(Double availableETH) {
        this.availableETH = availableETH;
    }

    public Double getReservedETH() {
        return reservedETH;
    }

    public void setReservedETH(Double reservedETH) {
        this.reservedETH = reservedETH;
    }

    public Double getBalanceETH() {
        return balanceETH;
    }

    public void setBalanceETH(Double balanceETH) {
        this.balanceETH = balanceETH;
    }

    public Double getFeePercentETHUSD() {
        return feePercentETHUSD;
    }

    public void setFeePercentETHUSD(Double feePercentETHUSD) {
        this.feePercentETHUSD = feePercentETHUSD;
    }

    @Override
    public String toString() {
        return "Wallet{" +
            "availableUSD=" + availableUSD +
            ", availableEUR=" + availableEUR +
            ", availableBTC=" + availableBTC +
            ", availableXRP=" + availableXRP +
            ", availableLTC=" + availableLTC +
            ", availableETH=" + availableETH +
            ", reservedUSD=" + reservedUSD +
            ", reservedEUR=" + reservedEUR +
            ", reservedBTC=" + reservedBTC +
            ", reservedXRP=" + reservedXRP +
            ", reservedLTC=" + reservedLTC +
            ", reservedETH=" + reservedETH +
            ", balanceUSD=" + balanceUSD +
            ", balanceEUR=" + balanceEUR +
            ", balanceBTC=" + balanceBTC +
            ", balanceXRP=" + balanceXRP +
            ", balanceLTC=" + balanceLTC +
            ", balanceETH=" + balanceETH +
            ", feePercentBTCEUR=" + feePercentBTCEUR +
            ", feePercentBTCUSD=" + feePercentBTCUSD +
            ", feePercentEURUSD=" + feePercentEURUSD +
            ", feePercentXRPBTC=" + feePercentXRPBTC +
            ", feePercentXRPEUR=" + feePercentXRPEUR +
            ", feePercentXRPUSD=" + feePercentXRPUSD +
            ", feePercentLTCBTC=" + feePercentLTCBTC +
            ", feePercentLTCEUR=" + feePercentLTCEUR +
            ", feePercentLTCUSD=" + feePercentLTCUSD +
            ", feePercentETHUSD=" + feePercentETHUSD +
            '}';
    }
}
