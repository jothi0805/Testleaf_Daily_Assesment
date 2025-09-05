package HandsOnExperienceProgram;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TataCliq {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.tatacliq.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("moe-dontallow_button")).click();
		
		Actions action=new Actions(driver);
		WebElement brand=driver.findElement(By.xpath("//div[text()='Brands']"));
		action.moveToElement(brand).perform();
		
		Actions action1=new Actions(driver);
		WebElement brand1=driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));
		action1.moveToElement(brand1).click().perform();
		
		Actions action2=new Actions(driver);
		WebElement brand2=driver.findElement(By.xpath("//div[@class='DesktopHeader__brandsDetails']"));
		action2.moveToElement(brand2).click().perform();
		
		
		WebElement source = driver.findElement(By.xpath("//select[@class='SelectBoxDesktop__hideSelect']"));
		Select sel = new Select(source);
		sel.selectByVisibleText("New Arrivals");
		
		driver.findElement(By.xpath("//div[@class='FilterDesktop__newFilName']")).click();
		Thread.sleep(3000);
		List<WebElement> prices=driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']"));
		for (WebElement each : prices) {
			String text=each.getText();
			System.out.println(text);
			
		}
		WebElement firstwatch=driver.findElement(By.xpath("//div[@class='ProductModule__dummyDiv']"));
		firstwatch.click();
		
		Set<String> childwindow=driver.getWindowHandles();
		List<String> listwindow=new ArrayList<String>(childwindow);
		driver.switchTo().window(listwindow.get(1));
		
		String text1=driver.findElement(By.xpath("//h3[text()='MRP:  ₹4995']")).getText();
		String text2=text1.replace("MRP: ", "");
		System.out.println(text2);
		if(prices.contains(text1)) {
			System.out.println("Prices are equal");
		}else {
			System.out.println("Prices are not equal");
		}
		
	}}
		