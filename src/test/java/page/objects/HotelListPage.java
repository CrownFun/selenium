package page.objects;

import driver.DriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import wait.WaitForElement;

public class HotelListPage {

    private Logger logger = LogManager.getRootLogger();

    public HotelListPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    @FindBy(css = "#offer-3561181_28932_RA3 > td.booknow > a")

    WebElement buttonReservation;

    public void clickOnButtonReservation() {
        WaitForElement.waitUntilElemntsVisible(buttonReservation);
        buttonReservation.click();
        logger.info("Clicked on button reservation");

    }


}
