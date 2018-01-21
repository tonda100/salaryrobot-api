package com.salaryrobot.api.ticker.boundary;

import java.time.ZonedDateTime;
import java.util.TreeSet;

import com.salaryrobot.api.exchange.entity.ExchangePair;
import com.salaryrobot.api.ticker.entity.Price;
import com.salaryrobot.api.ticker.entity.TimestampPrice;


/**
 * Interface for retrieving price information.
 *
 * @author Antonin Stoklasek
 */
public interface Ticker {

    /**
     * Method for the most recent price of given exchange pair.
     *
     * @param exchangePair exchange pair which price you need to receive
     * @return current price of given exchange pair
     */
    Price getLatest(ExchangePair exchangePair);

    /**
     * Method for receiving set of all price between given from time and now.
     *
     * @param exchangePair exchange pair which prices you need to receive
     * @param from the from border of price's set
     * @return set of prices
     */
    TreeSet<TimestampPrice> getLast(ExchangePair exchangePair, ZonedDateTime from);

    /**
     * Method for receiving set of all price between given "from" time and and "to" time.
     *
     * @param exchangePair exchange pair which prices you need to receive
     * @param from the from border of price's set
     * @param to the to border of price's set
     * @return set of prices
     */
    TreeSet<TimestampPrice> getAll(ExchangePair exchangePair, ZonedDateTime from, ZonedDateTime to);
}
