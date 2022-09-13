package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class A02TagName_Input_Olan {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/recources/drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        /*
        1- Amazon sayfasına gidin.
        2-Arama kutusunu locate ediniz
        3-Arama kutusunun tagname inin input olduğunu test ediniz
        4-Aramakutusunun name atributu'nun " field_keywords" olduğunu test ediniz
        5-Arama kutusunun konumunu yazdırın
        6-Sayfayı kapatınız
         */

        // 1- Amazon sayfasına gidin.
        driver.get("https://amazon.com");

        // 2-Arama kutusunu locate ediniz
        WebElement aramaBox=driver.findElement(By.id("twotabsearchtextbox"));

        //3-Arama kutusunun tagname inin input olduğunu test ediniz
        String expectedtagName="input";
        String actualTagname=aramaBox.getTagName();

        if (actualTagname.equals(expectedtagName)){
            System.out.println("Actual tagname=Test PASSED");
        }else{
            System.out.println("Actual tagname=Test FAILED");

        }
        //4-Aramakutusunun name atributu'nun " field_keywords" olduğunu test ediniz
        String expectedAtributName="field_keywords";
        String actualAtributName=aramaBox.getAttribute("name");
        if (actualAtributName.equals(actualAtributName)){
            System.out.println("Actual Atribute Name=Test PASSED");
        }else{
            System.out.println("Actual Atribute Name=Test FAILED");
        }

        //  5-Arama kutusunun konumunu yazdırın
        System.out.println("aramaBox.getLocation() = " + aramaBox.getLocation());

        //Sayfayı kapat
        driver.quit();


    }
}
