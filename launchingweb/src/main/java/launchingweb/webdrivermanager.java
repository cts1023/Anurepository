package launchingweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webdrivermanager {
	
public static void main(String[] args) {
	
	
	WebDriver driver;
	
	WebDriverManager.firefoxdriver().setup();
	
	driver =new FirefoxDriver();
	
	driver.get("https://www.google.com");
	
	List <WebElement> ale= driver.findElements(by )
	driver.close();
	
	}
	
	
}


