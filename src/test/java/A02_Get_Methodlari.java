import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A02_Get_Methodlari {
    public static void main(String[] args) {

     /*


Amazon sayfasina gidelim. https://www.amazon.com/
Sayfa basligini(title) yazdirin
Sayfa basliginin “Amazon” icerdigini test edin
Sayfa adresini(url) yazdirin
Sayfa url’inin “amazon” icerdigini test edin.
Sayfa handle degerini yazdirin
Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
Sayfayi kapatin
      */

        System.setProperty("webdriver.chrome.driver", "src/recources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        //1Adım:Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://amazon.com");


        //2.Adım:Sayfa basligini(title) yazdirin
        System.out.println("Actual Title" + driver.getTitle());


        //3.Adım:Sayfa basliginin “Amazon” icerdigini test edin
        String kelime = "Amazon";
        if (driver.getTitle().contains(kelime)) {
            System.out.println("Actual Title : Test PASSED");
        } else {
            System.out.println("Actual Title : Test FAILED");
        }

        //4.Adım:Sayfa adresini(url) yazdirin
        System.out.println(driver.getCurrentUrl());


        //5.Adım:Sayfa url’inin “amazon” icerdigini test edin.
        String bakilacakKelime = "amazon";
        if (driver.getCurrentUrl().contains(bakilacakKelime)) {
            System.out.println("Actual Url : Test PASSED");
        } else {
            System.out.println("Actual Url : Test FAILED");
        }

        //6.Adım:Sayfa handle degerini yazdirin
        System.out.println(driver.getWindowHandle());


        //7.Adım:Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        String arananKelime = "Gateway";
        if (driver.getPageSource().contains(arananKelime)) {
            System.out.println("PageSource : Test PASSED");
        } else {
            System.out.println("PageSource : Test FAILED");

        //8.Adım:Sayfayi kapatin
            driver.close();
        }
    }
}
