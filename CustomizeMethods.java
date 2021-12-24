package seleniumProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomizeMethods {

	static WebDriver driver;

	public static void launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public static void openApplicationUrl(String url) {
		driver.get(url);
	}

	public static String getTitleMethod() {
		String title = driver.getTitle();
		return title;
	}

	public static String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public static String getPageSource() {
		return driver.getPageSource();
	}

	public static void navigationOperation() {
		driver.navigate().back();
		return;
		
	}

	public static void main(String[] args) {
		launchBrowser();
		openApplicationUrl("https://flipcard.com/");
		System.out.println("Application Title= " + getTitleMethod());
		String url = getCurrentUrl();
		System.out.println("Application Current Url= " + url);
		System.out.println("Page Source Code= " + getPageSource().substring(10, 300));
		navigationOperation();

	}

}
