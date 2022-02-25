package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.portalHomePage;
import resources.base;

import java.io.IOException;

public class stepDefinitions extends base {

    @Given("Initialize the browser with chrome")
    public void initialize_the_browser_with_chrome() throws IOException {
        // Write code here that turns the phrase above into concrete actions
        driver =initializeDriver();

    }
    @Given("Navigate to {string} site")
    public void navigate_to_site(String string) {
        // Write code here that turns the phrase above into concrete actions
        driver.get(string);

    }
    @Given("Click on Login link in home page to land on Secure login page")
    public void click_on_login_link_in_home_page_to_land_on_secure_login_page() {
        // Write code here that turns the phrase above into concrete actions
        LandingPage l=new LandingPage(driver);
        LoginPage lp=l.getLogin();
    }

    @Then("Verify that user is successfully logged in")
    public void verify_that_user_is_successfully_logged_in() {
        // Write code here that turns the phrase above into concrete actions
        portalHomePage p = new portalHomePage(driver);
        Assert.assertTrue(p.getSearchBox().isDisplayed());
    }
    @When("^User enters (.+) and (.+) and logs in$")
    public void user_enters_and_and_logs_in(String username, String password) throws Throwable {

        // Write code here that turns the phrase above into concrete actions
        LoginPage lp =new LoginPage(driver);
        lp.getEmail().sendKeys(username);
        lp.getPassword().sendKeys(password);
        lp.getLogin().click();
    }

    @And("^Close Browsers$")
    public void closeBrowsers() {
        driver.quit();
    }
}
