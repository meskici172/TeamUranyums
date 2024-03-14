package kitapYurduSteps;

import com.thoughtworks.gauge.Step;
import elements.Locator;
import methods.Methods;
import org.junit.Assert;

import static org.assertj.core.api.Assertions.assertThat;

public class UnsuccessLoginSteps {
    Locator elements = new Locator();
    Methods methods = new Methods();

    @Step("Application opened")
    public void applicationOpened() {
        Assert.assertEquals(methods.getText(elements.applicationOpened), "Tümü");
    }

    @Step("Click on My Account button")
    public void clickOnMyAccountBtn() {
        methods.clickButton(elements.myAccountBtn);
    }
    @Step("Invalid <text> email written")
    public void invalidEmailWritten(String text) {
        methods.clickButton(elements.emailEditText);
        methods.elementeYaz(elements.emailEditText, text);
    }

    @Step("Invalid <text> password written")
    public void invalidPasswordWritten(String text) {
        methods.clickButton(elements.passwordEditText);
        methods.elementeYaz(elements.passwordEditText, text);
    }

    @Step("Click button")
    public void clickButton() {
        methods.clickButton(elements.loginButton);
    }

    @Step("Click error message")
    public void clickErrorMessage() {
        methods.clickButton(elements.confirmButton);
    }

    @Step("Click back button")
    public void clickBackButton() {
        methods.clickButton(elements.backButton);
    }
}