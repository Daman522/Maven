import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyClass {

//    public WebDriver driver;
//
//
//    @BeforeMethod
//    public void setup()
//    {
//        //WebDriverManager.chromedriver().setup();
//        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/test/resources/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://demo.opencart.com/");
//    }
//
//    @AfterMethod
//    public void teardown()
//    {
//        driver.quit();
//    }
//
//
//
//
//
//    @BeforeMethod
//    public void setup()
//    {
//
//    }
//
//    @AfterMethod
//    public void teardown()
//    {
//
//    }
//


    @Test
    public void textverify(){
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/test/resources/chromedriver.exe");
        //System.out.println(System.getProperty("user.dir"));
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        String val = driver.findElement(By.xpath("//a[normalize-space()='Your Store']")).getText();
        Assert.assertEquals(val,"Your Store");
        System.out.println("Test Case Passed");
    }

    @Test
    public void Login(){
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/test/resources/chromedriver.exe");
        //System.out.println(System.getProperty("user.dir"));
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        String val = driver.findElement(By.xpath("//a[normalize-space()='Your Store']")).getText();
        Assert.assertEquals(val,"Your Store");
        System.out.println("Test Case Passed");
    }
}
