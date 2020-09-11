package comTechproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Day07_IlkDers {

    public static void main(String[] args) {

        // Browserları kullanabilmek için WebDriverManager kütüphanesini kullanıyor.
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com");
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("samsung headphones" + Keys.ENTER);
        //aramaKutusu.submit();
        WebElement sonucSayisi = driver.findElement(By.xpath("//span[@dir='auto']"));
        System.out.println(sonucSayisi.getText());

        WebElement ilkSonuc = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
        System.out.println(ilkSonuc.getText());

        List<WebElement> tumSonuc = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
        //tumSonuc.get(4).getText(); 4. siradaki elemanin basligini alir


        for(WebElement w : tumSonuc) {
            System.out.println(w.getText());
        }
        }
    }
