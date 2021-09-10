package com.lemon.excel;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * @Project: java31_maven_base
 * @Site: http://www.lemonban.com
 * @Forum: http://testingpai.com
 * @Copyright: ©2021 版权所有 湖南省零檬信息技术有限公司
 * @Author: luojie
 * @Create: 2021-07-26 21:20
 * @Desc：
 **/
public class ExcelWrite {
    public static void main(String[] args) throws Exception {
        //修改
        //写 创建
        //1、IO加载excel文件
        FileInputStream fis = new FileInputStream("src/test/resources/java31.xls");
        //2、POI获取到整个excel对象 2003  2007
        Workbook sheets = WorkbookFactory.create(fis);
//        sheets.create/
        Sheet sheet = sheets.getSheetAt(0);
        Row row = sheet.getRow(1);
        Cell cell = row.getCell(1);
        cell.setCellValue("zhangsan");



//        Row row = sheet.getRow(2);
//        Cell cell = row.getCell(1);
//        cell.setCellValue("lisi");
//
//
//        Row row = sheet.getRow(3);
//        Cell cell = row.getCell(1);
//        cell.setCellValue("wangwu");

        //sheets 整个excel已经被修改
        //new FileOutputStream()执行立马清空文件
        FileOutputStream fos = new FileOutputStream("src/test/resources/java31.xls");
        sheets.write(fos);

    }
}
