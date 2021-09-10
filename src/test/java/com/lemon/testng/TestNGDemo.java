package com.lemon.testng;


import org.testng.annotations.Test;

/**
 * @Project: java31_maven_base
 * @Site: http://www.lemonban.com
 * @Forum: http://testingpai.com
 * @Copyright: ©2021 版权所有 湖南省零檬信息技术有限公司
 * @Author: luojie
 * @Create: 2021-07-28 20:30
 * @Desc：
 **/
public class TestNGDemo {

    @Test       //表示当前方法是一个testng测试方法。
    public void test() {
        System.out.println("test...");
    }

    @Test       //表示当前方法是一个testng测试方法。
    public void test2() {
        System.out.println("test222222...");
    }

    public void test(int i) {
        System.out.println("test2......");
    }

}
