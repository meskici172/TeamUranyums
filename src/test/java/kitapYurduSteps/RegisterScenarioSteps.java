package kitapYurduSteps;

import com.thoughtworks.gauge.Step;
import elements.Locator;
import methods.Methods;

public class RegisterScenarioSteps {

    Locator elements = new Locator();
    Methods methods = new Methods();

    @Step("Write <text> name")
    public void writeName(String text) {
        methods.clickButton(elements.nameEditText);
        methods.elementeYaz(elements.nameEditText, text);
    }

    @Step("Write <text> surname")
    public void writeSurname(String text) {
        methods.clickButton(elements.surnameEditText);
        methods.elementeYaz(elements.surnameEditText, text);
    }

    @Step("Write <text> email")
    public void writeEmail(String text) {
        methods.clickButton(elements.mailEditText);
        methods.elementeYaz(elements.mailEditText, text);
    }

    @Step("Write <text> password")
    public void writePassword(String text) {
        methods.clickButton(elements.passwordEditTxt);
        methods.elementeYaz(elements.passwordEditTxt, text);
    }

    @Step("Write repeat <text> password")
    public void writeRepeatPassword(String text) {
        methods.clickButton(elements.repeatPasswordEditTxt);
        methods.elementeYaz(elements.repeatPasswordEditTxt, text);
    }

    @Step("Click confirm checkbox")
    public void clickConfirmCheckbox() {
        methods.closeKeyboard();
        methods.clickButton(elements.confirmCheckBox);
    }

    @Step("a_Click register butonnn")
    public void aClickRegisterButonnn() {
        methods.clickButton(elements.registerButton);
    }
}