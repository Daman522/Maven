import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttributeTest {

    public static void main(String args[]) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/index.php?route=account/login");
        driver.findElement(By.name("email")).sendKeys("Daman");
        String actual=driver.findElement(By.name("email")).getAttribute("value");//it is used to get runtime value
        //tht the value which v enter from sendkeys is equal to value which is in getattribute
        System.out.println(actual);

        if(actual.equals("dann"))
        {
            System.out.println("pass");
        }
        else
        {
            System.out.println("fail");
        }
    }

}
