package Package;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		// End to end assignment

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector("#username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("#password")).sendKeys("learning");
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
		Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#okayBtn")));
	    
     
		driver.findElement(By.cssSelector("#okayBtn")).click();
		
		WebElement dropdown = driver.findElement(By.cssSelector("select.form-control"));
		dropdown.click();
		Select s = new Select(dropdown);
		s.selectByValue("teach");

		driver.findElement(By.cssSelector("#terms")).click();
		
		driver.findElement(By.cssSelector("#signInBtn")).click();
		WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='nav-link btn btn-primary']")));
		
		List<WebElement> items = driver.findElements(By.xpath("//button[@class='btn btn-info']"));
		for(int i=0; i<items.size(); i++)
		{
			items.get(i).click();
		}
		
		driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
	}

}
