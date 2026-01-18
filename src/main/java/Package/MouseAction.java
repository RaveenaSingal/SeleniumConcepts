package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	public static void main(String[] args) {
		 //86. Handling Ajax/Mouse Interactions
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement move= driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		
		Actions a = new Actions(driver);
		
		a.moveToElement(driver.findElement(By.cssSelector("input#twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		//move to specific element
		a.moveToElement(move).contextClick().build().perform();
		
	}

}
