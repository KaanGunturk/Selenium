package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_IlkTest {
    public static void main(String[] args) {

        /*
        1-https://www.amazon.com url'ine gidin.
        2-Basligin Amazon kelimesi icerdigini test edin.
        3-Url'in https://www.amazon.com/ esit oldugunu test edin.
        4-Sayfayi kapatin

         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 1-https://www.amazon.com url'ine gidin.
        driver.get("https://www.amazon.com");

        // 2-Basligin Amazon kelimesi icerdigini test edin.
        String actualTitle = driver.getTitle();
        String aranankelime="";


        if (actualTitle.contains("Amazon")){
            System.out.println("Title testi PASSED");
        }else{
            System.out.println("Title "  + aranankelime + "'yi icermiyor , title testi FAİLED");
        }

        //3-Url'in https://www.amazon.com esit oldugunu test edin.
        String actualUrl= driver.getCurrentUrl();
        String expectedUrl="https://www.amazon.com/";

        if (actualUrl.equals(expectedUrl)){
            System.out.println("Url testi Passed ");
        }else{
            System.out.println("actual url : " + actualUrl + " 'yi icermiyor test Failed" );
        }

        //4-Sayfayi kapatin
        driver.close();

    }
}
