package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.xml.sax.Locator;

import java.time.Duration;

public class C01_Locators {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

        //Amazona gidip nutella aratalim
        driver.get("https://www.amazon.com");

        // findElement(By ... Locator) ---> istedigimiz web elementini bize dondurur.
        // Biz de o WebElementini kullanmak ivin bir objeye assign ederiz
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox")); //--> id'ye gore

        // WebElement aramaKutusu = driver.findElement(By.className("nav-search-field ")); bu Locator calismadi

        //WebElement aramaKutusu=driver.findElement(By.name("field-keywords"));


        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);


    }
}
