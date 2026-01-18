package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentFrames {

	public static void main(String[] args) {
		//Nested frame assignments
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
		System.out.println(driver.findElements(By.tagName("frame")).size());
		
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		
		System.out.println(driver.findElement(By.cssSelector("div#content")).getText());
		
		
		
		
		

	}

}
