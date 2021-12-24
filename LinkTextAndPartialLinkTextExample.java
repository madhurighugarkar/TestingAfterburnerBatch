package seleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextAndPartialLinkTextExample {

	static WebDriver driver;

	public static void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public static void openApplicationUrl(String url) {

		driver.get(url);

	}

	public static void clickOnLink() {

		//driver.findElement(By.linkText("Click Here")).click();

		driver.findElement(By.partialLinkText("Click")).click();

	    
	}

	public static void main(String[] args) {
		launchBrowser();
		openApplicationUrl("http://demo.guru99.com//test//link.html");
		clickOnLink();

	}

}
