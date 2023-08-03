package Retailer_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ajio {
  @Test
  public void Ajio_Test() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  Reporter.log("Opening Ajio",true);
	  driver.get("https://www.ajio.com/");
	  Thread.sleep(5000);
	  driver.quit();
  }
}
