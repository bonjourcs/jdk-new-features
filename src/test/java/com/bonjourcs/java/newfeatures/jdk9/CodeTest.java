package com.bonjourcs.java.newfeatures.jdk9;

import com.bonjourcs.java.newfeatures.annotation.JDK;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 *@author Liang Chenghao
 *@date 2024/1/5
 */
@JDK(since = 9, lts = false)
class CodeTest {

    @Test
    @DisplayName("快速创建不可变集合")
    public void test() {
        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        Assertions.assertThrows(UnsupportedOperationException.class, () -> integers.add(10));
    }

    @JDK(since = 9, lts = false)
    interface Jdk9 {
        private void display() {
            // private method
        }
    }

    @Test
    @DisplayName("try-with-resource增强")
    public void testTryWithResource() throws IOException {
        InputStream stream = new FileInputStream("~/demo.txt");
        InputStreamReader reader = new InputStreamReader(stream);
        try (stream; reader) {
            // do-something
        }
    }

    @Test
    @DisplayName("增强的Stream API")
    public void testEnhancedStreamOperation() {
        // jdk16 之后可以使用#toList();
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> result = integers.stream().takeWhile(i -> i < 5).collect(Collectors.toList());
        Assertions.assertEquals(4, result.size());
        List<Integer> result2 = Stream.of(8, 9, 1, 7, 5, 3, 2).takeWhile(e -> e > 6).collect(Collectors.toList());
        Assertions.assertEquals(2, result2.size());
    }

}