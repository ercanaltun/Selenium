package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A06_Locator4 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/recources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://akakce.com");
        driver.manage().window().maximize();

        String title="Akakce";
        if (driver.getTitle().contains(title)){
            System.out.println("Actual Title : TEST PASSED");
        }else{
            System.out.println("Actual Title : TEST FAILED");
        }

        String url="Akace";
        if (driver.getCurrentUrl().contains(url)){
            System.out.println("Actual Url : TEST PASSED");
        }else{
            System.out.println("Actual Url : TEST FAILED");
        }

        WebElement searchword=driver.findElement(By.id("q"));
        searchword.sendKeys("casper excalibur laptop", Keys.ENTER);


        WebElement araniyor=driver.findElement(By.name("q"));
        araniyor.sendKeys(" RTX3050TI"+Keys.ENTER);

    }
}
