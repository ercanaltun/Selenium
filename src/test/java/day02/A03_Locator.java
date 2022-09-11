package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A03_Locator {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/recources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //amazon sayfasına git
        driver.get("https://amazon.com");
        driver.manage().window().fullscreen();

        //amazon sitesinde findElement(By,id) methoduyla asus u çağırın
        WebElement arananId = driver.findElement(By.id("twotabsearchtextbox"));
       arananId.sendKeys("asus"+ Keys.ENTER);
       Thread.sleep(6000);

        //amazon sitesinde findElement(By,name) methoduyla laptop u çağırın
        WebElement aranacak=driver.findElement(By.name("field-keywords"));
        aranacak.sendKeys(" laptop",Keys.ENTER);

        //amazon sitesinde findElement(By,class) methoduyla 17,3 ü  çağırın
        // WebElement kelime=driver.findElement(By.className("nav-input nav-progressive-attribute"));
        //kelime.sendKeys("17,3"+Keys.ENTER);
        //çalışmadı çünkü class isminden 2 tane vardı.Yani uniqeu değildi


    }
}
