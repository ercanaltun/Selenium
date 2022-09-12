package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class A07_Locator5 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/recources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.get("https://amazon.com");
        WebElement istenenKelime= driver.findElement(By.name("field-keywords"));
        istenenKelime.sendKeys("asus Tuf"+ Keys.ENTER);

      driver.close();











    }
}
