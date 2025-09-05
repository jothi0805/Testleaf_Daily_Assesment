package seleniumAutomation;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraAssignment {
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.className("desktop-searchBar")).sendKeys("bags", Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@class='common-customRadio gender-label'][1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@value='Laptop Bag']/parent::label)[1]")).click();

		List<WebElement> brandname = driver.findElements(By.xpath("//h3[@class='product-brand']"));
		Thread.sleep(3000);
		List<WebElement> productname = driver.findElements(By.xpath("//h4[@class='product-product']"));
		System.out.println(brandname.size());

		System.out.println(productname.size());
		List<String> brand = new ArrayList<String>();
		Thread.sleep(3000);
		if (brandname.size() > 0) {

			for (WebElement each : brandname) {
				String brandVal = each.getText();
				brand.add(brandVal);
			}
		}

		List<String> product = new ArrayList<String>();
		for (WebElement each : productname) {
			product.add(each.getText());
		}

		System.out.println(brand);

	}
}