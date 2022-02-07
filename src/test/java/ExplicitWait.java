import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ExplicitWait {

    public static void main(String args[])
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Dynamic Loading")).click();
        driver.findElement(By.linkText("Example 2: Element rendered after the fact")).click();
        driver.findElement(By.xpath("//button[text()='Start']")).click();
        //driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

        WebDriverWait w= new WebDriverWait(driver,80);
        //w.until(ExpectedConditions.visibilityOfAllElements((WebElement) By.xpath("//*[text()='Hello World!']"));
        List <WebElement> lst =driver.findElements(By.xpath("//*[text()='Hello World!']"));
        //lst.get(0).click();// v have to use get whn v use elements
        System.out.println(lst.size());
    }
}
