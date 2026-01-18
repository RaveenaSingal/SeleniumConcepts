package Package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentTableRowsAndColumns {

	public static void main(String[] args) throws InterruptedException {
		// 3 task
		// 1. print no. of rows
		// 2. print no. of columns
		// 3. print 2nd row content

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,300)");
		//Thread.sleep(3000);
       WebElement table =  driver.findElement(By.xpath("(//table[@id='product'])[1]"));
	System.out.println(table.findElements(By.tagName("tr")).size());
	System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
	
	List<WebElement> secondRow = table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
	System.out.println(secondRow.get(0).getText());
	System.out.println(secondRow.get(1).getText());
	System.out.println(secondRow.get(2).getText());
	}

}
