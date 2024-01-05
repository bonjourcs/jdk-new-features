package com.bonjourcs.java.newfeatures.jdk10;

import com.bonjourcs.java.newfeatures.annotation.JDK;
import lombok.Data;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Optional;

/**
 * JDK10
 *@author Liang Chenghao
 *@date 2024/1/5
 */
@JDK(since = 10, lts = false)
class CodeTest {

    @Test
    @DisplayName("类型推断")
    public void testVarTypeInference() {
        var name = "gogo";
        Assertions.assertEquals("gogo", name);
    }

    @Test
    @DisplayName("增强的Optional")
    public void testEnhanceOptional() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            Optional.of(new Foo()).map(Foo::getName)
                    .orElseThrow(() -> new RuntimeException("name's null"));
        });
    }

    @Data
    static class Foo {
        private String name;
    }

}