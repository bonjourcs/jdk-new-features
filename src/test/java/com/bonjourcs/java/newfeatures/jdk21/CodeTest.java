package com.bonjourcs.java.newfeatures.jdk21;

import com.bonjourcs.java.newfeatures.annotation.JDK;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 *@author Liang Chenghao
 *@date 2024/1/9
 */
@JDK(since = 21, lts = true)
class CodeTest {

    @Test
    @DisplayName("虚拟线程")
    public void test() {
        // 创建虚拟线程
        Thread.ofVirtual()
                .name("virtual-1")
                .start(() -> System.out.println("hello, world"));
        // 创建虚拟线程
        Thread.startVirtualThread(() -> System.out.println("yes, java"));
        // 虚拟线程池
        try (ExecutorService executorService = Executors.newVirtualThreadPerTaskExecutor()) {
            executorService.submit(() -> System.out.println("yes, virtual thread"));
        }

    }

}