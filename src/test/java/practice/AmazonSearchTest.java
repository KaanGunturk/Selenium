package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AmazonSearchTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //a. google web sayfasina gidin. https://www.amazon.com
        driver.get("https://www.amazon.com");

        //b Search "city bike" ----Burada yazma sirasi onemli arama kutusunu doldurmadan calismadi
        WebElement aramaKutusu =driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike");
        WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
        searchButton.click();

        /*
        c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        1-16 of 125 results for "city bike" --->>> amazonda bulunan bu yazıyı xpath olarak aldık--->>> *[@id="search"]/span/div/h1/div/div[1]/div/div/span[1]
         */
        WebElement sonucSayisi = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[1]"));
        String[] sonucSayisiArr=sonucSayisi.getText().split(" ");
        System.out.println(sonucSayisiArr[2]);

        /*
        System.out.println(viewResults.getText()); Bu şekilde yazdırırsak sonucu 1-16 of 138 results for "city bike" bu verir ama biz sadece 138'i istiyoruz
        O yüzden sonucu bir array'e atayarak boşluklarından ayırdık ve 2. index olan istediğimiz sonucu aldık
         */

        WebElement ilkUrun = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/div/div/div/div/div[1]/div/div[2]/div/span/a/div/img"));
        ilkUrun.click();

        driver.close();




    }
}
