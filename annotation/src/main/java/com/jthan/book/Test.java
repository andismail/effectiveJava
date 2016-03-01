package com.jthan.book;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 */
@Retention(RetentionPolicy.RUNTIME)//meta-annotation 原注解
@Target(ElementType.METHOD)
public @interface Test {


}
