import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTest {

    public static void main(String args[])
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Dropdown")).click();
        //driver.findElement(By.id("dropdown")).sendKeys("Option 2");

        //mostly use select class for dropdown its good way to use as compare to sendkeys
        Select sel=new Select(driver.findElement(By.id("dropdown")));
        sel.selectByIndex(1);
        sel.selectByVisibleText("Option 1");
        sel.selectByValue("2");
    }
}
