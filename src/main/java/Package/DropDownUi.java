package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DropDownUi {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		// System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.xpath("//div[@id='Div1']")).getDomAttribute("style"));
if(driver.findElement(By.xpath("//div[@id='Div1']")).getDomAttribute("style").contains("1"))
{
	System.out.println("Enabled");
	Assert.assertTrue(true);
}
else
{
	Assert.assertFalse(false);
}
	}

}
