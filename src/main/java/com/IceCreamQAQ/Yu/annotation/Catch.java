package com.IceCreamQAQ.Yu.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Catch {

    int weight() default 0;

    Class<? extends Throwable> error();

    String[] except() default "";

    String[] only() default "";

}
