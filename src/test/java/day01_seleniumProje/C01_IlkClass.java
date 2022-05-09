package day01_seleniumProje;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkClass {

    public static void main(String[] args) throws InterruptedException {

        /*
        Class'a otomasyon icin gerekli olan webdriverlarin yerini gostermemiz gerekir
        Bunun icin Java kutuphanesinden System.setProperty() methodu kullaniriz.
        Method 2 paremetre istemektedir.
        1. kullnacagimiz driver: webdriver.chrome.driver
        2. bu driverin fiziki yolu
         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");
        Thread.sleep(2000);

        driver.get("https://www.facebook.com");
        Thread.sleep(2000);

        driver.close();

    }
}
