package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium {
	@Test
	public void webauto() {

		System.out.println(" hi welcome");
	}

	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver", "/home/pramodp/Downloads/selenium/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("jhrekjfhre")).click();
	}

}
