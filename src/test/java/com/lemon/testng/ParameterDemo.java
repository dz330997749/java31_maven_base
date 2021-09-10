package com.lemon.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @Project: java31_maven_base
 * @Site: http://www.lemonban.com
 * @Forum: http://testingpai.com
 * @Copyright: ©2021 版权所有 湖南省零檬信息技术有限公司
 * @Author: luojie
 * @Create: 2021-07-28 21:49
 * @Desc：
 **/
public class ParameterDemo {

//    @Test
//    @Parameters({"type","version"})
//    public void test(String type,String version) {
//        System.out.println("type = " + type + ", version = " + version);
//    }

    @Test
    @Parameters({"type","version"})
    public void test(String type,String version) {
        System.out.println("type = " + type + ", version = " + version);
    }
}
