package com.bonjourcs.java.newfeatures.jdk17;

import com.bonjourcs.java.newfeatures.annotation.JDK;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 *@author Liang Chenghao
 *@date 2024/1/9
 */
@JDK(since = 17, lts = true)
class CodeTest {

    @Test
    @DisplayName("新的日期格式化方法")
    public void testDateFormat() {
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("B");
        System.out.println(pattern.format(LocalTime.of(8, 0)));
        System.out.println(pattern.format(LocalTime.of(12, 0)));
        System.out.println(pattern.format(LocalTime.of(16, 0)));
        System.out.println(pattern.format(LocalTime.of(20, 0)));
    }

}