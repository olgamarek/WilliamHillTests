package williamhill;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Class contains Cucumber Tests
 * @author Olga Marek
 * 
 */
public class BettingTest {

	Actions actions;
	BettingPage bettingPage;
	double valueOfBet = 0;

	@Given("^I open the browser on mobile device$")
	public void openBrowserOnDMobile() {
		actions = new ActionMobile();
		actions.openBrowser();
		bettingPage = new BettingPageMobile(actions.getDriver());
	}

	@Given("^I open the browser on desktop$")
	public void openBrowserOnDesktop() {
		actions = new ActionDesktop();
		actions.openBrowser();
		bettingPage = new BettingPageDesktop(actions.getDriver());
	}

	@Given("^open page \"([^\"]*)\"$")
	public void openPage(String url) {
		actions.openPage(url);
	}

	/* Select first football event */
	@When("^select any football event$")
	public void selectAnyFootballEvent() {
		bettingPage.clickOnfootballMenu();
		bettingPage.clickOnSelectedBetButton(1);
	}

	@When("^select football event on (\\d+) position$")
	public void selectFootballEventOnSelectedPosition(int positionNumber) {
		bettingPage.clickOnfootballMenu();
		bettingPage.clickOnSelectedBetButton(positionNumber);
	}

	@When("^place a £(\\d+\\.\\d+) bet for the home team to 'Win'$")
	public void placeABetForTheHomeTeamToWin(String valueOfBet) throws Throwable {
		this.valueOfBet = Double.parseDouble(valueOfBet);
		bettingPage.putMoneyOnBetslip(valueOfBet);
		bettingPage.placeBet();
	}

	@Then("^assert the odds$")
	public void assertTheOdds() throws Throwable {
		String betButton = bettingPage.getTextBetButton();
		String betOddLabel = bettingPage.getOddLabel();
		assertEquals(betButton, betOddLabel);
	}

	@Then("^assert returns offered$")
	public void assertReturnsOffered() throws Throwable {
		String toReturnLabel = bettingPage.getTextToReturnLabel();

		double a = Double.parseDouble(bettingPage.getTextBetButton().split("/")[0]);
		double b = Double.parseDouble(bettingPage.getTextBetButton().split("/")[1]);
		double calculateReturnValue = ((a + b) / b) * valueOfBet;

		assertEquals(toReturnLabel, new BigDecimal(calculateReturnValue).setScale(2, RoundingMode.DOWN).toString());
	}

	@After
	public void closeDriver() throws Exception {
		actions.getDriver().quit();
	}
}
