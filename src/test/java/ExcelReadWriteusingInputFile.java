public class ExcelReadWriteusingInputFile {
    public static void main(String args[])
    {
        String path= System.getProperty("user.dir");
        String other=path+"\\Book1.xlsx";
        System.out.println(other);
        Xls_Reader xl= new Xls_Reader(other);
        int row =xl.getRowCount("Sheet1");
        System.out.println(row);
        String unme=xl.getCellData("Sheet1","username",2);
        System.out.println(unme);

        String otp=xl.getCellData("Sheet1","Otp",2);
        System.out.println(otp);

        xl.setCellData("Sheet1","Status",2,"pass");

    }
}
