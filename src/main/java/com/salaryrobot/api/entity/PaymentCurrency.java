package com.salaryrobot.api.entity;

/**
 * @author Antonin Stoklasek
 */
public enum PaymentCurrency implements Asset {

    USD("usd"),
    EUR("eur"),
    BTC("btc");

    private final String code;

    PaymentCurrency(String code) {
        this.code = code;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "PaymentCurrency{" +
                "code='" + code + '\'' +
                "} " + super.toString();
    }
}
