package Package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InterviewQnAddItemsToCartOneItemOnly {

	public static void main(String[] args) {
		// interview qn add 1 item cucumber to cart
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for(int i=0; i<products.size(); i++) {
			String name = products.get(i).getText();
			if(name.contains("Cucumber"))
			{
				//click on add to cart
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				break;
				
			}
		}
	

		

	}

}
