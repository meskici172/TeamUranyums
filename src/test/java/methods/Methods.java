package methods;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Methods extends BaseTest{

    private Logger logger = LoggerFactory.getLogger(getClass());
    HashMap<String,String> keyMap = new HashMap<>();


    public void clickButton(By locator){
        WebDriverWait checkElement = new WebDriverWait(driver,10);
        checkElement.until(ExpectedConditions.visibilityOfElementLocated(locator));
        driver.findElement(locator).click();
        logger.info("Clicked on " + locator);
    }

    public void testAdBlocking(By locator) {

        // Reklamı kapatmak için bekleme süresi
        WebDriverWait wait = new WebDriverWait(driver, 40);

        // Reklamı kapatan elementi bulma
        WebElement closeButton = wait.until(ExpectedConditions.presenceOfElementLocated(locator));

        // Reklamın görünüp görünmediğini kontrol etme
        boolean isAdDisplayed = closeButton.isDisplayed();

        // Eğer reklam görünüyorsa kapatma işlemini gerçekleştirme
        if (isAdDisplayed) {
            closeButton.click();
            logger.info("reklam kapatildi");
        }else {
            logger.info("reklam cikmadi.");
        }


    }

    public void closeKeyboard() {
        driver.hideKeyboard();
    }

    public boolean checkElement(By locator){
        try {
            WebDriverWait checkElement = new WebDriverWait(driver,10);
            checkElement.until(ExpectedConditions.visibilityOfElementLocated(locator));
            logger.info("Found element");
            return true;
        }
        catch (Exception e){
            logger.info("Not found ");
            return false;
        }
    }


    public String getCheckBox(WebElement w){
        return w.findElement(By.className("android.widget.CheckBox")).getText();
    }
    public void clickRandomTwo(By locator){
        checkElement(locator);
        List<MobileElement> brands = driver.findElements(locator);
        Random rand = new Random();
        int randomFirst = rand.nextInt(brands.size());
        int randomSecond;
        do{randomSecond =rand.nextInt(brands.size());} while(randomFirst==randomSecond);

        int total= Integer.valueOf(getCheckBox(brands.get(randomFirst))) + Integer.valueOf(getCheckBox(brands.get(randomSecond)));
        keyMap.put("searchResult", String.valueOf(total));

        brands.get(randomFirst).click();
        brands.get(randomSecond).click();
    }
    public void elementeYaz(By locater, String value) {
        driver.findElement(locater).sendKeys(value);
        logger.info(locater + " elementine " + value + " yazildi.");
    }
    public String getText(By locater) {
        String text = driver.findElement(locater).getText();
        logger.info(locater + "de " + text + "yazıyor");
        return text;
    }
    public void clickRandomAndSave(By locator, String key) {

        checkElement(locator);
        List<MobileElement> elements = driver.findElements(locator);
        Random rand = new Random();
        int index = rand.nextInt(Math.min(elements.size(), 13));
        String savedTxt = elements.get(index).getText();
        elements.get(index).click();
        logger.info("Bulunan Elemente Random Metodu Ile Tiklandi");
        saveValue(key, savedTxt);
        logger.info(locator + " Elementinde Bulunan " + savedTxt + " Text Degeri " + key + " Adiyla Kaydedildi");
    }
    public void saveValue(String key, String val) {
        keyMap.put(key, val);

    }
}