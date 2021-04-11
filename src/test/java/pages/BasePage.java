package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class BasePage {
    public By languageDropdown = new  By.ByXPath("//*[@class ='wpml-ls-flag']");
    // Also available from footer menu
    public By customerCasesMenu = new By.ByXPath("//nav[@class = 'navigation main-menu']//*[@href = 'https://appical.net/en/cases/']");
    // Also available from different places on the page
    public By pepsicoCaseMenu = new By.ByXPath("//*[@class = 'navigation main-menu']//*[@href = 'https://appical.net/en/cases/pepsico/']");
    public By englishLanguage = new By.ByXPath("//*[@alt = 'English']");
    public By acceptCookiesButton = new By.ByXPath("//a[@id = 'CybotCookiebotDialogBodyLevelButtonAccept']");

    public By pageHeader = new By.ByClassName("header__title");


    public void openCustomerCasesMenu(){
        $(customerCasesMenu).waitUntil(Condition.visible, Configuration.timeout).hover();
    }

    public void openLanguageDropdown(){
        $(languageDropdown).waitUntil(Condition.visible, Configuration.timeout).click();
    }

    public void selectLanguageFromDropdown(){
        $(englishLanguage).waitUntil(Condition.visible, Configuration.timeout).click();
    }

    public String getHeaderText() {
        return $(pageHeader).getText();
    }

    public void clickAcceptCookiesButton(){
        if ($(acceptCookiesButton).isDisplayed()) {
            $(acceptCookiesButton).click();
        }
    }
}
