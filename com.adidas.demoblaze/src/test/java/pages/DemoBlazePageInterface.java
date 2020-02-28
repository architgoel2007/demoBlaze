package pages;

import org.openqa.selenium.By;

public interface DemoBlazePageInterface {

	By name=By.id("name");
	By country=By.id("country");
	By city=By.id("city");
	By card=By.id("card");
	By month=By.id("month");
	By year=By.id("year");
	By message = By.xpath("//p[@class='lead text-muted ']");
	By price = By.xpath("//h3[@class='price-container']");


}
