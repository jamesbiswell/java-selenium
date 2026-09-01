package org.luv2code.O6_options_cookies_browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

public class CookiesTest {
    @Test
    public void cookiesTest() throws InterruptedException {

        // open first browser and get cookies
        WebDriverManager.chromedriver().setup();
        WebDriver driver1 = new ChromeDriver();
        driver1.manage().window().maximize();
        driver1.get("https://luv2test.com/");

        // click on toggle theme button
        Thread.sleep(2000);
        driver1.findElement(By.xpath("//button[@data-test='theme-toggle']")).click();
        Thread.sleep(2000);

        // get cookies from first session
        Set<Cookie> cookieSet = new HashSet<>(driver1.manage().getCookies());

        for (Cookie cookie : cookieSet){
            System.out.println("Saved cookie: " + cookie.getName() + " = " + cookie.getValue());
        }


        for (Cookie cookie : cookieSet){
            System.out.println("Domain: " + cookie.getDomain());
            System.out.println("Path: " + cookie.getPath());
            System.out.println("HttpOnly: " + cookie.isHttpOnly());
            System.out.println("Secure: " + cookie.isSecure());
        }

        driver1.quit();

        Thread.sleep(1000);

        // open new browser and reuse cookies
        WebDriver driver2 = new ChromeDriver();
        driver2.manage().window().maximize();
        driver2.get("https://luv2test.com/");

        // Add cookies to new session
        for(Cookie cookie : cookieSet) {
            driver2.manage().addCookie(new Cookie(cookie.getName(), cookie.getValue()));
        }

        Thread.sleep(2000);

        // refresh to apply cookies
        driver2.navigate().refresh();
        System.out.println("Cookies restored in new session");

        // delete cookie
        driver2.manage().deleteCookieNamed("theme");
        driver2.manage().deleteAllCookies();

        Thread.sleep(2000);

        driver2.navigate().refresh();

    }
}
