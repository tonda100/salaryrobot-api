package com.salaryrobot.api.strategy;

import java.time.ZonedDateTime;
import java.util.TreeSet;

import com.salaryrobot.api.entity.ExchangePair;
import com.salaryrobot.api.entity.Price;
import com.salaryrobot.api.entity.TimestampPrice;


/**
 * @author Antonin Stoklasek
 */
public interface Ticker {

    Price getLatest(ExchangePair exchangePair);

    TreeSet<TimestampPrice> getLast(ExchangePair exchangePair, ZonedDateTime from);

    TreeSet<TimestampPrice> getAll(ExchangePair exchangePair, ZonedDateTime from, ZonedDateTime to);
}
