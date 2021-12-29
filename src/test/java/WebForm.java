import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebForm extends  PageObject{

    @FindBy(name = "btnK")
    private WebElement btnSearch;

    @FindBy(name = "q")
    private WebElement inputField;

    @FindBy(xpath = "//a[@href='https://id.linkedin.com/in/akhdanpangestuaji']")
    private WebElement linkedInName;

    public WebForm(WebDriver driver) {
        super(driver);
    }

    public void inputField(String name) {
        this.inputField.sendKeys(name);
    }

    public void inputFieldEnter() {
        this.inputField.sendKeys(Keys.ENTER);
    }

    public void checkButtonDisplayed(){
        this.btnSearch.isDisplayed();
    }

    public void checkLinkedInDisplayed(){
        this.linkedInName.isDisplayed();
    }
}
