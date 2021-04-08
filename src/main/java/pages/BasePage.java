package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class BasePage {
    public By languageDropdown = new  By.ByXPath("");
    public By cuctomerCasesMenu = new By.ByXPath("");
    public By pepsicoCaseMenu = new By.ByXPath("");
    public By englishLanguage = new By.ByXPath("");
    public By englishText = new By.ByXPath("");

    Condition clickable = and("can be clicked", visible, enabled);

    public void clickDropDownMenu(){
        $(cuctomerCasesMenu).waitUntil(Condition.visible, Configuration.timeout).click();
    }

    public void openLanguageDropdown(){
        $(languageDropdown).waitUntil(Condition.visible, Configuration.timeout).click();
    }

    public void selectLanguageFromDropdown(){
        $(englishLanguage).waitUntil(Condition.visible, Configuration.timeout).click();
    }


    public String getHeaderText() {
        return $(englishText).getText();
    }
}
