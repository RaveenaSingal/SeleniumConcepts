package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) {
		// 
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement StaticDropDown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select s = new Select(StaticDropDown);
        s.selectByIndex(3);
       WebElement firstOption =  s.getFirstSelectedOption();
       System.out.println(firstOption.getText());
       
       s.selectByVisibleText("AED");
       
	}

}
