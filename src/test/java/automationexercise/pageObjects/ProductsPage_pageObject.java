package automationexercise.pageObjects;

import net.serenitybdd.screenplay.ensure.web.ElementsLocated;
import net.serenitybdd.screenplay.targets.SearchableTarget;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.ui.Button;
import net.serenitybdd.screenplay.ui.PageElement;


public class ProductsPage_pageObject {
    public static final Target theSearchField = Target.the("search field").locatedBy("#search_product");
    public static final SearchableTarget theSubmitSearchButton = Button.withNameOrId("submit_search");
    public static final Target theSearchResults = ElementsLocated.by(".productinfo p");
    public static final SearchableTarget theSearchedProductsTitleWithTextComparison = PageElement.containingTextIgnoringCase(".title.text-center", "Searched products");
    public static final SearchableTarget theSearchedProductsTitle = PageElement.withCSSClass(".title.text-center");

}
