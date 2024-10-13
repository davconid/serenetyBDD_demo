package automationexercise.stepdefinitions.search;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import automationexercise.navigation.NavigateTo;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Value;

import static automationexercise.pageObjects.Common_pageobject.theProductsPageLink;
import static automationexercise.pageObjects.HomePage_pageObject.*;
import static automationexercise.pageObjects.ProductsPage_pageObject.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class SearchStepDefinitions extends PageObject {

    @Given("{actor} is looking for a product on automationexercise.com")
    public void go_to_products_page(Actor actor) {
        actor.wasAbleTo(
                NavigateTo.TheAutomationexerciseHomePage(),
                Click.on(theAcceptAllCookiesButton),
                Click.on(theProductsPageLink)
        );
    }

    @When("{actor} looks up {string}")
    public void searchesFor(Actor actor, String term) {
        actor.attemptsTo(
                Enter.theValue(term).into(theSearchField)
                        .then(Click.on(theSubmitSearchButton))
        );

    }

    @Then("{actor} should see information about {string}")
    public void should_see_information_about(Actor actor, String term) {
        //using assertion with page object
        actor.attemptsTo(
                Ensure.that(theSearchResults).textValues().allMatch(
                        "The word 'Jeans' is displayed in every products",
                        product -> product.contains(term)
                ),
                Ensure.that(theSearchResults).textValues().hasSize(3)

       );

        //using screenplay question
        actor.should(seeThat(Text.ofEach(theSearchResults).asString(), containsString(term)));

        //using assertion with question
//        actor.attemptsTo(
//                Ensure.that(theTextOfEachOfTheElementsDisplayedAfterTheSearch()).containsAnyOf(term)
//        );
    }

}