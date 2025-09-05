package WebTable;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erail {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("txtStationFrom")).sendKeys("MAS", Keys.ENTER);
		driver.findElement(By.id("txtStationTo")).sendKeys("MDU", Keys.ENTER);
		WebElement checkbox = driver.findElement(By.id("chkSelectDateOnly"));
		if (checkbox.isSelected()) {
			checkbox.click();
		}

		List<WebElement> allDatas = driver.findElements(By.xpath(
			"(//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader'])/tbody/tr/td[2]/a"));
		List<String> List = new ArrayList<String>();
		//List.add("GOLDEN TEMPLE M");
		for (WebElement each : allDatas) {
			System.out.println(each.getText());
		List.add(each.getText());

		}
		
        for (int i=0;i<List.size();i++){
        	 for (int j = i + 1; j < List.size(); j++) {
                 if (List.get(i).equals(List.get(j))) {
                	 
                     System.out.println("Duplicate : " + List.get(j));
                     
                 }
        }

	}

	}}
