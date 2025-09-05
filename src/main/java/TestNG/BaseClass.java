package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {

	public ChromeDriver driver;

	@Parameters({ "url", "userName", "password" })
	@BeforeMethod

	public void preCondition(String url, String userName, String password) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();

		options.addArguments("guest");
		driver = new ChromeDriver(options);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url);

		driver.findElement(By.id("username")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("decorativeSubmit")).click();

	}

	@AfterMethod
	public void cl() {
		driver.close();
	}
}
