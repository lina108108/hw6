package ru.netology.web.page;

import com.codeborne.selenide.SelenideElement;
import ru.netology.web.data.DataHelper;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private SelenideElement loginField = $("[data-ru.netology.web.test-id=login] input");
    private SelenideElement passwordField = $("[data-ru.netology.web.test-id=password] input");
    private SelenideElement loginButton = $("[data-ru.netology.web.test-id=action-login]");

    public VerificationPage validLogin(DataHelper.AuthInfo info) {
        loginField.setValue(info.getLogin());
        passwordField.setValue(info.getPassword());
        loginButton.click();
        return new VerificationPage();
    }
}