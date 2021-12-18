package starter.n11.navigation.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import starter.n11.navigation.user_interface.n11SellerOfficePage;

public class n11SellerOfficeNavigateTo {
    public static Performable theN11SellerOfficePage() {
        return Task.where("{0} opens the n11 seller office page",
                Open.browserOn().the(n11SellerOfficePage.class));
    }
}
