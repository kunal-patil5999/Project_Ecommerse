package Retailer_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flipcart {
  @Test
  public void flipcart_test() throws InterruptedException
  {
	  WebDriver driver = new ChromeDriver();
	  Reporter.log("Opening flipcart", true);
	  driver.get("https://www.flipkart.com/");
	  Thread.sleep(2000);
	  driver.quit();
	  
  }
}