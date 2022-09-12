package day01;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A0 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/recources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://amazon.com");

        String aranacakKelime="amazon";
        if (driver.getCurrentUrl().contains(aranacakKelime)) {
            System.out.println("Actual Url : Test Passed");
        }else{
            System.out.println("Actual Url : Test Failed");
        }

        driver.manage().window().maximize();
        String title="Amazon";
        if (driver.getTitle().contains(title)){
            System.out.println("Actual Title : Test Passed");
        }else{
            System.out.println("Actual Title : Test Failed");
        }

         driver.get("https://akakce.com");

         driver.navigate().back();
         Thread.sleep(5000);

         driver.navigate().forward();
         Thread.sleep(5000);

         driver.get("https://n11.com");
         WebElement aranacak=driver.findElement(By.id("searchData"));
         aranacak.sendKeys("dell Insprion",Keys.ENTER);


       driver.close();


    }

}
