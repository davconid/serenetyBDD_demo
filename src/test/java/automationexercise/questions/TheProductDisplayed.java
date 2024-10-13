package automationexercise.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.Collection;

import static automationexercise.pageObjects.ProductsPage_pageObject.theSearchResults;

public class TheProductDisplayed {

    public static Question<Collection<String>> textValues() {
        System.out.println(BrowseTheWeb.as(OnStage.theActorInTheSpotlight()).findAll(theSearchResults).texts());
        return Question.about("The product display contains the word '{0}'").answeredBy(
                actor -> BrowseTheWeb.as(actor).findAll(theSearchResults).texts()// returns "red","green","blue"
        );
    }

}