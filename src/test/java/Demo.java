import org.testng.annotations.*;

public class Demo {

    @Test
    public void FirstTestCase() {
        System.out.println("This is first testcase");
    }

    @Test
    public void SecondTestCase() {
        System.out.println("This is second testcase");

    }
    @BeforeTest
    public void beforetest()
    {
        System.out.println("Before Test");
    }

    @AfterTest
    public void aftertest()
    {
        System.out.println("After Test");
    }

    @BeforeSuite
    public void beforesuite()
    {
        System.out.println("Before Suite");
    }

    @AfterSuite
    public void aftersuite()
    {
        System.out.println("After Suite");
    }

}
