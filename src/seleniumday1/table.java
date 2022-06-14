package seleniumday1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();  //open my browser
		driver.get("https://www.nseindia.com/market-data/top-gainers-loosers?cat=G");
		Thread.sleep(4000);
		List<WebElement> obj = driver.findElements(By.xpath("//table[@id='topgainer-Table']/tbody/tr/td[1]"));
		
		for(int i=0;i<obj.size();i++)
		{
			WebElement value = obj.get(i);
			System.out.println(value.getText());
		}

	}

}
