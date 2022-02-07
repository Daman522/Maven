import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
    public static void main(String args[]) throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        Properties prop = new Properties();
        FileInputStream fl= new FileInputStream("C:\\Users\\cm\\IdeaProjects\\Maven\\Testdata.properties");

        prop.load(fl);
        System.out.println(prop.getProperty("url"));
        String u=prop.getProperty("url");

        String unme=prop.getProperty("username");
        System.out.println(unme);

        driver.get(u);
        driver.findElement(By.name("email")).sendKeys(unme);

        //in ths v use properties file to read the test data
        //create properties file with extension of .properties


        //to write in properties file

        FileOutputStream op= new FileOutputStream("C:\\Users\\cm\\IdeaProjects\\Maven\\Testdata.properties");
        prop.setProperty("password","abcdddd");
        prop.store(op,"c");

    }

}
