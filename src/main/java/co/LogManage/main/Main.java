package co.LogManage.main;

import java.io.FileInputStream;

import co.LogManage.dto.OrderData;
import co.LogManage.dto.OrderDataList;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.WorkbookDocument;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        FileInputStream LogData = new FileInputStream("C:\\Users\\USER\\Desktop\\Log1.xlsm");
        XSSFWorkbook WorkBook = new XSSFWorkbook(LogData);
        XSSFSheet SheetData = WorkBook.getSheetAt(0);
        int row = SheetData.getPhysicalNumberOfRows();

        OrderDataList OrderDataList = new OrderDataList();
        OrderData OrderData = new OrderData();


        OrderDataList.SetOrderDataList(SheetData, 100000,row);



        System.out.println("Hello world!");
    }
}