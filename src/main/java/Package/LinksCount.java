package Package;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksCount {

	public static void main(String[] args) throws InterruptedException {
		// 93. Practise Exercise- print the links count in the Page
		//94. Exercise 1.1-Limiting Webdriver scope
		//95. How to open the links in Separate Tabs - Optimized solution
		//Requirement
		//96. Getting the Titles of child tabs with optimized while loop
		//1. Give me the count of links on the page
		
		//Remember: Every link will have a tag "a"
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		
		//2. get me the link count of footer section
		
		WebElement footerDriver = driver.findElement(By.xpath("//div[@id='gf-BIG']"));//limiting webdriver scope by using footerDriver
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
	    
		//3. I Want link count of only header section
	
		WebElement columndriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
		
		//4. Click on each link in column and check if the pages are opening
		
		for(int i=1; i<columndriver.findElements(By.tagName("a")).size();i++)
		{
			String clickOnLinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
			Thread.sleep(5000);
		}
		//open all the tabs
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
	}

}
