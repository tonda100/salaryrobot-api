package com.salaryrobot.api.exchange.entity;


/**
 * Enumeration of all possible payment currencies.
 * This payment currencies are used to pay for {@link Commodity}.
 *
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
