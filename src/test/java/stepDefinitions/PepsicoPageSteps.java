package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.BakerTillyPage;
import pages.PepsicoPage;

public class PepsicoPageSteps {
    public final String pepsicoHeader = "PepsiCo Case";
    PepsicoPage pepsicoPage = new PepsicoPage();
    BakerTillyPage bakerTillyPage;

    @Given("Pepsico Page is displayed")
    public void assertPepsicoText() {
        Assert.assertEquals(pepsicoHeader, pepsicoPage.getHeaderText());
    }

    @Given("User opens Next Case")
    public void openBakerTillyPage() {
        bakerTillyPage = pepsicoPage.pressNextCase();
    }
}
