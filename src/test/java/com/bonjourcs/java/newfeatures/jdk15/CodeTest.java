package com.bonjourcs.java.newfeatures.jdk15;

import com.bonjourcs.java.newfeatures.annotation.JDK;

/**
 *
 *@author Liang Chenghao
 *@date 2024/1/9
 */
@JDK(since = 15, lts = false)
class CodeTest {


    @JDK(since = 15, lts = false)
    static abstract sealed class Animal permits Bird, Dog {
        abstract void show();
    }

    static non-sealed class Dog extends Animal {
        @Override
        void show() {
            System.out.println("non-sealed Dog");
        }
    }

    static final class Bird extends Animal {
        @Override
        void show() {
            System.out.println("in class Bird");
        }
    }

}