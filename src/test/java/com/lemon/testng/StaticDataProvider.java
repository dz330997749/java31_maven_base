package com.lemon.testng;

import org.testng.annotations.DataProvider;

/**
 * @Project: java31_maven_base
 * @Site: http://www.lemonban.com
 * @Forum: http://testingpai.com
 * @Copyright: ©2021 版权所有 湖南省零檬信息技术有限公司
 * @Author: luojie
 * @Create: 2021-07-30 20:45
 * @Desc：
 **/
public class StaticDataProvider {

    @DataProvider
    public static Object[][] datas() {
        Object[][] datas = {
                {"static zhangsan","123456"},
                {"static lisi","123456"},
                {"static wangwu","111111"}
        };
        return datas;
    }

    @DataProvider
    public static Object[][] datas2() {
        Object[][] datas = {
                {"zhangsan","123456"},
                {"lisi","123456"},
                {"wangwu","111111"}
        };
        return datas;
    }
}
