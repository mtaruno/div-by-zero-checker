package org.checkerframework.checker.dividebyzero.qual;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.SubtypeOf;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/**
 * Indicates that the value is strictly positive.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@SubtypeOf({Top.class})  // Positive is a subtype of Top.
public @interface Positive {}