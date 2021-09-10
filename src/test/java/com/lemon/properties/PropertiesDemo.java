package com.lemon.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

/**
 * @Project: java31_maven_base
 * @Site: http://www.lemonban.com
 * @Forum: http://testingpai.com
 * @Copyright: ©2021 版权所有 湖南省零檬信息技术有限公司
 * @Author: luojie
 * @Create: 2021-07-23 21:12
 * @Desc：
 **/
public class PropertiesDemo {

    public static void main(String[] args) throws Exception {
        //Properties 泛型 String String
//        Properties prop = new Properties();
//        //put
//        prop.setProperty("id","1");
//        prop.setProperty("name","zs");
//        //get
//        System.out.println(prop.getProperty("id"));
//        System.out.println(prop);

        //load 加载
        Properties prop = new Properties();
        //文件路径：
        //绝对路径： 从盘符开始 D:\code\java31\java31_maven_base\src\test\resources\config.properties
        //相对路径： 从每个参照物开始（项目跟路径） src/test/resources/config.properties
        //往外抛出异常，1：main抛出 没人处理，2：谁使用掏出异常方法，谁处理。
//        FileInputStream fis = new FileInputStream("src/test/resources/config.properties123");
//        System.out.println("========");
//            System.out.println("========");
//            System.out.println("========");
//            System.out.println("========");
        FileInputStream fis = null;
        try {
            //可能会出现异常的代码
            fis = new FileInputStream("src/test/resources/config.properties");
            System.out.println("========");
            System.out.println("========");
            System.out.println("========");
            System.out.println("========");
            prop.load(fis);
        } catch (Exception e) {
            //异常出现之后的 补救措施
            System.out.println("异常出现之后的 补救措施");
            e.printStackTrace();
        } finally {
            System.out.println("无论是否发生异常都会执行的代码。。。释放资源 关流。");
//            fis.close();
        }
        System.out.println("end......");
//        System.out.println(prop);
        //store 重写配置文件
//        prop.setProperty("id","1");
//        prop.setProperty("name","zs");
//        FileOutputStream fos = new FileOutputStream("src/test/resources/config.properties");
//        prop.store(fos,"备注");

        // fos.close();
    }
}
