package seleniumAutomation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get(("http://leaftaps.com/opentaps/"));
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.id("label")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Phone")).click();
		//driver.findElement(By.name("phoneNumber")).sendKeys(CreateLead.number);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();


		Thread.sleep(2000);
	    List<WebElement> table = driver.findElements(By.xpath("//table[@class='x-grid3-row-table']"));
	    for(int i=0; i <table.size(); i++) {
	    	List<WebElement> rows = table.get(i).findElement(By.tagName("tbody")).findElements(By.tagName("tr"));
		    
		    for (WebElement row : rows) {
		        // Find all cells (td or th) within the current row
		        List<WebElement> cells = row.findElements(By.tagName("td")); // Use By.tagName("th") for header rows
		        Thread.sleep(2000);
		        // Iterate through the cells of the current row
		        for (WebElement cell : cells) {
		        	WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(10)); // Wait for a maximum of 10 seconds
		        	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.linkText(cell.getText())));
		        	element.click();
		        	
		        	break;
		        	
//		        	cell.click();
//		            System.out.print(cell.getetText() + "\t"); // Print the text content of each cell
		        }
		        break;
//		        System.out.println(); // Move to the next line after processing a row
		    }
		    break;
	    }
		
		driver.findElement(By.linkText("Delete")).click();
			
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Phone")).click();
		//driver.findElement(By.name("phoneNumber")).sendKeys(CreateLead.number);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(2000); //need to wait as it takes the pagination text
		WebElement respText = driver.findElement(By.className("x-paging-info")); 
		 String text = respText.getText(); 
//		 System.out.println(text);
		 if(text.equalsIgnoreCase("No records to display")) {
			 System.out.println(text); 
		 }else {
			 System.out.println("Still more record exist"); 
		 }
		 
		 
//		driver.close();
		
		
	}

}
