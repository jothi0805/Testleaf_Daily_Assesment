package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import OopsConcepts.WebElement;

public class BigbasketAction {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//button[@id='headlessui-menu-button-:Ramkj6:'")).click();
		Thread.sleep(2000);
		//WebElement foodgrains=driver.findElement(By.xpath("//a[text()='Foodgrains, Oil & Masala']"));
		
		
		
	}

}
