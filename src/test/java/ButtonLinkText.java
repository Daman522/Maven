import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonLinkText {
    public static void main(String args[])
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        //driver.findElement(By.linkText("Add/Remove Elements")).click(); //v give name showing in frontend in anchor tag
       // driver.findElement(By.xpath("//button[text()='Add Element']")).click();//v use text function here

        driver.findElement(By.linkText("Inputs")).click(); //v give name showing in frontend in anchor tag
        driver.findElement(By.xpath("//input[@type='number']")).sendKeys("1212");//v use text function here
    }
}
