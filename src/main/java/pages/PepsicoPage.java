package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PepsicoPage extends BasePage{

    public By pepsicoHeader = new By.ByXPath("");
    public By nextCaseLink = new By.ByXPath("");


    public  boolean isHeaderVisible() {
        return $(pepsicoHeader).isDisplayed();
    }

    public String getHeaderText() {
        return $(pepsicoHeader).getText();
    }
    public BakerTillyPage pressNextCase(){

        $(nextCaseLink).waitUntil(Condition.visible, Configuration.timeout).click();
        return new BakerTillyPage();
    }



}
