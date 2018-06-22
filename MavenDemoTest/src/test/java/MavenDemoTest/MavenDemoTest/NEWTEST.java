package MavenDemoTest.MavenDemoTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NEWTEST {
	
	public WebDriver driver;
	 
	  @Test
	  public void openMyBlog() {
	 driver.get("https://www.softwaretestingmaterial.com/");
	  }
	  
	  @Test
	  public void openMyBlog1() {
	 driver.get("https://www.google.com/");
	  }
	  @BeforeClass
	  public void beforeClass() {
	   
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harekrishna\\Downloads\\chromedriver.exe");

	   driver = new ChromeDriver();
	   
	  }
	 
	  @AfterClass
	  public void afterClass() {
	   driver.quit();
	  }
	

}
