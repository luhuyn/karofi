package huyenltt20.pages;

import huyenltt20.core.AppiumBase;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WelcomePage extends AppiumBase {
    public WelcomePage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(xpath = "//android.view.View[@content-desc=\"Vietnam\"]")
    private WebElement Vietnam;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Tiếp tục\"]")
    private WebElement vietnameseContinueButton;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Chọn Quốc Gia\"]/android.widget.ImageView")
    private WebElement selectCountryTextbox;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Chọn Quốc Gia\"]/android.view.View[2]//android.view.View[1]/android.widget.Button")
    private WebElement selectedCountry;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Continue\"]")
    private WebElement continueButton;

    public void selectVietnam(){
        wait.until(ExpectedConditions.visibilityOf(Vietnam));
        wait.until(ExpectedConditions.elementToBeClickable(vietnameseContinueButton));
        vietnameseContinueButton.click();
    }
    public void selectOtherCountry(String country){
        wait.until(ExpectedConditions.elementToBeClickable(Vietnam)).click();

        wait.until(ExpectedConditions.visibilityOf(selectCountryTextbox));
        selectCountryTextbox.click();
        selectCountryTextbox.sendKeys(country);
        actions.keyDown(Keys.ENTER).perform();

        wait.until(ExpectedConditions.visibilityOf(selectedCountry));
        selectedCountry.click();

        wait.until(ExpectedConditions.visibilityOf(continueButton));
        continueButton.click();
    }
}
