package com.bonjourcs.java.newfeatures.jdk13;

import com.bonjourcs.java.newfeatures.annotation.JDK;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * JDK13
 *@author Liang Chenghao
 *@date 2024/1/9
 */
@JDK(since = 13, lts = false)
class CodeTest {

    @Test
    @DisplayName("Switch增强")
    public void testSwitch() {
        assertEquals(1, this.enhancedSwitch("1"));
        assertEquals(2, this.enhancedSwitch("4"));
        assertEquals(3, this.enhancedSwitch("8"));
    }

    private int enhancedSwitch(String desc) {
        return switch (desc) {
            case "1", "2", "3" -> 1;
            case "4", "5", "6" -> 2;
            default -> {
                System.out.println("default approved...");
                yield 3;
            }
        };
    }

    @Test
    @DisplayName("文本块")
    public void testStringCode() {
        var str = """
                <html>
                    <head><title>NEW</title></head>
                </html>
                <body>
                    <p>这是一个文本块...</p>
                </body>
                """;
        System.out.println(str);
    }
}