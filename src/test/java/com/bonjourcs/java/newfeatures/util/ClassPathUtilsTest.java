package com.bonjourcs.java.newfeatures.util;

import org.junit.jupiter.api.Test;

/**
 *
 *@author Liang Chenghao
 *@date 2024/1/5
 */
class ClassPathUtilsTest {

    @Test
    public void testGetResourceRoot() {
        System.out.println(ClassPathUtils.getResourceRoot());
    }

    @Test
    public void testResourceRoot() {
        System.out.println(ClassPathUtils.class.getResource("/"));
    }
}