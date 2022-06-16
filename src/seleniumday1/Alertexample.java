package seleniumday1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alertexample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();  //open my browser
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		
		
		driver.findElement(By.name("cusid")).sendKeys("123");
		
		driver.findElement(By.name("submit")).click();
	 
		Alert obj = driver.switchTo().alert();
		
		//obj.accept();
	//	Thread.sleep(2000);
	//	obj = driver.switchTo().alert();
		//obj.accept();
		String value = obj.getText();
		obj.dismiss();
		System.out.println(value);
		
		driver.quit();
		
		
		
		
		
		

	}

}
