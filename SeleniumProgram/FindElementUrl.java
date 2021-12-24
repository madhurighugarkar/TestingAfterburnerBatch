package seleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementUrl {

	static WebDriver driver;

	public static void launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public static void openApplicationUrl() {
		driver.get("file:///E:/WebDrivers/html/loginpage.html");

	}

	public static void handleWebElement() {

		WebElement usernameLbl = driver.findElement(By.name("Username"));
		String usernameTxt = (usernameLbl.getText());
		System.out.println(usernameTxt);

	}

	public static void findElementByTagName() {
		driver.findElement(By.tagName("input")).sendKeys("StringFormat");
	}

	public static void findElementById() {

		driver.findElement(By.id("7878")).sendKeys("Selenium@123");
	}

	public static void findElementByClassName() {

		driver.findElement(By.className("password_#123")).clear();

	}

	public static void main(String[] args) {

		launchBrowser();
		openApplicationUrl();
		findElementByTagName();
		findElementById();
		findElementByClassName();
		handleWebElement();
	}
}
