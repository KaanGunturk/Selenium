package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_GetPageSource {
    public static void main(String[] args) {



        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");

        String sayfaKaynakKodlari = driver.getPageSource();
        String arananKelime = "Gateway";

        // amazon sitesine gidip kaynak kodlarina "Gateway" yazdigini test edin.
        if (sayfaKaynakKodlari.equals(arananKelime)){
            System.out.println("kaynak kodu Testi PASSED");
        }else {
            System.out.println("Kaynak kodlarinda + " + arananKelime  + " yok Test Failed");
        }


    }
}
