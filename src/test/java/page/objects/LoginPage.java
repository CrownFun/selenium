package page.objects;

import driver.DriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import wait.WaitForElement;

public class LoginPage {

    private Logger logger = LogManager.getRootLogger();

    public LoginPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    @FindBy(id = "login_username")
    WebElement userNameField;


    @FindBy(id = "login_password")
    WebElement passwordField;

    @FindBy(css = "#login_submit > span > span")
    WebElement buttonLogin;

    @FindBy(id = "login_message")
    WebElement failedLoginMessage;

    public void fillUserNameField(String userName) {
        userNameField.sendKeys(userName);
        logger.info("Filled username field");
    }

    public void fillPasswordField(String password) {
        passwordField.sendKeys(password);
        logger.info("Filled password field");
    }

    public void clickOnbuttonLogin() {
        buttonLogin.click();
        logger.info("Cicked on login button");
    }


    public String getFailedLoginMessage() {
        WaitForElement.waitUntilElemntsVisible(failedLoginMessage);
        String failedLoginMessageText = failedLoginMessage.getText();
        return failedLoginMessageText;
    }

}