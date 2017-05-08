package williamhill;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
* Page object for http://sports.williamhill.com/betting/en-gb running on mobile device
* @author Olga Marek
*
*/
public class BettingPageMobile extends BettingPage {

	public BettingPageMobile(WebDriver driver) {
		super(driver);
		locator = new LocatorMobile();
	}

	@Override
	public void putMoneyOnBetslip(String money) {
		wait.until(ExpectedConditions.presenceOfElementLocated(((LocatorMobile) locator).getBetslipButton()));
		wait.until(ExpectedConditions.presenceOfElementLocated(((LocatorMobile) locator).getBetslipButtonDiv()));
	    driver.findElement(((LocatorMobile) locator).getBetslipButton()).click();
	    
		wait.until(ExpectedConditions.presenceOfElementLocated(locator.getMoneyInput()));	
		driver.findElement(locator.getMoneyInput()).sendKeys(String.valueOf(money));
	}

}
