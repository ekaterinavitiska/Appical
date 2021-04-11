package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.BakerTillyPage;

public class BakerTillySteps {
    public final String bakerTillyHeader = "Baker Tilly";
    BakerTillyPage bakerTillyPage = new BakerTillyPage();

    @Given("BakerTilly page is displayed")
    public void assertBakerTillyText() {
        Assert.assertTrue(bakerTillyPage.getHeaderText().contains(bakerTillyHeader));
    }
}
