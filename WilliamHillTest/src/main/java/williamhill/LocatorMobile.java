package williamhill;

import org.openqa.selenium.By;

/**
 * Class with Selenium locators for http://sports.williamhill.com/betting/en-gb unique for page running on mobile devices
 * @author Olga Marek
 *
 */
public class LocatorMobile extends Locator {
	/* Bet slip panel */
	private By betslipButton = By.id("mobile-betslip-count");
	private By betslipButtonDiv = By.xpath("//div[3]/div/div/div/div/div[2]/div");
	
	public By getBetslipButton() {
		return betslipButton;
	}

	public void setBetslipButton(By betslipButton) {
		this.betslipButton = betslipButton;
	}

	public By getBetslipButtonDiv() {
		return betslipButtonDiv;
	}

	public void setBetslipButtonDiv(By betslipButtonDiv) {
		this.betslipButtonDiv = betslipButtonDiv;
	}
    
}
