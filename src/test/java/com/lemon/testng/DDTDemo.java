package com.lemon.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @Project: java31_maven_base
 * @Site: http://www.lemonban.com
 * @Forum: http://testingpai.com
 * @Copyright: ©2021 版权所有 湖南省零檬信息技术有限公司
 * @Author: luojie
 * @Create: 2021-07-30 20:11123123
 * @Desc：
 **/
public class DDTDemo {

    @Test(dataProvider = "datas")
    public void testLogin(String username,String password) {
        //数据驱动：
        System.out.println("username = " + username + ", password = " + password);
    }

    @Test(dataProvider = "datas2")
//    @Parameters  Parameters 和 dataProvider 不能一起用。
    public void testLogin2(User user) {
        //数据驱动：
        System.out.println("username = " + user.getUsername() + ", password = " + user.getPassword());
    }

    @DataProvider
    public Object[] datas2() {
        User user1 = new User("张三","123456");
        User user2 = new User("李四","123456");
        User user3 = new User("王五","123456");
        User user4 = new User("王五","123456");
        User user5 = new User("王五","123456");
        User user6 = new User("王五","123456");
        Object[] datas = {user1,user2,user3,user4,user5,user6};
        return datas;
    }



    @DataProvider
    public Object[][] datas() {
        Object[][] datas = {
                {"zhangsan","123456"},
                {"lisi","123456"},
                {"wangwu","111111"}
        };
        return datas;
    }



}
