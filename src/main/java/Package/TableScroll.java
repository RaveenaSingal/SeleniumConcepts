package Package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TableScroll {

	public static void main(String[] args) throws InterruptedException {
		// 101. How to Perform Scrolling with in table and Window level using
		// JavaScriptExecutor
		// if you want to scroll inside a table then
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(5000);
		// to scroll in a table
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");

		// sum all the element
		List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum = 0;
		for (int i = 0; i < values.size(); i++) {
			sum = sum + Integer.parseInt(values.get(i).getText());
		}
		System.out.println(sum);
		//want to validate the sum
		driver.findElement(By.cssSelector(".totalAmount")).getTagName();
		int total = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getTagName().split(":")[1].trim());
        Assert.assertEquals(sum, total);
	}

}
