/**
 * 
 */
package com.salaryrobot.scripting.api.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @author m.tkadlec
 *
 */
@Target(ElementType.METHOD)
@Documented
public @interface ParamName {

	String value();
}
