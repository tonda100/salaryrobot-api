/**
 *
 */
package com.salaryrobot.scripting.api;

import java.util.Map;

/**
 * @author m.tkadlec
 *
 */
public abstract class StrategyScript {

	// fields to be set by bindings
	protected Map storage;
	protected Bitstamp bitstamp;
	protected Logger log;
	protected Graphs graphs;

	/**
	 * method called when the strategy is starting for the first time within the
	 * plan
	 */
	public abstract void init();

	/**
	 * method called regularly based on the strategy plan frequency
	 */
	public abstract void tick();

	/**
	 * method called on strategy plan finish
	 */
	public abstract void stop();

	
}
