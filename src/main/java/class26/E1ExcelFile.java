package class26;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import utils.Constants;

import java.io.FileInputStream;
import java.io.IOException;

public class E1ExcelFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream(Constants.EXCEL_FILE_PATH);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fis);
        Sheet sheet=xssfWorkbook.getSheet("Sheet");
        //Row row=sheet.getRow(2);
        //Cell cell=row.getCell(1);
       // System.out.println(cell);
        int noOfActualRowsWithData= sheet.getPhysicalNumberOfRows();
        for (int i = 0; i <noOfActualRowsWithData; i++) {
            Row row= sheet.getRow(i);
            int noOfActualCellsWithData=row.getPhysicalNumberOfCells();
            for (int j = 0; j <noOfActualCellsWithData ; j++) {
                System.out.print(row.getCell(j)+" ");
            }
            System.out.println();

        }

    }
}
