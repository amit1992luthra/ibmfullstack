package seleniumday1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelementsvsfindelement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();  //open my browser
		driver.get("https://www.facebook.com/");
		List<WebElement> obj = driver.findElements(By.tagName("a"));
		
		//System.out.println(obj.size());
		
		for(int i=0;i<obj.size();i++)
		{
			WebElement value = obj.get(i);
			System.out.println(value.getText());
			
			if(value.getText().contains("Create a Page"))
			{
				value.click();
			}
			else
			{
				System.out.println("no Create a page found");
			}
		}
	}

}
