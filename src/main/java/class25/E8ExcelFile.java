package class25;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class E8ExcelFile {
    public static void main(String[] args) throws IOException {
        var path = "C:\\Users\\muhay\\IdeaProjects\\SDETJavaBatch18\\Files\\Batch18.xlsx";
        var fis = new FileInputStream(path);
        var excel = new XSSFWorkbook(fis);
        var sheet = excel.getSheet("Sheet");
        int noOfRows = sheet.getPhysicalNumberOfRows();

        List<Map<String, String>> excelData = new ArrayList<>();
        Row header = sheet.getRow(0);//extracted row 0 before processing data
        for (int i = 1; i < noOfRows; i++) {//we don't store the first row at index 0, because it will be used as a key. i.e i starts at 1
        Row row = sheet.getRow(i);
        Map<String, String> rowData = new LinkedHashMap<>();//creating a new map everytime I create a row
        int noOfCol = row.getPhysicalNumberOfCells();
        for (int j = 0; j < noOfCol; j++) {//runs 4 times: FirstName, lastName, AGe, Salary
        String key = header.getCell(j).toString();//extract key from the header and convert cells to String
        String value = row.getCell(j).toString();//extracted value and converted it to String
        rowData.put(key, value);
            }
            excelData.add(rowData);
        }
        System.out.println(excelData);
    }

}
