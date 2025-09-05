package seleniumAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookProgram {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Test");
		driver.findElement(By.name("lastname")).sendKeys("Leaf");
		driver.findElement(By.name("reg_email__")).sendKeys("Testleaf2025@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("2025testleaf");
		WebElement source = driver.findElement(By.id("day"));
		Select sel = new Select(source);
		sel.selectByIndex(22);

		WebElement source1 = driver.findElement(By.id("month"));
		Select sel2 = new Select(source1);
		sel2.selectByVisibleText("Mar");

		WebElement source2 = driver.findElement(By.id("year"));
		Select sel3 = new Select(source2);
		sel3.selectByValue("2020");

		driver.findElement(By.id("sex")).click();

	}

}
