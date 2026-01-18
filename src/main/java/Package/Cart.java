package Package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cart {

	public static void main(String[] args) {
		// 71. Adding Items into Cart for Ecommerce App
		//72. Sending Array of Products to Cart for checkout
		//73. Building Programming Logic to process items in array for Cart
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		List<WebElement> products = driver.findElements(By.cssSelector("h4[class='product-name']"));
		for(int i=0; i<products.size();i++)
		{
			String name = products.get(i).getText();
			if(name.contains("Cucumber"))
			{
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
			break;
			}
		}

	}

}
