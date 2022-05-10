package day02_driverMethodlari;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_Navigate {
    public static void main(String[] args) throws InterruptedException {

        /*
        Eger testimiz sirasinda birden fazla sayfa arasinda ileri geri hareket edeceksek
        driver.get() yerine driver.navigate().to() method'unu kullaniriz
        ve sonrasinda forward(), back() veya refresh() method'larini kullanabiliriz
         */
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(2000);

        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(2000);

        // Amazon'a geri donelim
        driver.navigate().back();
        Thread.sleep(2000);

        //Facebook'a gidelim
        driver.navigate().forward();
        Thread.sleep(2000);

        //Sayfayi refresh yapalim
        driver.navigate().refresh();
        Thread.sleep(2000);


        //sayfayi kapatalim
        driver.close();
    }
}
