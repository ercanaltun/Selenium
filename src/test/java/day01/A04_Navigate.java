package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A04_Navigate {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/recources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://akakce.com");
        driver.manage().window().maximize();

        //Soru-1:title "Akakce" içerdiğini test et
        String str="Akakce";
        if (driver.getTitle().contains(str)){
            System.out.println("Actual Title = Test PASSED");
        }else {
            System.out.println("Actual Title = Test FAILED");
        }

        //Soru-2:Url'in  akakce içerdiğini test et
        String str2="akakce";
        if (driver.getCurrentUrl().contains(str2)){
            System.out.println("Actual Url : Test PASSED");
        }else{
            System.out.println("Actual Url : Test FAILED");
        }

        //Soru-3:5sn sonra cimri.com a git
        Thread.sleep(5000);
        driver.navigate().to("https://cimri.com");
        Thread.sleep(5000);


        //Soru-4:yeniden akaakce.com a git
        driver.navigate().back();
        Thread.sleep(5000);

        //Soru-5:yeniden cimri.com'a dön 5sn sonra sayfayı yenile ve sayfayı kapat
        driver.navigate().forward();
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);

        driver.close();

    }
}
