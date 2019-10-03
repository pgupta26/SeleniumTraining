package day7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPageTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Laptop Data\\E Drive\\Selenium_Projects\\Resoures\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumhq.org/download/");
		driver.manage().window().maximize();
		
		//Verify title of the page
		String actualTitle = driver.getTitle();
		
		if(actualTitle.equals("Downloads")) {
			System.out.println("Test pass.");
		} else {
			System.out.println("Test Fail");
		}
		
		driver.close();  //It will close the currently focussed window.
		//driver.quit();   //It will close all the opened window.
	}

}
