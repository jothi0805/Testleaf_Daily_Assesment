package seleniumAutomation;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import TestNG.BaseClass;
import utils.LearnExcelcopy;

public class CreateLeadcopy extends BaseClass {

	@Test(dataProvider = "fetchData")
	public void cL(String cName, String fName, String lName) {

		driver.findElement(By.id("label")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);

		driver.findElement(By.name("submitButton")).click();

	}

	@DataProvider(name = "fetchData")
	public String[][] sendData()throws IOException 
	{

		return LearnExcelcopy.readData();

	}
}
