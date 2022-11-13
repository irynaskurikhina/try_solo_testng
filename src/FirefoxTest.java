import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "/Users/serhii/Downloads/tmp_demo/lesson3/resource/geckodriver");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://google.com");

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
}
