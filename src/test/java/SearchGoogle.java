import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchGoogle {

    private static final ChromeDriver driver = new ChromeDriver();
    WebForm webForm = new WebForm(driver);

    @Given("I open browser")
    public void iOpenBrowser() {
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @And("Open Google Website")
    public void openGoogleWebsite() throws InterruptedException {
        driver.get(Utils.BASE_URL);
        Thread.sleep(500);
    }

    @And("Located on google website")
    public void locatedOnGoogleWebsite() {
        webForm.checkButtonDisplayed();
    }

    @When("I search {string}")
    public void iSearch(String arg0) {
        webForm.inputField(arg0);
        webForm.inputFieldEnter();
    }

    @Then("Showing result related with {string}")
    public void showingResultRelatedWith(String arg0) {
        webForm.checkLinkedInDisplayed();
        driver.close();
        driver.quit();
    }
}
