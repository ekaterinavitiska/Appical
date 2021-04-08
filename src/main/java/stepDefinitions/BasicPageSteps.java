package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.BasePage;

import static com.codeborne.selenide.Selenide.open;

public class BasicPageSteps {
    BasePage basePage = new BasePage();
    public final String basePageHeader = "Give your new hires a personal and unforgettable onboarding experience!";

    @Given("User opens basic page")
    public void openBasicPage() {
        open("/https://appical.net/");

    }

    @Given("User selects English language from dropdown")
    public void selectEnglishLanguage() {
        basePage.openLanguageDropdown();
        basePage.selectLanguageFromDropdown();
    }

    @Given("Selected Language is English")
    public void assertIfLanguageIsEnglish() {
        Assert.assertEquals(basePage.getHeaderText(), basePageHeader);
    }

    @Given("User presses Customer Cases menu")
    public void openCustomerCasesMenu() {
        basePage.clickDropDownMenu();
    }


}
