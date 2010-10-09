package com.tap5.hotelbooking.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Security annotation for Tapestry Pages. Prevents anonymous access to pages. The current user must
 * be logged in.
 * 
 * @author karesti
 * @version 1.0
 */
@Target(
{ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RequiresLogin
{

}
