package automationexercise.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable TheAutomationexerciseHomePage() {
        return Task.where("{0} opens the automationexercise home page",
                Open.browserOn().thePageNamed("TheAutomationexerciseHomePage"));
//                Open.browserOn().the(TheAutomationexerciseHomePage.class));
    }
}
