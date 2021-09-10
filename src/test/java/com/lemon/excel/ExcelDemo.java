package com.lemon.excel;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @Project: java31_maven_base
 * @Site: http://www.lemonban.com
 * @Forum: http://testingpai.com
 * @Copyright: ©2021 版权所有 湖南省零檬信息技术有限公司
 * @Author: luojie
 * @Create: 2021-07-26 20:13
 * @Desc：
 **/
public class ExcelDemo {
    public static void main(String[] args) throws Exception {
        /*
        * 1、IO加载excel文件
        * 2、POI获取到整个excel对象
        * 3、从excel对象中取出对应sheet
        * 4、获取Row
        * 5、获取Cell
        * 6、打印
        * */
        //1、IO加载excel文件
        FileInputStream fis = new FileInputStream("src/test/resources/java31.xlsx");
        //2、POI获取到整个excel对象
        Workbook sheets = WorkbookFactory.create(fis);
        //3、从excel对象中取出对应sheet
        Sheet sheet = sheets.getSheetAt(0);
        //4、获取Row
        Row row = sheet.getRow(1);
        //5、获取Cell
        Cell cell = row.getCell(1);
        //6、打印
        System.out.println(cell.getStringCellValue());
        //7、关流
        fis.close();
    }
}
