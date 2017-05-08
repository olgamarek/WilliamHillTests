package williamhill;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
* Page object for http://sports.williamhill.com/betting/en-gb running on desktop
* @author Olga Marek
*
*/
public class BettingPageDesktop extends BettingPage {

	public BettingPageDesktop(WebDriver driver) {
		super(driver);
		locator = new LocatorDesktop();
	}

	@Override
	public void putMoneyOnBetslip(String money) {
		wait.until(ExpectedConditions.presenceOfElementLocated(locator.getMoneyInput()));	
		driver.findElement(locator.getMoneyInput()).sendKeys(String.valueOf(money));				
	}

}
