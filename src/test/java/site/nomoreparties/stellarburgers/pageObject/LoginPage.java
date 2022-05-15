package site.nomoreparties.stellarburgers.pageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

    final static public String URL = "https://stellarburgers.nomoreparties.site/login";

    @FindBy(how = How.XPATH, using = ".//form/fieldset[1]/div/div/input")
    private SelenideElement emailField;

    @FindBy(how = How.XPATH, using = ".//form/fieldset[2]/div/div/input")
    private SelenideElement passwordField;

    @FindBy(how = How.XPATH, using = ".//form/button[text()='Войти']")
    private SelenideElement submitButton;

    @FindBy(how = How.XPATH, using = ".//div/p[1]/a")
    private SelenideElement registrationLink;

    @FindBy(how = How.XPATH, using = ".//div/p[2]/a")
    private SelenideElement forgotPasswordLink;

    @Step("Set email field")
    public void setEmailField(String email) {
        emailField.shouldBe(Condition.visible);
        emailField.setValue(email);
    }

    @Step("Set password field")
    public void setPasswordField(String password) {
        passwordField.shouldBe(Condition.visible);
        passwordField.setValue(password);
    }

    @Step("Submit the login form")
    public void clickSubmitButton() {
        submitButton.click();
    }

    @Step("Set the login form with data and submit it")
    public void setLoginForm(String email, String password) {
        setEmailField(email);
        setPasswordField(password);
    }

}