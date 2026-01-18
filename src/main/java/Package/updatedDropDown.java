package Package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class updatedDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement s = driver.findElement(By.id("divpaxinfo"));
		s.click();		
		Thread.sleep(2000);
	
		System.out.println(s.getText());
		int i=1;
		while(i<5) {
		driver.findElement(By.id("hrefIncAdt")).click();	
		i++;
		}
		System.out.println(s.getText());
;
	}

}
