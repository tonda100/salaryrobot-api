/**
 * 
 */
package com.salaryrobot.api.strategy;

/**
 * @author m.tkadlec
 *
 */
public interface Graphs {

	/**
	 * By default, X-axis is a timeline, so the value will be plotted as Y-axis value on the current time
	 * 
	 * @param graphName defines the name of the graph. All values with the same name will be plotted to the same graph
	 * @param value to be plotted
	 */
	void plot(String graphName, double value);
	
	/**
	 * the value will be plotted as Y-axis value while the timestamp defines the X-axis position
	 * 
	 * @param graphName defines the name of the graph. All values with the same name will be plotted to the same graph
	 * @param value to be plotted
	 * @param timestamp of the value
	 */
	void plot(String graphName, double value, long timestamp);
}
