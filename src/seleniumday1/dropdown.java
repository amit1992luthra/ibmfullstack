package seleniumday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();  //open my browser
		/*driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		
		WebElement abc = driver.findElement(By.name("country"));
		Select obj = new Select(abc);	
		
		//obj.selectByVisibleText("IRAN");
		
		//obj.selectByValue("GREECE");
		
		obj.selectByIndex(3);*/
		
		
		
		driver.get("http://output.jsbin.com/osebed/2");
		
		WebElement drop = driver.findElement(By.id("fruits"));
		Select obj = new Select(drop);
		
		obj.selectByVisibleText("Banana");
		obj.selectByVisibleText("Grape");
		obj.selectByVisibleText("Apple");
		
		Thread.sleep(2000);
		obj.deselectByVisibleText("Apple");
		
	}

}
