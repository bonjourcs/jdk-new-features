package com.bonjourcs.java.newfeatures.jdk14;

import com.bonjourcs.java.newfeatures.annotation.JDK;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 *
 *@author Liang Chenghao
 *@date 2024/1/9
 */
@JDK(since = 14, lts = true)
class CodeTest {


    @Test
    @DisplayName("字符串块")
    public void testStringBlock() {
        var str = """
                this is a new line;\
                there will be a space character \s
                """;
        System.out.println(str);
    }

    @Test
    @DisplayName("instanceof增强")
    public void testInstanceOf() {
        this.show("gogo");
        this.show(1);
    }

    private void show(Object obj) {
        if (obj instanceof String str) {
            System.out.printf("string length is %d%n", str.length());
        } else {
            System.out.println("not a string");
        }
    }

    @Test
    @DisplayName("record关键字")
    public void testRecord() {
        var tom = new Person("tom");
        var jerry = new Person(10, "jerry");
        Assertions.assertEquals(0, tom.age);
        Assertions.assertEquals(10, jerry.age);
    }

    record Person(int age, String name) {
        public Person(String name) {
            this(0, name);
        }
    }
}