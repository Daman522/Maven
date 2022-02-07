import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteDataExcel {
    public static void main(String args[]) throws IOException {
        String path= System.getProperty("user.dir");
        String other=path+"\\Book1.xlsx";
        System.out.println(other);

        FileInputStream fin= new FileInputStream(other);
        XSSFWorkbook wb = new XSSFWorkbook(fin);
        XSSFSheet sheet = wb.getSheetAt(0);
        sheet.getRow(1).getCell(0).setCellValue("daman");
        sheet.getRow(1).getCell(1).setCellValue("abc");
        sheet.getRow(1).getCell(2).setCellValue(221);


        FileOutputStream op = new FileOutputStream(other);
        wb.write(op);
        wb.close();



    }
}
