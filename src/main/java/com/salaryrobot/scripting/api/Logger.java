package com.salaryrobot.scripting.api;

/**
 * This interface provides possibility of logging.
 *
 * @author Antonin Stoklasek
 */
public interface Logger {

    void debug(String msg);

    void info(String msg);

    void warn(String msg);

    void error(String msg);

}
