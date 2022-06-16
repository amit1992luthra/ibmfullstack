package seleniumday1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplewindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();  //open my browser
		driver.get("https://www.canva.com/en_gb/signup/");
		
		driver.findElement(By.xpath("//span[contains(text(),'another way')]")).click();
		
		String parentid = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//span[contains(text(),'Clever')]")).click();
		
		Set<String> obj = driver.getWindowHandles();
		
		for(String id : obj)
		{
			driver.switchTo().window(id);
			System.out.println(id);
			System.out.println(driver.getTitle());
			if(!id.equals(parentid))
			{
				Thread.sleep(4000);
			driver.quit();
			}
		}
		
		
		

	}

}
