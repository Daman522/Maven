import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckboxTest {
    public static void main(String args[])
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Checkboxes")).click();


        //WebElement el =driver.findElement(By.linkText("Checkboxes")); //other way using webelement variable
        //el.click();


        //when two or morehave same property we use findelements
        List <WebElement> lst =driver.findElements(By.xpath("//input[@type='checkbox']"));
        lst.get(0).click();
        System.out.println(lst.size());
    }
}
