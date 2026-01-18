package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentGrapTextWithoutHardcoading {

	public static void main(String[] args) {
		// dont hardcord option2 it should comes from step 1 action only without hardcoding for ll the steps

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.cssSelector("#checkBoxOption2")).click();
		String opt = driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]")).getText();
	
	   WebElement dropDown =  driver.findElement(By.cssSelector("#dropdown-class-example"));
	   Select s = new Select(dropDown);
	   s.selectByVisibleText(opt);
	   
	   driver.findElement(By.cssSelector("#name")).sendKeys(opt);
	   driver.findElement(By.cssSelector("#confirmbtn")).click();
	   
	 String text = (driver.switchTo().alert().getText()); 
	  if(text.contains(opt)) {
		  System.out.println("Alert message success");
	  }else {
		  System.out.println("Something wrong with execution");
	  }
	  driver.switchTo().alert().accept();
	}

}
