package com.bonjourcs.java.newfeatures.jdk11;

import com.bonjourcs.java.newfeatures.annotation.JDK;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JDK11
 *@author Liang Chenghao
 *@date 2024/1/5
 */
@JDK(since = 11, lts = true)
class CodeTest {

    @Test
    @DisplayName("String新功能")
    public void test() {
        var str = "1".repeat(3);
        assertEquals("111", str);
        str = " hello ";
        assertEquals("hello ", str.stripLeading());
        assertEquals(" hello", str.stripTrailing());
        assertEquals("hello", str.strip());
    }

    @Test
    @DisplayName("Predicate not")
    public void testPredicate() {
        List<Integer> result = Stream.of(1, 2, 3, 4, 5)
                .filter(Predicate.not(i -> i > 3)).collect(Collectors.toList());
        assertEquals(3, result.size());
    }
}