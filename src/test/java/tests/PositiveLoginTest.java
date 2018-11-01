package tests;

import org.testng.annotations.Test;
import page.objects.LoginPage;
import page.objects.TopMenuPage;

import static org.testng.Assert.assertTrue;

public class PositiveLoginTest extends TestBase {


    @Test
    public void tryToLoginWithCorrectLoginAndPassword() {
        TopMenuPage topMenuPage = new TopMenuPage();
        topMenuPage.clickOnButtonLogin();

        LoginPage loginPage = new LoginPage();
        loginPage.fillUserNameField("tester_demo@onet.pl");
        loginPage.fillPasswordField("testerDemo");
        loginPage.clickOnbuttonLogin();
        assertTrue(topMenuPage.isButtonMyAccountIsDisplayed());


    }


}
