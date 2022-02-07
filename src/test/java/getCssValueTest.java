import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCssValueTest {

    public static void main(String args[]) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/index.php?route=account/login");
        String c=driver.findElement(By.xpath("//input[@value='Login']")).getCssValue("background-color");
        System.out.println(c);

        //getcss give css value of tht
    }

}
