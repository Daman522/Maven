import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollupDown {

    public static void main(String args[]) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.opencart.com/");

        JavascriptExecutor js=(JavascriptExecutor) driver;
        Thread.sleep(3000);
        js.executeScript("window.scrollTo(0,400)");
        js.executeScript("alert('hello')");//v cn perfrm any js operation in executeScript
    }
}
