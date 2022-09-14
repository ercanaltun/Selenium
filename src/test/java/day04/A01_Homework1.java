package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class A01_Homework1 {

    public static void main(String[] args) throws InterruptedException {

            /*


          a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
          b. Locate email textbox
          c. Locate password textbox ve
          d. Locate signin button
          e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
             i. Username : testtechproed@gmail.com
             ii. Password : Test1234!
     */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    // a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
        driver.get("http://a.testaddressbook.com/sign_in");
        Thread.sleep(3000);


    // b. Locate email textbox
        WebElement emailLocate = driver.findElement(By.id("session_email"));

    // c. Locate password textbox
        WebElement passwordLocate = driver.findElement(By.id("session_password"));

    //d. Locate signin button
        WebElement siginLocate = driver.findElement(By.name("commit"));

    //e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
    //i. Username : testtechproed@gmail.com
        emailLocate.sendKeys("testtechproed@gmail.com");
        Thread.sleep(3000);

    //ii. Password : Test1234!
        passwordLocate.sendKeys("Test1234!");
        Thread.sleep(3000);

        siginLocate.click();
        Thread.sleep(3000);


        driver.quit();























    }
}
