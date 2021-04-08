package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class NavigationPage extends BasePage {

    public PepsicoPage selectElementFromDD(){
        $(pepsicoCaseMenu).waitUntil(Condition.visible, Configuration.timeout).click();
        return new PepsicoPage();
    }


}
