package seleniumProgram;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FindElementsMethod {

		static WebDriver driver;

		public static void launchBrowser() {

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}

		public static void openApplicationUrl(String url) {

			driver.get(url);

		}
	

	   public static void getElements() {
		   List<WebElement> inputField = driver.findElements(By.tagName("input"));
		   System.out.println("Size = "+inputField.size());
	       String[] testData = {"Username","Password@123","Password@456"};
	       for(int i = 0; i < 3; i++){
	       inputField.get(i).sendKeys(testData[i]);
	    	   
	       }
	   }
	   
	   public static void getWindowHandle() {
		 String handle = driver.getWindowHandle();
		 System.out.println(handle);
	   }
	   
	public static void main(String[] args) {

		launchBrowser();
		openApplicationUrl("file:///E:/WebDrivers/html/loginpage.html");
		getElements();
		getWindowHandle();
		
	}
	
}
