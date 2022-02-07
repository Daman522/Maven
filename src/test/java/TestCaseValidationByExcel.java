import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestCaseValidationByExcel {

    public static void main(String[] args) throws FileNotFoundException {
        String path= System.getProperty("user.dir");
        String other=path+"\\Book2.xlsx";
        System.out.println(other);
        FileInputStream fin=new FileInputStream(other);

        Xls_Reader xl=new Xls_Reader(other);
        int row=xl.getRowCount("Sheet1");
        System.out.println(row);
        String id=xl.getCellData("Sheet1","Testid",2);
        System.out.println(id);
        String url=xl.getCellData("Sheet1","URL",2);
        System.out.println(url);
        String uname=xl.getCellData("Sheet1","username",2);
        System.out.println(uname);
        String pwd=xl.getCellData("Sheet1","password",2);
        System.out.println(pwd);



        for(int i=2;i<=row;i++)
        {
            if(id.equals("LF_001"))
            {
                WebDriverManager.chromedriver().setup();
                WebDriver driver=new ChromeDriver();
                driver.get(url);
                driver.findElement(By.name("email")).sendKeys(uname);
                driver.findElement(By.name("password")).sendKeys(pwd);
                driver.findElement(By.xpath("//input[@value='Login']")).click();
                Boolean b=driver.findElement(By.xpath("//div[text()=' Warning: No match for E-Mail Address and/or Password.']")).isDisplayed();

                if(b)
                {
                    xl.setCellData("Sheet1","Status",2,"Testcasepassed");
                }
                else
                {
                    xl.setCellData("Sheet1","Status",2,"TestcaseFAILED");

                }
            }
        }
    }
}
