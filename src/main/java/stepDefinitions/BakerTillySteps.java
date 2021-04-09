package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.BakerTillyPage;
import pages.PepsicoPage;

public class BakerTillySteps {
    public final String bakerTillyHeader = "Baker Tilly’s new onboarding experience!";
    BakerTillyPage bakerTillyPage;

    @Given("BakerTilly header is correct")
    public void assertBakerTillyText() {
        Assert.assertEquals(bakerTillyPage.getHeaderText(),bakerTillyHeader);
    }
}
