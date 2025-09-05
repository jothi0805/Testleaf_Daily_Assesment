package seleniumprogram.code;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url="http://leaftaps.com/opentaps/control/main";
		driver.get(url);
	}

}
