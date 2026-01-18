package Package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropDown {

	public static void main(String[] args) throws InterruptedException {
		// AutoSuggestiveDropDown: Based upon our input we will get suggestion
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.cssSelector("input[id='autosuggest']")).sendKeys("ind");
		Thread.sleep(3000);
        List<WebElement> countries = driver.findElements(By.cssSelector("li[class='ui-menu-item']"));
	
        for(WebElement country:countries)
        {
        	if(country.getText().equalsIgnoreCase("India"))
        	{
        		country.click();
        		break;
        	}
        }
	}

}
