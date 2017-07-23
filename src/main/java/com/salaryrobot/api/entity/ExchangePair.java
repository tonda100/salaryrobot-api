package com.salaryrobot.api.entity;

/**
 * @author Antonin Stoklasek
 */
public enum ExchangePair {
    BTC_USD(Commodity.BTC, PaymentCurrency.USD, "btcusd"),
    XRP_USD(Commodity.XRP, PaymentCurrency.USD, "xrpusd"),
    LTC_USD(Commodity.LTC, PaymentCurrency.USD, "ltcusd");

    private Commodity commodity;

    private PaymentCurrency paymentCurrency;

    private String code;

    private ExchangePair(Commodity commodity, PaymentCurrency paymentCurrency, String code) {
        this.commodity = commodity;
        this.paymentCurrency = paymentCurrency;
        this.code = code;
    }

    public Commodity getCommodity() {
        return commodity;
    }

    public PaymentCurrency getPaymentCurrency() {
        return paymentCurrency;
    }

    public String getCode() {
        return code;
    }

    public static ExchangePair valueFromCode(String code) {
        for (ExchangePair ep : ExchangePair.values()) {
            if (code.equals(ep.getCode())) {
                return ep;
            }
        }
        throw new IllegalArgumentException("Cannot find ExchangePair for code: " + code);
    }
}
