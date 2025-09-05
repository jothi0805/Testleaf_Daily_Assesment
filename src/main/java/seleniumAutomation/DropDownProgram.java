package seleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropDownProgram {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();

		options.addArguments("guest");

		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.id("label")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jothi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("A");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("11");
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sel = new Select(source);
		sel.selectByIndex(4);
		WebElement source1 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select sel1 = new Select(source1);
		sel1.selectByVisibleText("Automobile");
		WebElement source2 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select sel2 = new Select(source2);
		sel2.selectByValue("OWN_CCORP");
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
	}

}
