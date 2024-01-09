package com.bonjourcs.java.newfeatures.jdk14;

import com.bonjourcs.java.newfeatures.annotation.JDK;
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
}