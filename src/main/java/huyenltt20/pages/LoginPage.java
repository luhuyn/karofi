package huyenltt20.pages;

import huyenltt20.core.AppiumBase;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class LoginPage extends AppiumBase {
    public LoginPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(xpath ="//android.view.View[@content-desc=\"Chào bạn!\"]")
    private WebElement vietnameseWelcomeText;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Chào bạn!\"]/following-sibling::android.widget.ImageView")
    private WebElement vietnamFlag;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Số điện thoại\"]/following-sibling::android.widget.EditText")
    private WebElement phoneNumber;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Mật khẩu\"]/following-sibling::android.widget.EditText")
    private WebElement vietnamesePassword;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Đăng Nhập\"]")
    private WebElement loginButton;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Quên mật khẩu?\"]")
    private WebElement vietnameseForgotPasswordLink;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Đăng ký tài khoản\"]")
    private WebElement registerLink;

    @FindBy(xpath ="//android.view.View[@content-desc=\"Hello!\"]")
    private WebElement welcomeText;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Hello!\"]/following-sibling::android.widget.ImageView")
    private WebElement flag;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Email\"]/following-sibling::android.widget.EditText")
    private WebElement email;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Password\"]/following-sibling::android.widget.EditText")
    private WebElement password;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Sign in\"]")
    private WebElement signInButton;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Forgot password?\"]")
    private WebElement forgotPasswordLink;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Sign up\"]")
    private WebElement signUpLink;

    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]//android.widget.FrameLayout//android.view.View//android.widget.ImageView[2]")
    private WebElement vietnamBanner;

    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout//android.view.View//android.view.View[2]/android.view.View/android.widget.ImageView")
    private WebElement banner;

    public void verifyVietnamLoginScreen(){
        Assert.assertTrue(vietnameseWelcomeText.isDisplayed(), "Text 'Chào bạn!' is not displayed");
        Assert.assertTrue(vietnamFlag.isDisplayed(), "Vietnam flag is not displayed");
        Assert.assertTrue(phoneNumber.isDisplayed(), "Phone number is not displayed");
        Assert.assertTrue(vietnamesePassword.isDisplayed(), "Password is not displayed");

        Assert.assertTrue(loginButton.isDisplayed(), "Login button is not displayed");
        Assert.assertTrue(loginButton.isEnabled(), "Login button is not enabled");

        Assert.assertTrue(registerLink.isDisplayed(), "Register link is not displayed");
        Assert.assertTrue(vietnameseForgotPasswordLink.isDisplayed(), "Forgot password link is not displayed");
        Assert.assertTrue(vietnamBanner.isDisplayed(), "Banner is not displayed");
    }

    public void verifyOtherCountryLoginScreen(){
        Assert.assertTrue(welcomeText.isDisplayed(), "Welcome text is not displayed");
        Assert.assertTrue(flag.isDisplayed(), "Flag is not displayed");
        Assert.assertTrue(email.isDisplayed(), "Email is not displayed");
        Assert.assertTrue(password.isDisplayed(), "Password is not displayed");

        Assert.assertTrue(signInButton.isDisplayed(), "Sign in button is not displayed");
        Assert.assertTrue(signInButton.isEnabled(), "Sign in button is not enabled");

        Assert.assertTrue(signUpLink.isDisplayed(), "Sign up button is not displayed");
        Assert.assertTrue(forgotPasswordLink.isDisplayed(), "Forgot password link is not displayed");
        Assert.assertTrue(banner.isDisplayed(), "Banner is not displayed");
    }

    public void login(String phoneNum, String pwd){

        wait.until(ExpectedConditions.visibilityOf(phoneNumber)).click();
        phoneNumber.clear();
        phoneNumber.sendKeys(phoneNum);

        vietnamesePassword.click();
        vietnamesePassword.clear();
        vietnamesePassword.sendKeys(pwd);

        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
    }
}
