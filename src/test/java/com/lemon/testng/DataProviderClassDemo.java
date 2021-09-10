package com.lemon.testng;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @Project: java31_maven_base
 * @Site: http://www.lemonban.com
 * @Forum: http://testingpai.com
 * @Copyright: ©2021 版权所有 湖南省零檬信息技术有限公司
 * @Author: luojie
 * @Create: 2021-07-30 20:11
 * @Desc：
 **/
public class DataProviderClassDemo {

    @Test(dataProvider = "datas",dataProviderClass = StaticDataProvider.class)
    public void testLogin(ITestContext testContext, String username, String password) {
        //数据驱动：
        System.out.println("username = " + username + ", password = " + password);
        System.out.println(testContext);
        System.out.println(testContext.getPassedTests());
        System.out.println(testContext.getSkippedTests());
        System.out.println(testContext.getFailedTests());
        System.out.println(testContext.getName());
        System.out.println(testContext.getSuite().getName());
    }


//    @DataProvider
//    public Object[][] datas() {
//        Object[][] datas = {
//                {"zhangsan","123456"},
//                {"lisi","123456"},
//                {"wangwu","111111"}
//        };
//        return datas;
//    }



}
