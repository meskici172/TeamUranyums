package kitapYurduSteps;

import com.thoughtworks.gauge.Step;
import elements.Locator;
import methods.Methods;
import org.junit.Assert;


public class LoginScenarioSteps {

    Locator elements = new Locator();
    Methods methods = new Methods();


    @Step("Write <text> in the e-mail field")
    public void writeEmailField(String text) {

        methods.clickButton(elements.emailEditText);
        methods.elementeYaz(elements.emailEditText, text);
    }

    @Step("Write <text> in the password field")
    public void writePasswordField(String text) {

        methods.clickButton(elements.passwordEditText);
        methods.elementeYaz(elements.passwordEditText, text);
    }

    @Step("Click login button")
    public void clickLoginBtn() {
        methods.clickButton(elements.loginButton);
    }

    @Step("Login control")
    public void loginControl() {
        //Assert.assertEquals(methods.getText(elements.), "mehmeth eskici");
    }

    @Step("Click on My Account buttonn")
    public void clickAccountBtn() {
        methods.clickButton(elements.myAccountBtn);
    }
}