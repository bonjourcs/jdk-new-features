package com.bonjourcs.java.newfeatures.jdk12;

import com.bonjourcs.java.newfeatures.annotation.JDK;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 *
 *@author Liang Chenghao
 *@date 2024/1/9
 */
@JDK(since = 12, lts = false)
class CodeTest {


    @Test
    @DisplayName("增强switch语句")
    public void testSwitch() {
        Assertions.assertEquals(1, this.enhancedSwitch("2"));
        Assertions.assertEquals(2, this.enhancedSwitch("3"));
        Assertions.assertEquals(0, this.enhancedSwitch("0"));
    }

    private int enhancedSwitch(String desc) {
        return switch (desc) {
            case "1", "2" -> 1;
            case "3", "4" -> 2;
            case "5", "6" -> 3;
            default -> 0;
        };
    }

    @JDK(since = 12, lts = false)
    private void consume(String desc) {
        switch (desc) {
            case "1" -> new Thread(() -> System.out.println(desc)).start();
            case "2" -> new Thread(() -> System.out.println("2")).start();
            default -> System.out.println("hello, world");
        }
    }
}