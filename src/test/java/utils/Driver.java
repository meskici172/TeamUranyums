package utils;

import com.thoughtworks.gauge.AfterSuite;
import com.thoughtworks.gauge.BeforeSuite;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {

    public static AndroidDriver androidDriver;

    @BeforeSuite
    public void startDriver() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appPackage","com.mobisoft.kitapyurdu");
        capabilities.setCapability("appActivity","com.mobisoft.kitapyurdu.main.SplashActivity");
        capabilities.setCapability("platformName","Android");
        androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterSuite
    public void closeDriver() {
        if (androidDriver != null) {
            androidDriver.quit();
        }
    }
}