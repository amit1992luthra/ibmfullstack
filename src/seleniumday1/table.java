package seleniumday1;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class table {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();  //open my browser
		driver.get("https://www.nseindia.com/market-data/top-gainers-loosers?cat=G");
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  
		//selenium 3
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.titleContains("title"));

		
		//selenium 4
		List<WebElement> obj = driver.findElements(By.xpath("//table[@id='topgainer-Table']/tbody/tr/td[1]"));
		
		
		
		Wait<WebDriver> wait1 = new FluentWait<WebDriver> (driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(1))
				.ignoring(Exception.class);

				WebElement element =wait1.until(new Function<WebDriver, WebElement>() 
				{
				public WebElement apply(WebDriver driver) 
				{
				WebElement e = driver.findElement(By.xpath(""));
				return e;  } 
				});

		
		
		for(int i=0;i<obj.size();i++)
		{
			WebElement value = obj.get(i);
			System.out.println(value.getText());
		}

	}

}
