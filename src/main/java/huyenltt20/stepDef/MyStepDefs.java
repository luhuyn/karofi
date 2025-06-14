package huyenltt20.stepDef;

import huyenltt20.pages.LoginPage;
import huyenltt20.pages.WelcomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepDefs {
    WelcomePage welcomePage = new WelcomePage();
    LoginPage loginPage = new LoginPage();

    @Given("Karofi app is opened")
    public void openApp() {
    }

    @When("I select Vietnam as location")
    public void selectVietnamAsLocation() {
        welcomePage.selectVietnam();
    }

    @Then("Vietnam login screen should be displayed correctly")
    public void displayVietnamLoginScreenCorrectly() {
        loginPage.verifyVietnamLoginScreen();
    }

    @When("I select {string} as location")
    public void selectOtherCountryAsLocation(String country) {
        welcomePage.selectOtherCountry(country);
    }

    @Then("Login screen for other countries should be displayed correctly")
    public void displayLoginScreenForOtherCountriesCorrectly() {
        loginPage.verifyOtherCountryLoginScreen();
    }

    @When("I login with phone number {string} and password {string}")
    public void loginWithPhoneNumberAndPassword(String phoneNum, String password) {
        loginPage.login(phoneNum, password);
    }

    @Then("I should be logged in and redirected to Home screen")
    public void loggedInAndRedirectedToHomeScreen() {

    }
}
