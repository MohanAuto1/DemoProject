package browser.stock;

import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;
import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.http.ClientConfig;
import java.net.URL;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	 public static final String userName="mohanreddy_dIcTs7";
     public static final String passWord="G84YYbXscyheSxbxV82R";
     public static final String URL="https://"+userName+":"+passWord+"@hub-cloud.browserstack.com/wd/hub";
     public static void main( String[] args ) throws MalformedURLException {
     DesiredCapabilities caps = new DesiredCapabilities();

     caps.setCapability("os", "Windows");
     caps.setCapability("os_version", "10");
     caps.setCapability("browser", "Chrome");
     caps.setCapability("browser_version", "121");

     caps.setCapability("name", "Mohan's");

    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
     
     
    
//Navigating through the URL
     driver.get("http://www.google.com");
//Locating the search box of google
     WebElement element = driver.findElement(By.name("q"));
//Sending browserstack keyword for search
     element.sendKeys("Youtube");
     element.submit();
     }
     public void dummyMethodForGitCheck() {
    	 System.out.println("Added method need to push to branch");
    	 
     }
}
