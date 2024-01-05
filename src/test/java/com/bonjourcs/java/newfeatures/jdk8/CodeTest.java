package com.bonjourcs.java.newfeatures.jdk8;

import com.bonjourcs.java.newfeatures.annotation.JDK;
import com.google.common.collect.Lists;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.*;
import java.util.*;
import java.util.stream.Collectors;

/**
 *
 *@author Liang Chenghao
 *@date 2024/1/5
 */
@JDK(since = 8, lts = true)
class CodeTest {

    @Test
    public void test() {
        System.out.println("JDK8 features...");
    }

    @Test
    @DisplayName("lambda表达式")
    public void testLambda() {
        Go go = () -> "hello,world";
        Assertions.assertEquals("hello,world", go.produce());
    }

    @Test
    @DisplayName("方法引用")
    public void testMethodReference() {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.forEach(Util::consume);
    }

    @Test
    @DisplayName("Stream API")
    public void testStream() {
        ArrayList<Foo> foos = Lists.newArrayList(new Foo("hello"), new Foo("world"));
        String result = foos.stream().map(Foo::getName).map(String::toUpperCase).collect(Collectors.joining(","));
        Assertions.assertEquals("HELLO,WORLD", result);
    }

    @Test
    @DisplayName("Optional类")
    public void testOptional() {
        Foo foo = null;
        String result = Optional.ofNullable(foo).map(Foo::getName).orElse("NIL");
        Assertions.assertEquals("NIL", result);
    }

    @Test
    @DisplayName("新的日期时间类")
    public void testLocalDateEtc() {
        // LocalDate转换成Date
        LocalDate now = LocalDate.now();
        Instant instant = now.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant();
        Date from = Date.from(instant);
        // Date转换成LocalDate
        Date date = new Date();
        ZonedDateTime zonedDateTime = date.toInstant().atZone(ZoneId.systemDefault());
        LocalDateTime localDateTime = zonedDateTime.toLocalDateTime();
        System.out.println(localDateTime);
    }

    @FunctionalInterface
    interface Go {
        String produce();

        @JDK(since = 8, lts = true)
        default void info() {
            System.out.println("接口默认方法");
        }
    }

    static class Util {
        static void consume(String str) {
            if (Objects.nonNull(str)) {
                System.out.println(str.toUpperCase());
            } else {
                System.out.println("NULL String");
            }
        }
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    static class Foo {
        private String name;
    }
}