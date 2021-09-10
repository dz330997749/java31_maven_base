package com.lemon.testng;

import org.testng.annotations.*;

/**
 * @Project: java31_maven_base
 * @Site: http://www.lemonban.com
 * @Forum: http://testingpai.com
 * @Copyright: ©2021 版权所有 湖南省零檬信息技术有限公司
 * @Author: luojie
 * @Create: 2021-07-28 21:23
 * @Desc：
 **/
public class BeforeAfterDemo {

    @Test
    public void test() {
        System.out.println("BeforeAfterDemo.test");
        //高内聚（专注做自己的事情） 日志 异常  低耦合
    }

    @Test
    public void test2() {
        System.out.println("BeforeAfterDemo.test");
        //高内聚（专注做自己的事情） 日志 异常  低耦合
    }


    @BeforeSuite
    public void beforeSuite() {
        System.out.println("BeforeAfterDemo.beforeSuite 日志 ");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("BeforeAfterDemo.afterSuite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("BeforeAfterDemo.beforeTest");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("BeforeAfterDemo.afterTest");
    }


    @BeforeClass
    public void beforeClass() {
        System.out.println("BeforeAfterDemo.beforeClass");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("BeforeAfterDemo.afterClass");
    }


    @BeforeMethod
    public void beforeMethod() {
        System.out.println("BeforeAfterDemo.beforeMethod");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("BeforeAfterDemo.afterMethod");
    }




}
