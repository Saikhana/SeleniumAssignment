import java.util.Set;
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class HandleCookies {
    
    public static void main(String args[]) {
        MainPage mainPage = new MainPage(this.driver);
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        
        //For creating a new cookie we should pass the name of the cookie and its value
        Cookie cname = new Cookie("myCookie", "12345678999");
        this.driver.manage().addCookie(cname);
 
        //retrieve the cookies to view the newly added cookie
        Set<Cookie> cookiesList =  this.driver.manage().getCookies();
        for(Cookie getcookies :cookiesList) {
            System.out.println(getcookies );
        }
        this.driver.close();
    }
}