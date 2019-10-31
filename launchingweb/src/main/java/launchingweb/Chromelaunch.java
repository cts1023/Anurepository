package launchingweb;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Chromelaunch {

	public static void main(String[] args) {
		
		//WebDriver driver= new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\thotaax\\eclipse-workspace\\launchingweb\\Driver\\Firefox\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		//WebDriver driver= new EdgeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("food");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(Keys.RETURN);
		driver.close();
	}
	
}
