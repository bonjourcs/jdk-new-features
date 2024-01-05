package com.bonjourcs.java.newfeatures.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 功能标注注解
 *@author Liang Chenghao
 *@date 2024/1/5
 */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.ANNOTATION_TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface JDK {

    /**
     * 基于版本号
     */
    int since() default 1;

    /**
     * 是否是LTS版本
     */
    boolean lts() default false;

}
