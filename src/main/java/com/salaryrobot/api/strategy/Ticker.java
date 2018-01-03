package com.salaryrobot.api.strategy;

import java.time.ZonedDateTime;
import java.util.List;

import com.salaryrobot.api.entity.ExchangePair;
import com.salaryrobot.api.entity.Price;


/**
 * @author Antonin Stoklasek
 */
public interface Ticker {

    Price getLatest(ExchangePair exchangePair);

    List<Price> getLast(ExchangePair exchangePair, ZonedDateTime to);

    List<Price> getAll(ExchangePair exchangePair, ZonedDateTime from, ZonedDateTime to);
}
