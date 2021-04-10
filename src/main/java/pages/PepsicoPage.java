package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PepsicoPage extends BasePage{

    public By nextCaseLink = new By.ByXPath("//*[@class = 'case-nav']//*[contains(@href,'case-study-baker-tilly-2/')]");

    public String getHeaderText() {
        return $(pageHeader).getText();
    }
    public BakerTillyPage pressNextCase(){
        $(nextCaseLink).scrollTo();
        $(nextCaseLink).click();
        return new BakerTillyPage();
    }
}
