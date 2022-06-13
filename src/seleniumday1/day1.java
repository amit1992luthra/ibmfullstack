package seleniumday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day1 {

	public static void main(String[] args) throws InterruptedException  {

		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();  //open my browser
		
		/*driver.get("https://www.facebook.com/");  //navigate to the application by providing url
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		*/
		//driver.close();  //they will only close the current focused screen
		//driver.quit();  //they will forcefully close the whole instance
		/*
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(4000);
		
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(4000);
		
		driver.navigate().back();  //i will be navigate back to facebook
		Thread.sleep(4000);
		
		driver.navigate().forward();  //i will be navigate to google
		Thread.sleep(4000);
		
		driver.navigate().refresh();*/
		
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("username");
		driver.findElement(By.id("pass")).sendKeys("passwordd");
		Thread.sleep(4000);
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.xpath("//div[@id='passContainer']/input")).sendKeys("password field");
		//driver.findElement(By.linkText("Create a Page")).click();
		//driver.findElement(By.partialLinkText("Forgotten ")).click();
		
		
		
		

	}

}
