package seleniumday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettext {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();  //open my browser
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		String username = "amit2022";
		String firstname = "amit";
		String last = "abc";
		
		String status = firstname+" "+last;
		
		//driver.findElement(By.name("firstName")).sendKeys(firstname);
		
		WebElement obj = driver.findElement(By.name("firstName"));
		obj.sendKeys(firstname);
		
		
		driver.findElement(By.name("lastName")).sendKeys(last);
		driver.findElement(By.name("userName")).sendKeys("amit@a.com");
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys("123456789");
		driver.findElement(By.name("confirmPassword")).sendKeys("123456789");
		String tag=	driver.findElement(By.xpath("//*[text()='Phone:']")).getTagName();
		System.out.println(tag);
		driver.findElement(By.name("submit")).click();
		
		String message = driver.findElement(By.xpath("//b[contains(text(),'Dear')]")).getText();
		
		System.out.println(message);
		
		if(message.contains(status))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	
		
		

	}

}
