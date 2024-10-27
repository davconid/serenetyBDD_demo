package automationexercise.tasks.commons;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;

import static automationexercise.pageObjects.Common_pageobject.theAcceptAllCookiesButton;

public class Cookies {

    public static void acceptAllCookies() {
        Actor actor = OnStage.theActorInTheSpotlight();
        if(theAcceptAllCookiesButton.isVisibleFor(actor)) {
            actor.attemptsTo(Click.on(theAcceptAllCookiesButton));
        }
    }
}
