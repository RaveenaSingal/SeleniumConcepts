package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// 91.  How to handle Frames?
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		//How many frames are present in the application
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		
		//switch to frame
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		//drag and drop
		Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.cssSelector("div#draggable"));
		WebElement target = driver.findElement(By.cssSelector("div#droppable"));
		a.dragAndDrop(source, target).build().perform();
		
		//if you want to perform action out side the frame then 
		driver.switchTo().defaultContent();
		
		
		
	}

}
