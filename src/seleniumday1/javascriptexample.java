package seleniumday1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptexample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();  //open my browser
		driver.get("https://www.facebook.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String title = js.executeScript("return document.title;").toString();
		System.out.println(title);
		
		String url = js.executeScript("return document.URL;").toString();
		System.out.println(url);
		
		WebElement username = driver.findElement(By.xpath("//*[@id='email']"));
		WebElement password = driver.findElement(By.xpath("//*[@id='pass']"));
		
		//js.executeScript("document.getElementById('email').value='hello world';");
		
		js.executeScript("arguments[0].value='hello world';arguments[1].value='password';",username,password);

		//js.executeScript("alert('hello ibm');");
		
		 js.executeScript("window.scrollBy(0,1000);");


		

	}

}
