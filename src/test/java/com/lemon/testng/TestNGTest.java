package com.lemon.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @Project: java31_maven_base
 * @Site: http://www.lemonban.com
 * @Forum: http://testingpai.com
 * @Copyright: ©2021 版权所有 湖南省零檬信息技术有限公司
 * @Author: luojie
 * @Create: 2021-07-28 20:38
 * @Desc：
 **/
public class TestNGTest {

    //    @Test(alwaysRun = true,dependsOnMethods = {"test3","test2"},description = "报表可以显示此属性")
//    //dependsOnMethods 依赖方法列表，被依赖的方法先执行。
//    public void test() {
//        System.out.println("test....");
//    }
//    @Test(invocationCount=3)
//invocationCount 方法执行次数

//    @Test(priority = 1)
    @Test(threadPoolSize = 10,invocationCount = 100)
    public void test3() {
        System.out.println(Thread.currentThread().getName() + "TestNGTest.test3");
    }

    //    @Test(enabled = false)
//    @Test(priority = 2)
//    //TestNG默认执行顺序按照方法名排序。
//    public void test2() {
//        System.out.println("TestNGTest.test2");
//        //断言:期望值和实际值比较
////        Assert.fail();
//    }


}
