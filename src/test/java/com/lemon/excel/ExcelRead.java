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
 * @Create: 2021-07-26 20:35
 * @Desc：
 **/
public class ExcelRead {
    public static void main(String[] args) throws Exception {
        //1、IO加载excel文件
        FileInputStream fis = new FileInputStream("src/test/resources/java31.xls");
        //2、POI获取到整个excel对象 2003  2007
        Workbook sheets = WorkbookFactory.create(fis);
        //3、从excel对象中取出对应sheet
        Sheet sheet = sheets.getSheetAt(0);
//        //4、获取所有的数据
//        //4.1、获取所有的行 Sheet是一个可迭代的对象，而且泛型Row
        for(Row row : sheet) {
            //4.2、获取所有的单元格 Row是一个可迭代的对象，而且泛型Cell
            for (Cell cell : row) {
                cell.setCellType(CellType.STRING);
                System.out.print(cell.getStringCellValue() + ",");
            }
            System.out.println();
        }
        //获取最大行号
//        int lastRowNum = sheet.getLastRowNum();
//        for(int i=1;i<=3;i++) {
//            //获取当前行
//            Row row = sheet.getRow(i);
//            //获取最大列号
//            if(row == null) {
//                continue;
//            }
//            int lastCellNum = row.getLastCellNum();
//            for(int j=2;j<5;j++) {
//                //获取当前列
////                Cell cell = row.getCell(j);     //null
//                //枚举（可穷举） （1-7）  （int day） -21 - 21  星期｛1-7｝
//                Cell cell = row.getCell(j, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
//                //设置单元格类型为String
//                cell.setCellType(CellType.STRING);
//                //获取单元格内容
//                System.out.print(cell.getStringCellValue() + ",");
//            }
//            System.out.println();
//        }


    }
}
