package seleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginPage {

	
		static WebDriver driver;

		public static void launchbrowser() {

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		public static void applicationurl(String url) {

			driver.get(url);
		}

		public static void emailaddress() {
			driver.findElement(By.name("email")).click();
			driver.findElement(By.name("email")).sendKeys("ghugarkarma@gamil.com");

		}

		public static void password() {
			driver.findElement(By.id("pass")).click();
			driver.findElement(By.id("pass")).sendKeys("madhuri@123");
			
		}

		public static void loginbutton() {
			driver.findElement(By.tagName("button")).click();
		}

		public static void closeBrowser() {
			driver.quit();
		}
		
		public static void main(String[] args)   {
			launchbrowser();
			applicationurl("https://www.facebook.com/");
			emailaddress();
			password();
			loginbutton();
			closeBrowser();

			
		}
	}
