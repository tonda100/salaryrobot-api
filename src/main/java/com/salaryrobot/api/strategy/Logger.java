package com.salaryrobot.api.strategy;

/**
 * This interface provides possibility of logging.
 *
 * @author Antonin Stoklasek
 */
public interface Logger {

    void debug(String msg, Object... params);

    void info(String msg, Object... params);

    void warn(String msg, Object... params);

    void error(String msg, Object... params);

    void log(LogLevel level, String msg, Object... params);
}
