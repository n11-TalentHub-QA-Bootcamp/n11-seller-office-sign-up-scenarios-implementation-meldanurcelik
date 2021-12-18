package starter.n11.navigation.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;
import starter.n11.navigation.user_interface.n11SellerOfficePageElement;
import starter.n11.navigation.user_interface.n11SellerOfficeSignupPageElement;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class n11SelerOfficeSignUp implements Task {

    private final String username_text;
    private final String password_text;
    private final String repassword_text;
    private final String email_text;
    private final String reemail_text;
    private final String storename_text;
    private final String individualName_text;
    private final String individualSurname_text;
    private final String companyName_text;
    private final String businessNameInput_text;
    private final String registeredTrademarkInput_text;
    private final String companyMersis_text;

    @Step("{0} Register with username '#username_text' and password '#password_text' and repassword '#repassword_text'" +
            "and email '#email_text' and reemail '#reemail_text' and storename '#storename_text' and membershipType '#memebershipType_checkbox' and individualname '#individualName_Text'")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(n11SellerOfficePageElement.SIGNUP_BTN),
                WaitUntil.the(n11SellerOfficeSignupPageElement.EMAIL_FIELD, isClickable()).forNoMoreThan(2).seconds(),
                Click.on(n11SellerOfficeSignupPageElement.USERNAME_FIELD),
                SendKeys.of(this.username_text).into(n11SellerOfficeSignupPageElement.USERNAME_FIELD),
                Click.on(n11SellerOfficeSignupPageElement.PASSWORD_FIELD),
                SendKeys.of(this.password_text).into(n11SellerOfficeSignupPageElement.PASSWORD_FIELD),
                Click.on(n11SellerOfficeSignupPageElement.REPASSWORD_FIELD),
                SendKeys.of(this.repassword_text).into(n11SellerOfficeSignupPageElement.REPASSWORD_FIELD),
                Click.on(n11SellerOfficeSignupPageElement.EMAIL_FIELD),
                SendKeys.of(this.email_text).into(n11SellerOfficeSignupPageElement.EMAIL_FIELD),
                Click.on(n11SellerOfficeSignupPageElement.REEMAIL_FIELD),
                SendKeys.of(this.reemail_text).into(n11SellerOfficeSignupPageElement.REEMAIL_FIELD),
                Click.on(n11SellerOfficeSignupPageElement.STORENAME_FIELD),
                SendKeys.of(this.storename_text).into(n11SellerOfficeSignupPageElement.STORENAME_FIELD),
                Click.on(n11SellerOfficeSignupPageElement.MEMBERSHIPTYPE_RADIOBTN),
                Click.on(n11SellerOfficeSignupPageElement.MEMBERSHIPTYPE_RADIOBTN),
                Click.on(n11SellerOfficeSignupPageElement.TERMS_CHECKBOX),
                Click.on(n11SellerOfficeSignupPageElement.REGISTER_BTN),
                Click.on(n11SellerOfficeSignupPageElement.CATEGORY_DROPDOWN),
                Click.on(n11SellerOfficeSignupPageElement.CATEGORY_DROPDOWN_CHOOSE),
                Click.on(n11SellerOfficeSignupPageElement.CATEGORY_NAME),
                Click.on(n11SellerOfficeSignupPageElement.INDIVIDUALNAME_FIELD),
                SendKeys.of(this.individualName_text).into(n11SellerOfficeSignupPageElement.INDIVIDUALNAME_FIELD),
                Click.on(n11SellerOfficeSignupPageElement.INDIVIDUALSURNAME_FIELD),
                SendKeys.of(this.individualSurname_text).into(n11SellerOfficeSignupPageElement.INDIVIDUALSURNAME_FIELD),
                Click.on(n11SellerOfficeSignupPageElement.COMPANYNAME_FIELD),
                SendKeys.of(this.companyName_text).into(n11SellerOfficeSignupPageElement.COMPANYNAME_FIELD),
                Click.on(n11SellerOfficeSignupPageElement.BUSINESSNAME_FIELD),
                SendKeys.of(this.businessNameInput_text).into(n11SellerOfficeSignupPageElement.BUSINESSNAME_FIELD),
                Click.on(n11SellerOfficeSignupPageElement.TRADEMARK_FIELD),
                SendKeys.of(this.registeredTrademarkInput_text).into(n11SellerOfficeSignupPageElement.TRADEMARK_FIELD),
                Click.on(n11SellerOfficeSignupPageElement.COMPANYMERSIS_FIELD),
                SendKeys.of(this.companyMersis_text).into(n11SellerOfficeSignupPageElement.COMPANYMERSIS_FIELD)

        );
    }

    public n11SelerOfficeSignUp(String username_text, String password_text, String repassword_text, String email_text,
                                String reemail_text, String storename_text, String individualName_Text, String individualSurname_Text,
                                String companyName_text, String businessNameInput_text, String registeredTrademarkInput_text, String companyMersis_text) {
        this.username_text = username_text;
        this.password_text = password_text;
        this.repassword_text = repassword_text;
        this.email_text = email_text;
        this.reemail_text = reemail_text;
        this.storename_text = storename_text;
        this.individualName_text = individualName_Text;
        this.individualSurname_text = individualSurname_Text;
        this.companyName_text = companyName_text;
        this.businessNameInput_text = businessNameInput_text;
        this.registeredTrademarkInput_text = registeredTrademarkInput_text;
        this.companyMersis_text = companyMersis_text;

    }


    public static n11SelerOfficeSignUp signUpThePage(String username_text, String password_text, String repassword_text,
                                                     String email_text, String reemail_text, String storename_text,
                                                     String individualName_Text, String individualSurname_Text, String companyName_text,
                                                     String businessNameInput_text, String registeredTrademarkInput_text, String companyMersis_text) {
        return instrumented(n11SelerOfficeSignUp.class,
                username_text, password_text, repassword_text, email_text, reemail_text, storename_text, individualName_Text,
                individualSurname_Text, companyName_text, businessNameInput_text, registeredTrademarkInput_text, companyMersis_text);
    }

}
