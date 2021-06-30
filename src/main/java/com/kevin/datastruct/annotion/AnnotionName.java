package com.kevin.datastruct.annotion;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author chenligeng
 */
@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.TYPE,ElementType.FIELD})
public @interface AnnotionName {

    String value() default "";

    String name() default "";

    String max() default "";
}
