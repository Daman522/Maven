import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOperation {

    public static void main(String args[]) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        Actions ac= new Actions(driver);
        ac.moveToElement(driver.findElement(By.xpath("//*[text()='Add-ons']"))).build().perform();
        Thread.sleep(300);
        driver.findElement(By.xpath("//*[text()='SpiceMAX']")).click();
    }
}
