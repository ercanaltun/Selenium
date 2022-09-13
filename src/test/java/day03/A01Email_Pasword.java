package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class A01Email_Pasword {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/recources/drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        /*
        Main method oluşturun ve aşağıdaki görevi tamamlayın.
        a. http://a.testaddressbook.com adresine gidiniz.
        b. Sign in butonuna basin
        c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        i. Username : testtechproed@gmail.com
        ii. Password : Test1234!
        e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        3. Sayfada kac tane link oldugunu bulun.
        4.Sayfadaki link isimlerini yazdırın
         */

        //http://a.testaddressbook.com
        driver.get("http://a.testaddressbook.com");
        Thread.sleep(300);

        //b. Sign in butonuna basin
        driver.findElement(By.id("sign-in")).click();
        Thread.sleep(3000);

        //c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        WebElement emailTextBox = driver.findElement(By.id("session_email"));
        WebElement passwordTextBox = driver.findElement(By.id("session_password"));
        WebElement signinButton = driver.findElement(By.name("commit"));

        // d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        // i. Username : testtechproed@gmail.com
        emailTextBox.sendKeys("testtechproed@gmail.com");
        Thread.sleep(2000);

        // ii. Password : Test1234!
        passwordTextBox.sendKeys("Test1234!");
        Thread.sleep(2000);

        // iii.(sign in)buttonunu tıklayın:
        signinButton.click();

        //  e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        String expectedUser="testtechproed@gmail.com";
        WebElement actualUser=driver.findElement(By.xpath("//*[@class='navbar-text']"));
        if (actualUser.getText().equals(expectedUser)){
            System.out.println("Actual User Test PASSED");
        }else{
            System.out.println("Actual User Test FAILED");
        }

        // f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        //Addresses:
        WebElement addresses = driver.findElement(By.xpath("//*[text()='Addresses']"));
        if (addresses.isDisplayed()){
            System.out.println("Addresses Test PASSED");
        }else{
            System.out.println("Addresses Test FAILED");
        }
        //Sign Out:
        WebElement signOut = driver.findElement(By.xpath("//*[text()='Sign out']"));
        if (signOut.isDisplayed()){
            System.out.println("Sign Out Test PASSED");
        }else{
            System.out.println("Sign Out Test FAILED");
        }

        //3. Sayfada kac tane link oldugunu bulun.
        List<WebElement>linkSayisi = driver.findElements(By.tagName("a"));
        System.out.println("Link Sayisi : "+linkSayisi.size());


        // 4.Sayfadaki link isimlerini yazdırın
        //1:Yol:
        for (WebElement each2:linkSayisi
             ) {
            System.out.println("Link isimleri : "+each2.getText());
        }

        //2.Yol:
     linkSayisi.forEach(t-> System.out.println("Lambda ile Link isimleri : "+t.getText()));
        driver.quit();

















    }
}
