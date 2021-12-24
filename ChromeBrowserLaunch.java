package seleniumProgram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserLaunch {
	static WebDriver driver;

	public static void launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public static void openApplicationUrl() {
		driver.get("https://www.flipkart.com/");

	}

	public static void closeBrowser() {
		driver.close(); // close current window tab
		// driver.quit(); // close all window tab
	}

	public static String getPageTitle() {
		 return driver.getTitle();
	}

	public static void webApplicationTitleValidation() {

		String actualTitle = driver.getTitle();
		String expectedTitle = "google";

		if (actualTitle.equals(expectedTitle))
			System.out.println("Application title is equales to expected title");
		else
			System.err
					.println("Application title is not equales to expected title [Actual Title = " + actualTitle + "]");

	}

	public static void getCurrentUrl() {

		String currenturl = driver.getCurrentUrl();
		System.out.println("Current Url = " + currenturl);

		String pageSource = driver.getPageSource();
		System.out.println("Page Source = " + pageSource);

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public static void navigationOperation() {

		driver.navigate().back();

		driver.navigate().forward();

		driver.navigate().refresh();

		driver.navigate().to("https://www.flipkart.com/");

	}

	public static void manageOperations() {
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();

		// System.out.println("size of Window before maximize =
		// "+driver.manage().window().getSize());
		// Dimension dim =new Dimension(500, 500));
		// driver.manage().window().setSize(dim);
		// System.out.println("size of Window after maximize =
		// "+driver.manage().window().getSize());

		System.out.println("size of Window before maximize = " + driver.manage().window().getPosition());
		Point point = new Point(700, 600);
		driver.manage().window().setPosition(point);
		System.out.println("size of Window after maximize = " + driver.manage().window().getPosition());

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		System.out.println(driver.manage().getCookies());
		driver.manage().deleteAllCookies();
		System.out.println("After delete method = " + driver.manage().getCookies());

		org.openqa.selenium.Cookie cookie = new Cookie("Cookie 1 ", " 21660185860c91ae6139b9b97048666e69338a60189fc0d7c6e2fd127bd0835c ");
		driver.manage().addCookie(cookie);
		System.out.println("After add method = " + driver.manage().getCookies());

	}

	public static void main(String[] args) {
		launchBrowser();
		openApplicationUrl();
		// closeBrowser();
		// getPageTitle();
		// webApplicationTitleValidation();
		// getCurrentUrl();
		// navigationOperation();
		manageOperations();

	}

}
