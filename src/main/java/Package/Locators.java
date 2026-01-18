package Package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//waiting for object to show on the page
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("rahul");
		driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys("hello123");
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		driver.findElement(By.xpath("//p[@class='error']")).getText();
		driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Raveena");
	    driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("raveena@gmail.com");
	    driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("8877665543");
	    driver.findElement(By.xpath("//button[text()='Reset Login']")).click();
	    System.out.println(driver.findElement(By.cssSelector(".infoMsg")).getText());
	    driver.findElement(By.cssSelector(".go-to-login-btn")).click();
	    Thread.sleep(1000);
	    
	    //login with correct credentials
	    driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
	    driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys("rahulshettyacademy");
	    driver.findElement(By.cssSelector(".signInBtn")).click();
	    
	}

}
