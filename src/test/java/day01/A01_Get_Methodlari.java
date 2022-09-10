package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A01_Get_Methodlari {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/recources/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();


        driver.manage().window().maximize();
        driver.get("https://amazon.com");

        System.out.println("Actual Title: "+driver.getTitle());
        //Gidilen sitenin başlık yazısını getirir

        System.out.println("Actual Url : "+driver.getCurrentUrl());
        //Gidilen sayfanın Url'sini getirir

         // driver.getPageSource();
        // Gidilen sitenin kaynak kodlarını getirir


        //Soru-1:Gidilen sitenin başlığının amazon içerip içermediğini test ediniz
         driver.getTitle();
         String istenenKelime="Amazon";
         if (driver.getTitle().contains(istenenKelime)){
             System.out.println("İstenen kelime başlıkta var : Test PASSED");
         }else {
             System.out.println("İstenen kelime başlıkta yer almıyor : Test FAILED");
         }

         //Soru-1:Gidilen sitenin URL sinin amazon içerip içermediğini test ediniz
        driver.getCurrentUrl();
         String arananKelime="amazon";
         if (driver.getCurrentUrl().contains(arananKelime)){
             System.out.println("Aranan kelime url'de var : Test PASSED");
         }else {
             System.out.println("Aranan Kelime url'ede yok : Test FAILED");
         }


        driver.close();

    }


}
