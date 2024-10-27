package automationexercise.pageObjects;

import net.serenitybdd.screenplay.targets.SearchableTarget;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.ui.Link;

public class Common_pageobject {
    public static final SearchableTarget theProductsPageLink = Link.containing("Products");

    public static final SearchableTarget theAcceptAllCookiesButton = Target.the("accept all cookies button").locatedBy(".fc-cta-consent");


}
