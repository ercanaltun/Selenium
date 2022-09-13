package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class A03_City_Bike {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/recources/drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

       /*
        a. web sayfasına gidin. https://www. amazon.com/
        b. Search(ara) “city bike”
        c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın
         */

        // a. web sayfasına gidin. https://www. amazon.com/
        driver.get("https://amazon.com");

        // b. Search(ara) “city bike”
        WebElement arama=driver.findElement(By.name("field-keywords"));
        arama.sendKeys("city bike", Keys.ENTER);

        //c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        WebElement results=driver.findElement(By.xpath("//*[text()='1-16 of 109 results for']"));
        System.out.println("results.getText() = " + results.getText());

        // d. Sonra karşınıza çıkan ilk sonucun resmine tıklayın
        driver.findElement(By.xpath("//*[@class='s-image'][1]")).click();



    }
}
