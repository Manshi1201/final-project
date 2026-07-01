package tests;

import org.testng.annotations.Test;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.net.URL;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;
import java.net.URI;

public class SauceDemoLoginTest {

	private WebDriver driver;
	  private Map<String, Object> vars;
	  JavascriptExecutor js;
	  @BeforeMethod
	  public void setUp() throws Exception {
		  driver = new RemoteWebDriver(
		        URI.create("http://localhost:4444/wd/hub").toURL(),
		        new ChromeOptions()
				  );	    
		  js = (JavascriptExecutor) driver;
	    vars = new HashMap<String, Object>();
	  }
	  @AfterMethod
	  public void tearDown() {
	    driver.quit();
	  }
	  @Test
	  public void sauceDemoLoginTest() {
	    driver.get("https://www.saucedemo.com/");
	    driver.manage().window().setSize(new Dimension(831, 700));
	    driver.findElement(By.cssSelector("*[data-test=\"username\"]")).click();
	    driver.findElement(By.cssSelector("*[data-test=\"username\"]")).sendKeys("standard_user");
	    driver.findElement(By.cssSelector("*[data-test=\"password\"]")).click();
	    driver.findElement(By.cssSelector("*[data-test=\"password\"]")).sendKeys("secret_sauce");
	    driver.findElement(By.cssSelector("*[data-test=\"login-button\"]")).click();
	    driver.findElement(By.cssSelector("*[data-test=\"add-to-cart-sauce-labs-backpack\"]")).click();
	    driver.findElement(By.cssSelector("*[data-test=\"add-to-cart-sauce-labs-bike-light\"]")).click();
	    driver.findElement(By.cssSelector("*[data-test=\"shopping-cart-link\"]")).click();
	    driver.findElement(By.id("react-burger-menu-btn")).click();
	    driver.findElement(By.cssSelector("*[data-test=\"logout-sidebar-link\"]")).click();
	  }
}
