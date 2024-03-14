package kitapYurduSteps;

import com.thoughtworks.gauge.Step;
import elements.Locator;
import methods.Methods;

public class PaymentSteps {

    Locator elements = new Locator();
    Methods methods = new Methods();

    @Step("Click searchButton")
    public void clickSearchButton() {
        methods.clickButton(elements.searchBtn);
    }

    @Step("Write <text> in searchBox")
    public void clickSearchButton(String text) {
        methods.clickButton(elements.searchBox);
        methods.elementeYaz(elements.searchBox, text);
    }

    @Step("Click first search result")
    public void clickFirstResult() {
        methods.clickButton(elements.firstSearchResult);
    }

    @Step("Click first addToCart button")
    public void clickAddToCartBtn() {
        methods.clickButton(elements.addToCartBtn);
    }


}
