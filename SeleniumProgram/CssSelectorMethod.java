package seleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetCurrentUrl;

import com.beust.jcommander.converters.ISO8601DateConverter;

public class CssSelectorMethod {

	static WebDriver driver;

	public static void launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public static void openApplicationUrl(String url) {
		driver.get(url);
	}

	public static void handleWebElement() {
		
		String product ="Laptop Bags";
		driver.findElement(By.cssSelector("button[class='text/javascript']")).click();
	    WebElement searchBar = driver.findElement(By.cssSelector("input[name='q']"));
     	String placeholder = searchBar.getAttribute("placeholder");
     	System.out.println("Actual Placeholder : "+placeholder);
	
      	searchBar.sendKeys(product);
    	String attributeValue =searchBar.getAttribute("value");
    	System.out.println("Value : "+attributeValue);
	
    	String fonFamily = searchBar.getCssValue("font-family");
    	System.out.println("font-family : "+fonFamily);
	
    	System.out.println(driver.findElement(By.cssSelector("a[class='_1kfTjk']")).getText());
    	
    	boolean result = false;
    	try {
    		result = driver.findElement(By.cssSelector("a[class='_1kfTjk']")).isDisplayed();
       } catch (RuntimeException e) {
			
		}
    	System.out.println(result);
    	
	}

	public static void main(String[] args) {
		launchBrowser();
		openApplicationUrl("https://www.flipkart.com/");
		handleWebElement();

	}

}