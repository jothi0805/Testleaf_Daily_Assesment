package seleniumAutomation;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonListAssignment {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones", Keys.ENTER);

		List<WebElement> name = driver.findElements(By.className("a-price-whole"));
		List<String> List = new ArrayList<String>();
		for (WebElement links : name) {
			String text = links.getText();
			List.add(text);
		}

		System.out.println(List);

	}
}
