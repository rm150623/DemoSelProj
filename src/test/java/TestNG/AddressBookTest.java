package TestNG;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddressBookTest {
	WebDriver driver;
	@BeforeMethod
	public void launch() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://ec2-13-126-73-224.ap-south-1.compute.amazonaws.com:8080/addressbook/");
	}
  @Test
  public void verfiylogin() {
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//div[@class='v-button v-widget']")).click();
	  driver.findElement(By.id("gwt-uid-5")).sendKeys("Rahul");
	  driver.findElement(By.id("gwt-uid-7")).sendKeys("Mhatre");
	  driver.findElement(By.id("gwt-uid-9")).sendKeys("9820364551");
	  driver.findElement(By.id("gwt-uid-11")).sendKeys("rm150623@gmail.com");
	  driver.findElement(By.id("gwt-uid-13")).sendKeys("07/31/1985");
	  driver.findElement(By.xpath("//div[@class='v-button v-widget primary v-button-primary']")).click();
	  
  }
  
  @AfterMethod
  public void logout() {
	  driver.close();
  }
}
