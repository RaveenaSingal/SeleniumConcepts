package Package;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinksFindAll {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		// 109. Strategy to automate the broken Links with Selenium
		// Broken url
		// step1: is to get all urls tied up to the links using selenium
		// java methods will call url's and gets you the status code
		// if status code is >400 then that irl is not working-> link which tied up to
		// the url is broken

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links = driver.findElements(By.className(".gf-li"));
		SoftAssert a = new SoftAssert();
		
		for(WebElement link:links)
		{
			String url = link.getAttribute("href");
			HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode = conn.getResponseCode();
			System.out.println(respCode);
		a.assertTrue(respCode<400,"The link with text"+link.getText()+"is broken with code"+respCode);

	}

	}}
