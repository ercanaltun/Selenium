import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A03_Navigate_Methodlari {

    public static void main(String[] args) throws InterruptedException {

     System.setProperty("webdriver.chrome.driver","src/recources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
/*
Yeni bir Class olusturalim.C05_NavigationMethods
Youtube ana sayfasina gidelim . https://www.youtube.com/
Amazon soyfasina gidelim. https://www.amazon.com/
Tekrar YouTube’sayfasina donelim
Yeniden Amazon sayfasina gidelim
Sayfayi Refresh(yenile) yapalim
Sayfayi kapatalim / Tum sayfalari kapatalim
 */
        driver.manage().window().maximize();
        //1:Adım:Youtube ana sayfasina gidelim . https://www.youtube.com/
        driver.get("https://youtube.com");
        Thread.sleep(5000);

        //2.Adım:Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://amazon.com");
        Thread.sleep(5000);


        //3:Adım:Tekrar YouTube’sayfasina donelim
        driver.navigate().back();
        Thread.sleep(5000);

        //4.Adım:Yeniden Amazon sayfasina gidelim
        driver.navigate().forward();
        Thread.sleep(5000);

        //5.Adım:Sayfayi Refresh(yenile) yapalim
        driver.navigate().refresh();
        Thread.sleep(5000);

        //6.Adım:Sayfayi kapatalim / Tum sayfalari kapatalim
        driver.close();






    }
}
