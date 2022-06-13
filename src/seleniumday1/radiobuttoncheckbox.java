package seleniumday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobuttoncheckbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();  //open my browser
		
		driver.get("https://demo.guru99.com/test/radio.html");
		
		driver.findElement(By.id("vfb-7-2")).click();  //selected option 2 in radio button
		
		
		boolean status = driver.findElement(By.id("vfb-6-2")).isDisplayed();
		String att = driver.findElement(By.xpath("//*[@value='checkbox2']")).getAttribute("name");
		System.out.println(att);
		
		if(status)
		{
			driver.findElement(By.id("vfb-6-1")).click();//2nd checkbox
		}
		
		else
		{
			status = driver.findElement(By.id("vfb-6-1")).isSelected();
			driver.quit();
		}
		
		String tag = driver.findElement(By.xpath("//*[@value='checkbox2']")).getTagName();
		
		
		driver.findElement(By.xpath("//"+tag+"[@value='checkbox2']")).getTagName();
		
		
		System.out.println(tag);
		
		
		

	}

}
