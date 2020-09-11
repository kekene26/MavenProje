package comTechproed;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day09_Assertion {
    private static WebDriver driver;
    @BeforeClass
    public static void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

    }

    @Test
    public void test1() {
        driver.get("http://google.com");

        //google.com un basligi google arama sayfasi olsun
        String title = driver.getTitle();

        //google in tiitle sigoogle arama sayfasina esit mi degil mi
        Assert.assertEquals("GoogleArama Sayfasi", title);

    }
    @Test
    public void test2(){
        driver.get("http://amazon.com");
        //amazon.com un basligi Amazon kelimesini iceriyor olsun
        String title = driver.getTitle();

        boolean iceriyormu = title.contains("Amazon");

        //boolean veri tipinde veri giriyoruz
        Assert.assertTrue(iceriyormu);
    }
    @Test
    public void test3 () {
        driver.get("http://facebook.com");
        String title = driver.getTitle();
        // facebook.com un title si youtube kelimesini icermesin

        boolean iceriyormu = title.contains("youtube");

        Assert.assertFalse(iceriyormu);
    }
    @Test
    public void test4() {
        driver.get("http://google.com");
        String title = driver.getTitle();
        System.out.println("MERHABALAR");

        Assert.assertEquals("GoogleArama Sayfasi", title);

        System.out.println("test dogrulama islemi bitti");

    }
    @AfterClass
    public static void tearDown() {
       driver.quit();
    }
}
