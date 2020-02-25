package home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageTest {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src//target//drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.autotrader.com");

        driver.findElement(By.className("btn-primary")).click();

        Thread.sleep(5000);

        driver.quit();

    }

}