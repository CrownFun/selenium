package tests;

import org.testng.annotations.Test;
import page.objects.LoginPage;
import page.objects.TopMenuPage;

import static org.testng.Assert.assertEquals;


public class FailedLoginTest extends TestBase {

    @Test
    public void tryToLoginWithIncorrectLoginAndPassword() {

        TopMenuPage topMenuPage = new TopMenuPage();
        topMenuPage.clickOnButtonLogin();

        LoginPage loginPage = new LoginPage();
        loginPage.fillUserNameField("WrongUsername");
        loginPage.fillPasswordField("WrongUsername");
        loginPage.clickOnbuttonLogin();

        String messageLabel = loginPage.getFailedLoginMessage();
        assertEquals(messageLabel, "Błędny login lub haslo");
    }


}
