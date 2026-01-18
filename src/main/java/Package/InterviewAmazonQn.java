package Package;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InterviewAmazonQn {

	public static void main(String[] args) throws InterruptedException {
		// Interview Amazon Qn Add to cart 
		//instead of giving hardcoaded value
		

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot" , "Carrot"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		addItems(driver,itemsNeeded);
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		//explicit wait
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		//wait.until(ExpectedConditions.visibilityOf(null))
		
		
		
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
	}
		

		
	public static void addItems(WebDriver driver,String[] itemsNeeded) {
			int j=0;
		List<WebElement> products = driver.findElements(By.cssSelector(".product-name"));
		for (int i = 0; i < products.size(); i++) {
			// Brocolli -1 kg

			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			// convert array into arrayList for eassy search
			// check whether name you extracted is present in the array list or not
			// formate it to get actual vegetable name
			List itemsNeededList = Arrays.asList(itemsNeeded);
			
			if (itemsNeededList.contains(formattedName)) {
				j++;
				// click on add to cart
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				
				if(j==itemsNeeded.length)
				{
					break;
				}
			}
			
			}
		

	}



	




	}


