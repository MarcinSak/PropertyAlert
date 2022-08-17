import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {
    WebDriver driver;
    @Test
    public void mainTest(){
        driver.get("https://www.otodom.pl/");
    }
    @BeforeEach
    public void before(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedrivers/chromedriver.exe");
        driver = new ChromeDriver();
    }
    @AfterEach
    public void after(){
        driver.quit();
    }
}
