package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class A03_Homework3 {
    public static void main(String[] args) throws InterruptedException {

             /*
    1-https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
    2- Add Element butonuna 10 kez basinız
    3- 10 kez Add element butonuna basıldığını test ediniz
    4 - Delete butonuna görünmeyene kadar basınız
    5- Delete butonunun görünmediğini test ediniz
    6- Sayfayı kapatınız
     */
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    //1-https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
       driver.get("https://the-internet.herokuapp.com/add_remove_elements/ ");
       Thread.sleep(2000);

    // 2- Add Element butonuna 10 kez basinız
        WebElement addElement=driver.findElement(By.xpath("//*[text()='Add Element']"));
        for (int i = 0; i < 10; i++) {
            addElement.click();
        }
        Thread.sleep(2000);

     //3- 10 kez Add element butonuna basıldığını test ediniz

        List<WebElement>elementeOnkezClick=driver.findElements(By.xpath("//*[text()='Delete']"));

        if (elementeOnkezClick.size()==10){
            System.out.println("Actual Click Add Element Button:Test Passed");
        }else System.out.println("Actual Click Add Element Button:Test Failed");

    // 4 - Delete butonuna görünmeyene kadar basınız
       // WebElement deleteOnKez=driver.findElement(By.xpath("//*[@class='added-manually']"));
        int sayac=10;
        while (sayac>0){
            driver.findElement(By.xpath("//*[@class='added-manually']")).click();
            sayac--;
        }

    //5- Delete butonunun görünmediğini test ediniz
        WebElement deleteButonu= driver.findElement(By.className("no-js"));
        if (deleteButonu.isDisplayed()){
            System.out.println("Actual Delete Button : Test Passed");
        }else System.out.println("Actual Delete Button : Test Failed");

    //6- Sayfayı kapatınız
        driver.quit();


















    }
}
