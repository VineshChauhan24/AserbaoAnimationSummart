package com.aserbao.aserbaoanimationsummart.classify.annotations.demo2.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * description:
 * Created by aserbao on 2017/10/17.
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface EventBase {
    Class listenerType();
    String listenerSetter();
    String methodName();
}
