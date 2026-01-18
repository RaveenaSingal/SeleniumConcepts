package Package;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CartFlow {

    public static void main(String[] args) throws InterruptedException {
        // 73. Building Programming Logic to process items in array for Cart

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

        String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot" };

        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
        List<String> itemsNeededList = Arrays.asList(itemsNeeded);

        int j = 0; // Moved outside the loop

        for (int i = 0; i < products.size(); i++) {
            // Example: "Brocolli - 1 Kg"
            String[] name = products.get(i).getText().split("-");
            String formattedName = name[0].trim();

            // Check whether extracted name is present in the array list
            if (itemsNeededList.contains(formattedName)) {
                j++;
                // Click on "Add to cart"
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

                if (j == itemsNeeded.length) {
                    break;
                }
            }
        }
    }
}
