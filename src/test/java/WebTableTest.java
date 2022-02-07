import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebTableTest {

    public static void main(String args[])
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("file:///C:/Users/cm/Downloads/WbTable.html");
        List<WebElement>lst =driver.findElements(By.xpath("/html/body/table/tbody/tr"));
        int r=(lst.size());
        System.out.println(r);

        List<WebElement> lst1 =driver.findElements(By.xpath("/html/body/table/tbody/tr/th"));
        int c=lst1.size();
        System.out.println(c);

        for(int i=1;i<=r;i++);
        {
            for (int j=1;j<=c;j++);
            {
                //System.out.println(driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td["+j+"]")).getText());
            }
        }
    }
}
