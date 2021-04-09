package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.BakerTillyPage;
import pages.PepsicoPage;

public class PepsicoPageSteps {
    public final String pepsicoHeader = "PepsiCo Case ";
    PepsicoPage pepsicoPage;
    BakerTillyPage bakerTillyPage;

    @Given("Pepsico Page header is correct")
    public void assertPepsicoText() {
        Assert.assertEquals(pepsicoPage.getHeaderText(), pepsicoHeader);
    }

    @Given("User opens Next Case")
    public void openBakerTillyPage() {
        bakerTillyPage = pepsicoPage.pressNextCase();
    }
}
