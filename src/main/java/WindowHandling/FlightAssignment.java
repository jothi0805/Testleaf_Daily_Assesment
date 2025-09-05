package WindowHandling;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlightAssignment {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		driver.findElement(By.linkText("FLIGHTS")).click();
		Set<String> Window = driver.getWindowHandles();
		List<String> listWindow=new ArrayList<String>(Window);
		driver.switchTo().window(listWindow.get(1));
		String chAddress = driver.getWindowHandle(); 
		 System.out.println(chAddress);
		 System.out.println(driver.getTitle());
		 driver.switchTo().window(listWindow.get(0));
		 System.out.println(driver.getTitle());
		 driver.quit();
	}

}
