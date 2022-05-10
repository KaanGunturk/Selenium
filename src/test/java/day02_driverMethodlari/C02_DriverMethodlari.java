package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodlari {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().
                maximize();// Tam sayfa yapar

        driver.get("https://www.amazon.com");

        System.out.println(driver.getTitle());//Amazon.com. Spend less. Smile more.

        System.out.println(driver.getCurrentUrl());//https://www.amazon.com/

        driver.close();

    }
}
