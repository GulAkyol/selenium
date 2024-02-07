package day01_driveOlusturma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c01_IlkOtamasyon {
    public static void main(String[] args) {

         /*
            1- Web otomasyonu yapmak icin olusturdugumuz her class'da
               bir WebDriver objesi olusturmak ZORUNDAYIZ

               bu objeyi Java consept'lerini kullanarak
               farkli sekillerde olusturabilir veya inherit edebiliriz
               AMMA WebDriver objesi OLMADAN test otomasyonu OLMAZ

            2- Selenium son versiyonlarinda kendi WebDriver'ini olusturdu
               Boylece System.setproperty() kullanmasaniz da
               Selenium kendi WebDriver'i ile otomasyonu gerceklestirir

               Sirketlerde kendi satinaldiklari WebDriver'i kullanma Olasiligi olacagindan
               biz de bu satiri yazacagiz

           3- WebDriver driver = new ChromeDriver();
              satirini yazdigimizda, bir WebDriver objesi olusturulur
              bu obje sayesinde WebDriver method'larini kullanabiliriz
              C:\Users\hatic\Masaüstü\team130_Selenium\src\kurulumdosyalari\msedgedriver.exe
              src/kurulumdosyalari/msedgedriver.exe
         */

        System.setProperty("WebDriver.chrome.driver","src/kurulumdosyalari/msedgedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.testotomasyonu.com");
    }
}
