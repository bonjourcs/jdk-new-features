package com.bonjourcs.java.newfeatures.jdk9;

import com.bonjourcs.java.newfeatures.annotation.JDK;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.*;
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
        List<Integer> result = Stream.of(1, 2, 3, 4, 5, 6, 7, 8)
                .dropWhile(i -> i > 5).collect(Collectors.toList());
        System.out.println(result);
    }

}