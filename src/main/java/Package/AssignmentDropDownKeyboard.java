package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentDropDownKeyboard {

	public static void main(String[] args) throws InterruptedException {
		// DropDown>>KeyBoard Action
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.cssSelector("#autocomplete")).sendKeys("ind");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#autocomplete")).sendKeys(Keys.DOWN);
		driver.findElement(By.cssSelector("#autocomplete")).sendKeys(Keys.DOWN);
		driver.findElement(By.cssSelector("#autocomplete")).getAttribute("Value");
		
		
		
		
		
		

	}

}
