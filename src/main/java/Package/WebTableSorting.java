package Package;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class WebTableSorting {

	public static void main(String[] args) {
		//Click on column
		//capture all webElements into list
		//capture text of all webElements into new(originsl) list
		//sort on the original list of step 3->sorte List
		//compare original list vs sorte list
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//Click on column
		driver.findElement(By.xpath("//tr//th[1]")).click();
		
		//capture all webElements into list
		List<WebElement> elementsList = driver.findElements(By.xpath("//tr//td[1]"));

		//capture text of all webElements into new(original) list
		List<String> originalList = elementsList.stream().map(s->s.getText()).collect(Collectors.toList());
		
		//sort on the original list of step 3->sorte List
		List<String> sorteList = originalList.stream().sorted().collect(Collectors.toList());
		
		//compare original list vs sorted list
		Assert.assertTrue(originalList.equals(sorteList));
		
		//scan the name column with getText()-> Beans ---print the price of rice
		List<String> price =elementsList.stream().filter(s->s.getText().contains("Rice"))
		.map(s->getPriceveggie(s)).collect(Collectors.toList());
		
		price.forEach(a->System.out.println(a));
		if(price.size()<1) {
			driver.findElement(By.cssSelector("aria-label='Next'")).click();
		}
		

	}

	private static String  getPriceveggie(WebElement s) {
		// TODO Auto-generated method stub
		String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		
		return priceValue;
	}

}
