package stepDefinitions;
import com.codeborne.selenide.Configuration;
import io.cucumber.java.en.Given;
import org.junit.Assert;

import pages.BakerTillyPage;
import pages.BasePage;
import pages.NavigationPage;
import pages.PepsicoPage;

public class NavigationPageSteps {


    PepsicoPage pepsicoPage;
    NavigationPage navigationPage;



    @Given("User selects Pepsico menu")
    public void openPepsicoPage() {
        pepsicoPage = navigationPage.selectElementFromDD();
    }




}
