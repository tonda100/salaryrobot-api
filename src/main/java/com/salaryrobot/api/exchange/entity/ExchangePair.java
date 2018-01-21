package com.salaryrobot.api.exchange.entity;


/**
 * Enumeration of all possible combinations of {@link Commodity} and {@link PaymentCurrency}.
 *
 * @author Antonin Stoklasek
 */
public enum ExchangePair {
    BTC_USD(Commodity.BTC, PaymentCurrency.USD),
    BTC_EUR(Commodity.BTC, PaymentCurrency.EUR),
    EUR_USD(Commodity.EUR, PaymentCurrency.USD),
    XRP_USD(Commodity.XRP, PaymentCurrency.USD),
    XRP_EUR(Commodity.XRP, PaymentCurrency.EUR),
    XRP_BTC(Commodity.XRP, PaymentCurrency.BTC),
    LTC_USD(Commodity.LTC, PaymentCurrency.USD),
    LTC_EUR(Commodity.LTC, PaymentCurrency.EUR),
    LTC_BTC(Commodity.LTC, PaymentCurrency.BTC),
    ETH_USD(Commodity.ETH, PaymentCurrency.USD),
    ETH_EUR(Commodity.ETH, PaymentCurrency.EUR),
    ETH_BTC(Commodity.ETH, PaymentCurrency.BTC),
    BCH_USD(Commodity.BCH, PaymentCurrency.USD),
    BCH_EUR(Commodity.BCH, PaymentCurrency.EUR),
    BCH_BTC(Commodity.BCH, PaymentCurrency.BTC);

    private Commodity commodity;

    private PaymentCurrency paymentCurrency;

    private String code;

    ExchangePair(Commodity commodity, PaymentCurrency paymentCurrency) {
        this.commodity = commodity;
        this.paymentCurrency = paymentCurrency;
        this.code = commodity.getCode() + paymentCurrency.getCode();
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
