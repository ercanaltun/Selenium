package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A05_Locator3 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/recources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Trendyol a git
        driver.get("https://amazon.com");
        driver.manage().window().maximize();

        //Amazonun html inde id ile dell arat maximaze de
        driver.manage().window().maximize();
        WebElement aranacak =driver.findElement(By.id("twotabsearchtextbox"));
        aranacak.sendKeys("dell"+ Keys.ENTER);

        //dell yanın da Insprion arat
        WebElement kelime =driver.findElement(By.name("field-keywords"));
        kelime.sendKeys(" Insprion"+Keys.ENTER);

        //Xpath ile
        System.out.println(driver.findElement(By.xpath("(//*[@class='nav-input nav-progressive-attribute'])[2]")));


    }
}
