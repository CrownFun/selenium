package page.objects;

import driver.DriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import wait.WaitForElement;

public class TopMenuPage {

    private Logger logger = LogManager.getRootLogger();

    public TopMenuPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }


    @FindBy(css = "#user_panel > span > a")
    WebElement buttonLogin;

    @FindBy(css = " #user_panel > span.ttaccount.tipka_hastip > a")
    WebElement buttonMyAccount;

    public void clickOnButtonLogin() {
        WaitForElement.waitUntilElemntsVisible(buttonLogin);
        buttonLogin.click();
        logger.info("Clicked on login button");
    }


    public boolean isButtonMyAccountIsDisplayed() {
        WaitForElement.waitUntilElemntsVisible(buttonMyAccount);
        return buttonMyAccount.isDisplayed();
    }

}
