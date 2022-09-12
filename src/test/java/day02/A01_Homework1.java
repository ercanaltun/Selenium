package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A01_Homework1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/recources/drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();

                /*
        1.Yeni bir class olusturalim (Homework)
2.ChromeDriver kullanarak, trendyol sayfasina gidin ve sayfa basliginin (title) "trendyol"
oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
3.Sayfa URL'inin "trendyol" kelimesi icerdigini dogrulayin, icermiyorsa "actual" URL'i
yazdirin.
4.https://www.n11.com/ sayfasina gidin.
5. Sayfa basliginin "N11.com" icerdigini dogrulayin.
6. Tekrar "trendyol" sayfasina donun
7. Sayfayi yenileyin
8. Sayfayi tam sayfa (maximize) yapin
9.Browser'i kapatin
         */

        //2.ChromeDriver kullanarak, trendyol sayfasina gidin ve sayfa basliginin (title) "trendyol"
        //oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        driver.get("https://trendyol.com");
        String title="trendyol";
        if (driver.getTitle().contains(title)){
            System.out.println("Actual Title : TEST PASSED");
        }else{
            System.out.println("Actual Title(trendyol) : TEST FAILED");
        }
        System.out.println("Actual Title(Trendyol) : "+driver.getTitle());

        //3.Sayfa URL'inin "trendyol" kelimesi icerdigini dogrulayin, icermiyorsa "actual" URL'i
        //yazdirin.
        String url="trendyol";
        if (driver.getCurrentUrl().contains(url)){
            System.out.println("Actual Url(trendyol) : TEST PASSED");
        }else{
            System.out.println("Actual Url : TEST FAILED");
        }

        //4.https://www.n11.com/ sayfasina gidin.
        driver.get("https://www.n11.com");


        //5. Sayfa basliginin "N11.com" icerdigini dogrulayin.
        String baslik="N11.com";
        if (driver.getCurrentUrl().contains(baslik)){
            System.out.println("Actual Url : TEST PASSED");
        }else{
            System.out.println("Actual Url(N11.com) : TEST FAILED");

        }
        System.out.println("Actual Url(n11.com) : "+driver.getCurrentUrl());
        //6. Tekrar "trendyol" sayfasina donun
        driver.navigate().back();
        Thread.sleep(5000);

        //7. Sayfayi yenileyin
        driver.navigate().refresh();
        Thread.sleep(5000);

        //8. Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().maximize();
        Thread.sleep(5000);

        //9.Browser'i kapatin
        driver.close();








    }
}
