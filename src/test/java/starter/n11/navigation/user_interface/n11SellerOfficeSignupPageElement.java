package starter.n11.navigation.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class n11SellerOfficeSignupPageElement {

    //Üyelik Bilgileri
    public static Target USERNAME_FIELD = Target.the("username input textBox").located(By.id("usernameInputText"));
    public static Target PASSWORD_FIELD = Target.the("password input textBox").located(By.id("passwordInputText"));
    public static Target REPASSWORD_FIELD = Target.the("re-password input textBox").located(By.id("passwordRetypeInputText"));
    public static Target EMAIL_FIELD = Target.the("email input textBox").located(By.id("emailInputText"));
    public static Target REEMAIL_FIELD = Target.the("re-email input textBox").located(By.id("emailRetypeInputText"));
    public static Target STORENAME_FIELD = Target.the("storeName input textBox").located(By.id("nicknameInputText"));
    public static Target MEMBERSHIPTYPE_RADIOBTN = Target.the("membership type radio button").locatedBy("//label[contains(text(),'Şahıs')]");
    public static Target TERMS_CHECKBOX = Target.the("terms checkbox").located(By.id("acceptTermsAndConditions"));
    public static Target REGISTER_BTN = Target.the("register button").located(By.id("j_id277_j_id_dm"));

    //Faaliyet Kategorisi
    public static Target CATEGORY_DROPDOWN = Target.the("category group dropdown").located(By.id("categoryGroupDropDown"));
    public static Target CATEGORY_DROPDOWN_CHOOSE = Target.the("category Group dropdown choose").locatedBy("//li[contains(text(),'Moda')]");
    public static Target CATEGORY_NAME = Target.the("category name").locatedBy("//tbody/tr[2]/td[1]/div[1]/div[1]/div[2]");

    //Şirket Bilgileri
    public static Target INDIVIDUALNAME_FIELD = Target.the("individual name textBox").located(By.id("individualNameText"));
    public static Target INDIVIDUALSURNAME_FIELD = Target.the("individual surname textBox").located(By.id("individualLastNameText"));
    public static Target COMPANYNAME_FIELD = Target.the("company name textBox").located(By.id("companyNameInputText"));
    public static Target BUSINESSNAME_FIELD = Target.the("business name textBox").located(By.id("businessNameInputText"));
    public static Target TRADEMARK_FIELD = Target.the("registered trademark input textBox").located(By.id("registeredTrademarkInputText"));
    public static Target COMPANYMERSIS_FIELD = Target.the("company mersis textBox").located(By.id("companyMersisText"));


}
