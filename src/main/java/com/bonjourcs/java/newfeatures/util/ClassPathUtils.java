package com.bonjourcs.java.newfeatures.util;

/**
 * 路径工具类
 *@author Liang Chenghao
 *@date 2024/1/5
 */
public class ClassPathUtils {

    public static String getResourceRoot() {
        return ClassPathUtils.class.getClassLoader().getResource("").getPath();
    }

}
