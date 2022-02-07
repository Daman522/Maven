import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmAlert {

    public static void main(String args[]) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/cm/Downloads/Confirmation.html");
        driver.findElement(By.xpath("//button[text()='Click on me']")).click();
        Thread.sleep(300);
        //driver.switchTo().alert().accept();
        driver.switchTo().alert().dismiss();
    }

}
