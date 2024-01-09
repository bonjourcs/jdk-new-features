package com.bonjourcs.java.newfeatures.jdk19;

import com.bonjourcs.java.newfeatures.annotation.JDK;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 *
 * JDK19
 *@author Liang Chenghao
 *@date 2024/1/9
 */
@JDK(since = 19, lts = false)
class CodeTest {

    @Test
    @DisplayName("增强模式匹配")
    public void testSwitch() {
        S a = new A();
        S b = new B();
        S c = new C();
        this.switchType(a);
        this.switchType(b);
        this.switchType(c);
    }

    private void switchType(S s) {
        switch (s) {
            case A a -> System.out.println("type A");
            case B b -> System.out.println("type B");
            case C c -> System.out.println("type C");
            default -> System.out.println("default type");
        }
    }

    sealed interface S permits A, B, C {
    }

    static final class A implements S {
    }

    static final class B implements S {
    }

    static final class C implements S {
    }

    @Test
    @DisplayName("record模式匹配")
    public void test() {
        this.display("1");
        this.display(new Dog("kim"));
        this.display(new Dog("john", 10));
    }

    private void display(Object o) {
        if (o instanceof Dog(String name, int age)) {
            System.out.printf("Dog[%s,%d]%n", name, age);
        } else {
            System.out.println("Insufficient type");
        }
    }

    record Dog(String name, int age) {
        Dog(String name) {
            this(name, 0);
        }
    }

}