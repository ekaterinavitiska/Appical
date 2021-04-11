package stepDefinitions;
import com.codeborne.selenide.Configuration;
import io.cucumber.java.en.Given;
import org.junit.Assert;

import pages.BakerTillyPage;
import pages.BasePage;
import pages.NavigationPage;
import pages.PepsicoPage;

public class NavigationPageSteps {
    NavigationPage navigationPage = new NavigationPage();
    PepsicoPage pepsicoPage;

    @Given("User selects Pepsico menu")
    public void openPepsicoPage() {
        pepsicoPage = navigationPage.selectElementFromDropDown();
    }
}
