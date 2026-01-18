package Package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name = "rahul";
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String password = getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys(name);
		driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys(password);
		driver.findElement(By.cssSelector(".signInBtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");

		Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(), "Hello " + name + ",");
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		driver.close();
	}

	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Reset Login']")).click();
		String passwordText = driver.findElement(By.cssSelector(".infoMsg")).getText();

		// our goal is to get below text password only
		// Please use temporary password 'rahulshettyacademy' to Login.
		String[] passwordArray = passwordText.split("'");
		// 0th index-Please use temporary password
		// 1st index-rahulshettyacademy' to Login.

		String password = passwordArray[1].split("'")[0];
		return password;
		// 0th index-rahulshettyacademy
		// 1st index-to Login.

	}

}
