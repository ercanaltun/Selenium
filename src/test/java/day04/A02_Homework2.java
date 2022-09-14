package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class A02_Homework2 {

    public static void main(String[] args) throws InterruptedException {

                /*
      1- https://www.amazon.com/ adresine gidin
      2- Browseri tam sayfa yapin
      3- Sayfayi “refresh” yapin
      4- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
      5-Gift Cards sekmesine basin
      6- Birthday butonuna basin
      7- Best Seller bolumunden ilk urunu tiklayin
      8- Gift card details’den 25 $’i secin
      9-Urun ucretinin 25$ oldugunu test edin
      10-Sayfayi kapatin
         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    //1- https://www.amazon.com/ adresine gidin
        driver.get(" https://www.amazon.com");

    //2- Browseri tam sayfa yapin
        driver.manage().window().maximize();
        Thread.sleep(1000);

    //3- Sayfayi “refresh” yapin
        driver.navigate().refresh();

    //4- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        if (driver.getTitle().contains("Spend less")){
            System.out.println("Actual Title : Test PASSED");
        }else{
            System.out.println("Actual Title : Test FAILED");
        }
    //5-Gift Cards sekmesine basin
        WebElement giftCards = driver.findElement(By.xpath("//*[text()='Gift Cards']"));
        giftCards.click();
        Thread.sleep(1000);

    //6- Birthday butonuna basin
        WebElement birthday= driver.findElement(By.xpath("//*[@alt='Birthday gift cards']"));
        birthday.click();
        Thread.sleep(1000);

    //7- Best Seller bolumunden ilk urunu tiklayin
        WebElement seller= driver.findElement(By.linkText("Best Sellers"));
        seller.click();
        Thread.sleep(1000);
        WebElement ilkUrun = driver.findElement(By.xpath("//*[@alt='Amazon.com eGift Card']"));
        ilkUrun.click();

    // 8- Gift card details’den 25 $’i secin
        WebElement gift25Dolar= driver.findElement(By.xpath("(//*[@id='gc-mini-picker-amount-1'])[1]"));
        gift25Dolar.click();

    //9-Urun ucretinin 25$ oldugunu test edin
        WebElement actualUcret=driver.findElement(By.xpath("//*[@id='gc-live-preview-amount']"));
        if (actualUcret.isDisplayed()){
            System.out.println("Actual Ucret : Test Passed");
        }else   System.out.println("Actual Ucret : Test Failed");
        Thread.sleep(2000);

    //Sayfayı kapat
    driver.quit();






















    }
}
