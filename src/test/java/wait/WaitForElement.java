package wait;

import driver.DriverManager;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForElement {




    private static WebDriverWait getWebDriverWait() {

        return new WebDriverWait(DriverManager.getWebDriver(), 20);
    }

    public static void waitUntilElemntsVisible(WebElement element){
        WebDriverWait webDriverWait =  getWebDriverWait();
        webDriverWait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitUntilElemntClickable(WebElement element){
        WebDriverWait webDriverWait = getWebDriverWait();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
    }




}
