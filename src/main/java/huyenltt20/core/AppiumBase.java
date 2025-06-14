package huyenltt20.core;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class AppiumBase {
    public static AndroidDriver driver;
    public static WebDriverWait wait;
    public static Actions actions;

    public void createDriver() throws MalformedURLException {
        UiAutomator2Options uiAutomator2Options = new UiAutomator2Options();
        uiAutomator2Options.setAutomationName("UiAutomator2")
                .setUdid("R5CX62RY7CW")
                .setPlatformName("Android")
                .setAppPackage("com.karofi.k365.iotp.mobile.uat")
                .setAppActivity("com.karofi.k365.iotp.mobile.uat.MainActivity")
                .setNoReset(false)
                .setAutoGrantPermissions(true);
        driver = new AndroidDriver(new URL("http://localhost:4723"), uiAutomator2Options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        actions = new Actions(driver);
    }
    public void quitDriver() {
        driver.quit();
    }
}
