import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ImplicityWaitTest {

    public static void main(String args[]) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//it increase the wait time

        driver.get("3");
        driver.findElement(By.linkText("Dynamic Loading")).click();
        driver.findElement(By.linkText("Example 2: Element rendered after the fact")).click();
        driver.findElement(By.xpath("//button[text()='Start']")).click();
        Thread.sleep(10000);// ths is staic wait

        //WebDriverWait wt=new WebDriverWait(driver,30); //explicity wait it is conditionl wait
        //wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Hello World!']")));
       List<WebElement>lst=driver.findElements(By.xpath("//*[text()='Hello World!']"));
        System.out.println(lst.size());
        //System.out.println(lst.getText());

    }
}