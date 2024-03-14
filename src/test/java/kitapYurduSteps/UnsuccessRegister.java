package kitapYurduSteps;

import com.thoughtworks.gauge.Step;
import elements.Locator;
import methods.Methods;
import org.junit.Assert;

public class UnsuccessRegister {

    Locator elements = new Locator();
    Methods methods = new Methods();

    @Step("a_Application opened")
    public void aaplicationOpened() {
        Assert.assertEquals(methods.getText(elements.applicationOpened), "Tümü");
    }

    @Step("a_Click on My Account button")
    public void aClickMyAccountBtn() {
        methods.clickButton(elements.myAccountBtn);
    }

    @Step("a_Click register button")
    public void aClickRegisterButton() {
        methods.clickButton(elements.registerButton);
    }

    @Step("a_Click register button with null values")
    public void nullValues() {
        methods.clickButton(elements.registerButton);
    }

    @Step("a_Click error message")
    public void aClickErrorMessage() {
        methods.clickButton(elements.confirmButton);
    }
}