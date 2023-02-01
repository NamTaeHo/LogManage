package org.example;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {

        FileInputStream LogData = new FileInputStream("C:\\Users\\USER\\Desktop\\Log1.xlsm");
        XSSFWorkbook WorkBook = new XSSFWorkbook(LogData);
        XSSFSheet SheetData = WorkBook.getSheetAt(0);
        int row = SheetData.getPhysicalNumberOfRows();

        System.out.println("Hello world!");
    }
}