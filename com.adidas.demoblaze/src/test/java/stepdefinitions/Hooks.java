package stepdefinitions;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import com.adidas.demoblaze.cucumberFramework.BasePage;
import com.adidas.demoblaze.cucumberFramework.SingletonDriver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	private WebDriver driver;
	@Before()
	public void setup() throws IOException {
		driver = SingletonDriver.getDriverInstance();
		BasePage.setDriver(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
	@After()
	public void afterScenario(Scenario scenario) throws InterruptedException {
		driver.quit();
	}
}