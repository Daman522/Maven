import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleelemntExceptn {

    public static void main(String args[]) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/index.php?route=account/login");
        WebElement c=driver.findElement(By.name("email"));
        c.sendKeys("daman");
        driver.navigate().refresh();
        Thread.sleep(2000);
        c.sendKeys("sss");

        //ths gives stale element bcz after referesings its not availble in dom



    }

}
