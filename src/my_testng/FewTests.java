package my_testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class FewTests {
    WebDriver driver;
    @BeforeMethod
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "/home/sserdiuk/workspace/amazing/toDelete/try_solo_testng/resoureces/chromedriver_linux64/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void googleTest() throws InterruptedException {
        driver.get("https://google.com");
        Thread.sleep(5_000);
        System.out.println("I'm a google test");
        Assert.assertTrue(driver.getCurrentUrl().contains("google"));
    }

    @Test
    public void duckDuckGo() throws InterruptedException {
        driver.get("https://duckduckgo.com");
        Thread.sleep(5_000);
        System.out.println("I'm a duckduckgo test");
        Assert.assertTrue(driver.getCurrentUrl().contains("duckduckgo"));
    }

    @AfterMethod
    public void shutDown() {
        driver.quit();
    }
}
