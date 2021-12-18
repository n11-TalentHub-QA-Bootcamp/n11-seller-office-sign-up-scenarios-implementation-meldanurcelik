package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import starter.n11.navigation.login.n11SelerOfficeSignUp;
import starter.n11.navigation.tasks.n11SellerOfficeNavigateTo;

public class n11SellerOfficeSignupSteps {

    Actor actor = Actor.named("patikabootcampers");

    @Managed
    WebDriver webDriver;

    @Given("user launch browser and open the login page")
    public void user_launch_browser_and_open_the_login_page() {
        actor.can(BrowseTheWeb.with(webDriver));
        actor.wasAbleTo(n11SellerOfficeNavigateTo.theN11SellerOfficePage());
    }

    @When("user signed in selleroffice with valid credentials")
    public void user_signed_in_selleroffice_with_valid_credentials() {
        actor.attemptsTo(n11SelerOfficeSignUp
                .signUpThePage("meldacelik",
                        "bootcamp123.",
                        "bootcamp123.",
                        "melda_celik@hotmail.com",
                        "melda_celik@hotmail.com",
                        "n11-bootcamp-test",
                        "Meldanur",
                        "Çelik",
                        "N11 TalentHub",
                        "test",
                        "test",
                        "test"
                ));
    }

    @Then("user signed in selleroffice successfully")
    public void user_signed_in_selleroffice_successfully() {
        //div.simple:nth-child(8) div.sellerOffice:nth-child(3) div.ui-panel.ui-widget.ui-widget-content.ui-corner-all.formPanel.agreementAndIssuance div.ui-panel-content.ui-widget-content div.inputLine:nth-child(2) tbody:nth-child(1) tr:nth-child(2) td:nth-child(1) div.ui-message-error.ui-widget.ui-corner-all > span.ui-message-error-detail
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //serenity tester
        /*actor.attemptsTo(
                Ensure.that(n11SellerOfficeSignupPageElement.TERMSWARNING_MESSAGE).isDisplayed(),
                Ensure.that(n11SellerOfficeSignupPageElement.TERMSWARNING_MESSAGE).value().startsWith("test")
        );*/
    }

}