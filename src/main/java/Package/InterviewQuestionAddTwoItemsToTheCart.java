package Package;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InterviewQuestionAddTwoItemsToTheCart {

	public static void main(String[] args) {
		// Interview qn add 2 or 3 items to the cart

		// why you declared array first then convert it into arraylist >>>Ans Array
		// takes less memory arrayList
		// is used only when you have complicated scenario to validate here with a lesss
		// memory you
		// decalred array then at run time you convert arry into arrayList in this
		// way you are saving the memory

		// 2nd qn why not break Ans: if it found one item then
		//it will come out of for loop so it will not valoidate for other 2 items how to solve this problem 
		//it will run unnecessary for 30 times
		//

		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot" };

		WebDriver driver = new ChromeDriver();
		int j=0;
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

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
				
				if(j==3)
				{
					break;
				}

			}
		}

	}

}
