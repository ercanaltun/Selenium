package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A02_Homework2 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/recources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

   /*
        1-Yeni bir class olusturun (TekrarTesti)
2. Akakce web sayfasına gidin ve sayfa başlığının "akakce" olup olmadığını doğrulayın
(verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
3. Sayfa URL'sinin "akakce" içerip içermediğini (contains) doğrulayın, içermiyorsa doğru
URL'yi yazdırın.
4. Daha sonra Cimri sayfasina gidin https://www.cimri.com/
5. Akakce sayfasina geri donun
6. Sayfayi yenileyin
7. Cimri sayfasina donun
8. Sayfayi tamsayfa yapin
9. Ardından sayfa başlığının "Cimri" içerip içermediğini (contains) doğrulayın, Yoksa
doğru başlığı(Actual Title) yazdırın.
10.Sayfa URL'sinin https://www.cimri.com/ olup olmadığını doğrulayın, degilse doğru
URL'yi yazdırın
11.Sayfayi kapatin
         */

        // 2. Akakce web sayfasına gidin ve sayfa başlığının "akakce" olup olmadığını doğrulayın
        //(verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.get("https://akakce.com");
        String title="akakce";
        if (driver.getTitle().contains(title)){
            System.out.println("Actual Title(akakce) : TEST PASSED");
        }else{
            System.out.println("Actual Title(akakce) : TEST FAILED");
        }
        System.out.println("Actual Title(Akakce) : "+driver.getTitle());


       // 3. Sayfa URL'sinin "akakce" içerip içermediğini (contains) doğrulayın, içermiyorsa doğru
        // URL'yi yazdırın.
        String url="akakce";
        if (driver.getCurrentUrl().contains(url)){
            System.out.println("Actual Url(akakce) : TEST PASSED");
        }else{
            System.out.println("Actual Url(akakce) : TEST FAILED");

        }
        // 4. Daha sonra Cimri sayfasina gidin https://www.cimri.com/
          driver.get("https://www.cimri.com");
          Thread.sleep(5000);

        // 5. Akakce sayfasina geri donun
          driver.navigate().back();
          Thread.sleep(5000);

        // 6. Sayfayi yenileyin
          driver.navigate().refresh();
          Thread.sleep(5000);


        // 7. Cimri sayfasina donun
          driver.navigate().forward();
          Thread.sleep(5000);

        // 8. Sayfayi tamsayfa yapin
          driver.manage().window().fullscreen();

        // 9. Ardından sayfa başlığının "Cimri" içerip içermediğini (contains) doğrulayın, Yoksa
        //doğru başlığı(Actual Title) yazdırın.
          String baslik="Cimri";
          if (driver.getTitle().contains(baslik)){
              System.out.println("Actual Title(Cimri) : TEST PASSED");
          }else{
              System.out.println("Actual Title(Cimri) : TEST FAILED");

          }
        // 10.Sayfa URL'sinin https://www.cimri.com/ olup olmadığını doğrulayın, degilse doğru
        //URL'yi yazdırın
          String url2="https://www.cimri.com";
          if (driver.getCurrentUrl().contains(url2)){
              System.out.println("Actual Url( https://www.cimri.com) : TEST PASSED");
          }else{
              System.out.println("Actual Url(https://www.cimri.com) : TEST FAILED");}

        //11.Sayfayi kapatin
              driver.close();









    }

}
