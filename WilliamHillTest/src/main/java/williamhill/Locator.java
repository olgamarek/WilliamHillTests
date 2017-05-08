package williamhill;

import org.openqa.selenium.By;

/**
 * Class with all Selenium locators for http://sports.williamhill.com/betting/en-gb common for page running on desktop and mobile devices
 * @author Olga Marek
 *
 */
public class Locator {

	/* Main menu */
	private By footballMenu = By.cssSelector("i.contextual-nav__icon.icon-football");
	
	/* Football panel */
	private By footbalHighlights = By.xpath("//section[@id='match-highlights']/div/div/header/h3");
	private By selectedBetButton;
	private String partialPathToBet = "/div[2]/div[2]/div/button";
	
	/* Bet slip panel */
	private By moneyInput = By.xpath("//div[2]/div/span/input");
	private By placeBetButton = By.id("place-bet-button");
	private By oddLabel = By.xpath("//header/span/span[2]");
	private By toReturnLabel = By.xpath("//span[3]/span");
	
	public By getFootballMenu() {
		return footballMenu;
	}

	public void setFootballMenu(By footballMenu) {
		this.footballMenu = footballMenu;
	}

	public By getFootbalHighlights() {
		return footbalHighlights;
	}

	public void setFootbalHighlights(By footbalHighlights) {
		this.footbalHighlights = footbalHighlights;
	}

	public By getMoneyInput() {
		return moneyInput;
	}

	public void setMoneyInput(By moneyInput) {
		this.moneyInput = moneyInput;
	}

	public By getPlaceBetButton() {
		return placeBetButton;
	}

	public void setPlaceBetButton(By placeBetButton) {
		this.placeBetButton = placeBetButton;
	}

	public By getOddLabel() {
		return oddLabel;
	}

	public void setOddLabel(By oddLabel) {
		this.oddLabel = oddLabel;
	}

	public By getToReturnLabel() {
		return toReturnLabel;
	}

	public void setToReturnLabel(By toReturnLabel) {
		this.toReturnLabel = toReturnLabel;
	}

	public String getPartialPathToBet() {
		return partialPathToBet;
	}

	public void setPartialPathToBet(String partialPathToBet) {
		this.partialPathToBet = partialPathToBet;
	}

	public By getSelectedBetButton() {
		return selectedBetButton;
	}

	public void setSelectedBetButton(By selectedBetButton) {
		this.selectedBetButton = selectedBetButton;
	}

}
