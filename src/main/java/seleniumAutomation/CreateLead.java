package seleniumAutomation;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import TestNG.BaseClass;

public class CreateLead extends BaseClass {

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
	public String[][] sendData() {

		String[][] data = new String[3][3];

		data[0][0] = "Wipro";
		data[0][1] = "Jothi";
		data[0][2] = "A";

		data[1][0] = "Intellect";
		data[1][1] = "Karthi";
		data[1][2] = "k";

		data[2][0] = "HUN";
		data[2][1] = "Dheekshith";
		data[2][2] = "K";
		return data;

	}
}
