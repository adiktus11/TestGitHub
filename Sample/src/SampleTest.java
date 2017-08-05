import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {
	
	@Test
	public void test() {
		System.out.println("Hello World!");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com/");
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Google");
		
		driver.quit();
		
	}
}
