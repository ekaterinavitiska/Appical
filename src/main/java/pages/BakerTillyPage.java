package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;


public class BakerTillyPage extends BasePage {

    public By BakerTillyHeader = new By.ByXPath("");

    public String getHeaderText() {
        return $(BakerTillyHeader).getText();
    }

}
