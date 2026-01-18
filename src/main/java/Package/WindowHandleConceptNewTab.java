package Package;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleConceptNewTab {

	public static void main(String[] args) {
		// 88. Window Handle concepts-real time example
		// 89. Live Example on working with Child windows
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector(".blinkingText")).click();

		// How to switch from parent to child
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);

		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		// Please email us at mentor@rahulshettyacademy.com with below template to
		// receive response
		String emailId = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim()
				.split(" ")[0];
		driver.switchTo().window(parentId);
		driver.findElement(By.cssSelector("#username")).sendKeys(emailId);

	}

}
