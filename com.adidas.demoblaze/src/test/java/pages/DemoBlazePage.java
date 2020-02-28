package pages;

import java.io.IOException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import com.adidas.demoblaze.cucumberFramework.BasePage;
import Utils.Utilities;

public class DemoBlazePage extends BasePage implements DemoBlazePageInterface {

	static String priceBefore;
	static String priceAfter;

	public static DemoBlazePage objDemoBlaze = null;

	public static DemoBlazePage getInstance() {
		if (DemoBlazePage.objDemoBlaze == null)
			objDemoBlaze = new DemoBlazePage();
		return objDemoBlaze;
	}

	public void clickLink(String arg1) {
		driver.findElement(By.linkText(arg1)).click();

	}

	public void acceptAlert() throws InterruptedException {
		Thread.sleep(2000);
		Alert myalert = driver.switchTo().alert();
		myalert.accept();

	}

	public void clinkButton(String arg1) {
		driver.findElement(By.xpath("//button[text()='" + arg1 + "']")).click();

	}

	public boolean validateAmount() {
		driver.findElement(message).getText().split("\n");
		String[] arr = driver.findElement(message).getText().split("\n");
		String[] arr1 = arr[1].split(" ");
		priceAfter = arr1[1];
		System.out.println(priceBefore);
		System.out.println(priceAfter);
		if (priceBefore.contains(priceAfter))
			return true;
		else
			return false;

	}

	public void printAmount() {
		driver.findElement(message).getText().split("\n");
		String[] arr = driver.findElement(message).getText().split("\n");
		System.out.println(arr[1]);
	}

	public void printPurchaseId() {
		driver.findElement(message).getText().split("\n");
		String[] arr = driver.findElement(message).getText().split("\n");
		System.out.println(arr[0]);

	}

	public void enterYear(String arg1) {
		driver.findElement(year).sendKeys(arg1);

	}

	public void enterMonth(String arg1) {
		driver.findElement(month).sendKeys(arg1);

	}

	public void enterCreditCard(String arg1) {
		driver.findElement(card).sendKeys(arg1);

	}

	public void enterCity(String arg1) {
		driver.findElement(city).sendKeys(arg1);

	}

	public void enterCountry(String arg1) {
		driver.findElement(country).sendKeys(arg1);

	}

	public void enterName(String arg1) {
		driver.findElement(name).sendKeys(arg1);

	}

	public void deleteProductFromCart(String arg1) throws IOException, InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[text()='" + arg1 + "']/following-sibling::td/a")).click();
		Thread.sleep(3000);

	}

	public void goToHomePage() throws IOException {
		driver.navigate().to(Utilities.getConfigValue("url"));

	}

	public void savePrice() {
		priceBefore = driver.findElement(price).getText();

	}
}
