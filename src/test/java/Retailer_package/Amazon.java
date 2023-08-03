package Retailer_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Amazon {
  @Test
  public void amazon_test() throws InterruptedException 
  {
	  WebDriver driver = new ChromeDriver();
	  Reporter.log("Opening amazon", true);
	  driver.get("https://www.amazon.com/");
	  Thread.sleep(2000);
	  driver.quit();
	  
	  
  }
}
