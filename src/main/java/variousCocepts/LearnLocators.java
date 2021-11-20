package variousCocepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {
	
	WebDriver driver;
	
	
	@Before
	public void launchBrowser()  {
	
		System.setProperty("Webdriver.chrome.driver", "driver\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://objectspy.space/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void learnTestLocators() throws InterruptedException {
		
//		driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
//		driver.navigate().back();
//		driver.findElement(By.partialLinkText("TF-API")).click();
		
//		Absolute XPath
		driver.findElement(By.cssSelector("input#sex-1")).click();
		driver.findElement(By.cssSelector("input[value='3']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[type='radio'][id='exp-3']")).click();

//		Relative XPath
		driver.findElement(By.xpath("html/body/div/div[2]/div[2]/form/div[7]/input")).sendKeys("Selenium");
		driver.findElement(By.xpath("html/body/div/div[2]/div[2]/form/div[10]/input")).sendKeys("Selenium is fun");
		
//		XPath to deal with links
	    driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("bbbbbb");
	    driver.findElement(By.xpath("//strong[text()='Link Test : New Page']")).click();
	    driver.findElement(By.xpath("//strong[contains(text(), 'Link Test : New Page')]"));
	    driver.findElement(By.xpath("//strong[contains(text(), 'Link Test : New Page')]"));
	    
		
		driver.findElement(By.xpath("//input[@id='tool-1']")).click();
		
	
	
	

	}
	
}

