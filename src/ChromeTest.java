import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class ChromeTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/sserdiuk/workspace/amazing/toDelete/try_solo_testng/resoureces/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();

//        Map<String, String> mobileEmulation = new HashMap<>();
//        mobileEmulation.put("deviceName", "Nexus 5");
//
//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
//        WebDriver driver = new ChromeDriver(chromeOptions);


        driver.get("https://google.com");

        try {
            WebElement btnContinue = driver.findElement(By.xpath("//*[@class='WrNOuc']"));
            while (btnContinue.isDisplayed()) {
                btnContinue.click();
                Thread.sleep(500);
            }
        } catch (Exception ex) {
            System.out.println("element not found");
        }

        WebElement btnAccept = driver.findElement(By.xpath("//*[@id='L2AGLb']"));
        Thread.sleep(5_000);
        btnAccept.click();

        WebElement etSearchField = driver.findElement(By.xpath(".//*[@name='q']"));
        etSearchField.sendKeys("Selenium");
        Thread.sleep(5_000);
        etSearchField.submit();
        Thread.sleep(5_000);
        System.out.println("Page title is: " + driver.getTitle());
        driver.quit();
    }

    enum Drivers {
        WEB_CHROME, MOBILE_CHROME, FF, FF_MOB
    }
}
