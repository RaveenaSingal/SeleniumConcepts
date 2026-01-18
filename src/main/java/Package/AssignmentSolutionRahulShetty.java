package Package;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentSolutionRahulShetty {

    public static void main(String[] args) throws InterruptedException {

        // Set ChromeDriver path (needed if not in system PATH)
        System.setProperty("webdriver.chrome.driver", "/Users/rahulshetty/Documents/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://rahulshettyacademy.com/loginpagePractise/");

        // Login
        driver.findElement(By.name("username")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("password")).sendKeys("learning");

        // Select User radio button
        driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();

        // Wait for modal & click OK
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
        driver.findElement(By.id("okayBtn")).click();

        // Select "Consultant" from dropdown
        WebElement options = driver.findElement(By.xpath("//select[@class='form-control']"));
        Select dropdown = new Select(options);
        dropdown.selectByValue("consult");

        // Click Sign In
        driver.findElement(By.id("signInBtn")).click();

        // Wait until Checkout link appears
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));

        // Add all products to cart
        List<WebElement> products = driver.findElements(By.cssSelector(".card-footer .btn-info"));
        for (WebElement product : products) {
            product.click();
        }

        // Go to checkout
        driver.findElement(By.partialLinkText("Checkout")).click();

        // Optional: close browser
        // driver.quit();
    }
}
