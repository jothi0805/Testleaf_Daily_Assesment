package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAction {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//button[text()='Continue shopping']")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro",Keys.ENTER);
		WebElement price=driver.findElement(By.xpath("//span[@class='a-price-whole'	]"));
		System.out.println("Price:"+price.getText());
		WebElement rating=driver.findElement(By.xpath("//span[@class='a-size-base s-underline-text'][1]"));
		System.out.println(rating.getText());
		driver.findElement(By.xpath("//a[@class='a-link-normal s-no-outline'][1]")).click();
		driver.findElement(By.xpath("//span[text='Add to Cart'][4]")).click();
		WebElement cartsubtotal=driver.findElement(By.xpath("//span[@class='a-price-whole'][1]"));
		System.out.println("cartsubtotal:"+cartsubtotal.getText());
		
	}

}
