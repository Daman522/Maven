import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadDataExcel {

    public static void main(String args[]) throws IOException {
       String path= System.getProperty("user.dir");
       String other=path+"\\Book1.xlsx";
        System.out.println(other);
        //to get dynamic path

       FileInputStream fin =new FileInputStream(other);
       XSSFWorkbook wb =new XSSFWorkbook(fin);
       XSSFSheet sheet=wb.getSheetAt(0);
       int row=sheet.getLastRowNum();
       System.out.println(row);

       int cols=sheet.getRow(1).getLastCellNum();
        System.out.println(cols);

        //String c=sheet.getRow(1).getCell(1).getStringCellValue();
        System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());
        //System.out.println(sheet.getRow(1).getCell(1).getNumericCellValue());

        //to print all values in excel

        for(int i=0;i<=row;i++)
        {
            for(int j=0;j<=cols-1;j++)
            {
                System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
            }
        }
    }
}
