package seleniumAutomation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PVRCinemas {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();
		driver.findElement(By.id("cinema")).click();

		driver.findElement(By.xpath("//span[text()='INOX National,Virugambakkam Chennai']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Tomorrow')]")).click();
		driver.findElement(By.xpath("//li//span[text()='COOLIE']")).click();
		driver.findElement(By.xpath("//span[text()='09:15 AM']")).click();
		driver.findElement(By.xpath("(//span[text()='Book']//parent::button)[4]")).click();
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Accept']")).click();

		driver.findElement(By.id("SL.SILVER|M:14")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		Thread.sleep(2000);

		WebElement ticketVal = driver.findElement(By.className("ticket-value"));
		System.out.println(ticketVal.getText());
		WebElement seatNum = driver.findElement(By.className("seat-number"));
		System.out.println(seatNum.getText());

		WebElement spanElement = driver.findElement(By.xpath("//div[@class='grand-tota col-md-3']//h6//span"));
		String spanText = spanElement.getText();
		System.out.println("Total " + spanText);

		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		driver.findElement(By.xpath("(//i[@class='pi pi-times']//parent::span)[2]")).click();

		System.out.println("Page Title : " + driver.getTitle());
		driver.close();

	}

}
