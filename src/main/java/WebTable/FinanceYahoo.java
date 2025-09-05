package WebTable;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FinanceYahoo {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://finance.yahoo.com/");
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		Actions action = new Actions(driver);
		WebElement more = driver.findElement(By.xpath("//span[text()='More']"));
		action.moveToElement(more).perform();
		WebElement crypto = driver.findElement(By.xpath("//a[@aria-label='Finance: Crypto']"));
		action.moveToElement(crypto).click().perform();
		List<WebElement> cryptoname = driver
				.findElements(By.xpath("//td[@class='leftAlignHeader companyName yf-7uw1qi']"));
		List<String> text = new ArrayList<String>();
		for (WebElement each : cryptoname) {
			System.out.println(each.getText());
			text.add(each.getText());

		}
		System.out.println("Crypto names:" + text);
	}

}
