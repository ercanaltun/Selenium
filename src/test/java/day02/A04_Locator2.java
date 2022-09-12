package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class A04_Locator2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/recources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //n11.com a git
        driver.get("https://n11.com");
        Thread.sleep(5000);

        //id ile casper ı arat
        WebElement aranacak=driver.findElement(By.id("searchData"));
        aranacak.sendKeys("casper"+ Keys.ENTER);
        driver.manage().window().maximize();
        Thread.sleep(6000);

        //tag i input olanın sayısını yazdır
        List<WebElement> tag=driver.findElements(By.tagName("input"));
        System.out.println("tag sayısı : "+tag.size());

        driver.close();


    }
}
