package seleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount1 {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get(("http://leaftaps.com/opentaps/"));
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.id("label")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Dheekshith");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		WebElement source = driver.findElement(By.name("industryEnumId"));
		Select sel = new Select(source);
		sel.selectByIndex(3);

		WebElement source1 = driver.findElement(By.name("ownershipEnumId"));
		Select sel1 = new Select(source1);
		sel1.selectByVisibleText("S-Corporation");

		WebElement source2 = driver.findElement(By.id("dataSourceId"));
		Select sel2 = new Select(source2);
		sel2.selectByValue("LEAD_EMPLOYEE");

		WebElement source3 = driver.findElement(By.id("marketingCampaignId"));
		Select sel3 = new Select(source3);
		sel3.selectByIndex(6);

		WebElement source4 = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select sel4 = new Select(source4);
		sel4.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();

	}

}
