package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class E2Etest {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        // Select trip type
        driver.findElement(By.name("ctl00$mainContent$rbtnl_Trip")).click();

        // Click 'From' and select Delhi
        driver.findElement(By.cssSelector(".red-arrow-btn")).click();
        driver.findElement(By.xpath("//a[@text='Delhi (DEL)']")).click();

        // Wait and select Hyderabad as destination
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//a[@text='Hyderabad (HYD)'])[2]")).click();

        // Apply discount
        driver.findElement(By.id("familyandfriend")).click();

        // Check if current date is selected
        Boolean date = driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).isSelected();
        System.out.println("Current date is selected: " + date);

        // Check if return date calendar is disabled (opacity 0.5 indicates disabled)
        String style = driver.findElement(By.id("Div1")).getDomAttribute("style");
        if (style.contains("0.5")) {
            System.out.println("Return date is disabled");
            Assert.assertTrue(true);
        } else {
            System.out.println("Return date is enabled");
            Assert.fail("Return date should be disabled, but it is not.");
        }

        // Increase adults to 5
        driver.findElement(By.cssSelector(".paxinfo")).click();
        Thread.sleep(2000);
        for (int i = 1; i < 5; i++) {
            driver.findElement(By.id("hrefIncAdt")).click();
        }

        // Verify adult count
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

        // Click search
        driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
        Thread.sleep(2000);

        // Close the browser
        driver.quit();
    }
}
