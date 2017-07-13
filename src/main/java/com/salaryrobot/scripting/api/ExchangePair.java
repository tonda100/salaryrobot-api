package com.salaryrobot.scripting.api;

/**
 * @author Antonin Stoklasek
 */
public enum ExchangePair {
    BTC_USD(Currency.BTC, Currency.USD),
    XRP_USD(Currency.XRP, Currency.USD),
    LTC_USD(Currency.LTC, Currency.USD);

    private Currency commodity;

    private Currency paymentCurrency;

    private ExchangePair(Currency comodity, Currency paymentCurrency) {
        this.commodity = comodity;
        this.paymentCurrency = paymentCurrency;
    }

    public Currency getCommodity() {
        return commodity;
    }

    public Currency getPaymentCurrency() {
        return paymentCurrency;
    }
}
