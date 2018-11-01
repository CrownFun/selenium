package page.objects;

import driver.DriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class HotelSearchPage {

    private Logger logger = LogManager.getRootLogger();

    public HotelSearchPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }


    @FindBy(name = "query")
    WebElement destinationJourneyField;

    @FindBy(name = "checkin")
    WebElement checkInDateField;

    @FindBy(name = "checkout")
    WebElement checkOutDateField;

    @FindBy(name = "adults")
    WebElement typeOfRoomList;

    @FindBy(name = "rooms")
    WebElement numberOfRoomsList;

    @FindBy(className = "button2-txt")
    WebElement buttonSearchHotel;


    public void fillDestinationJourneyField(String destination) {
        destinationJourneyField.sendKeys(destination);
        logger.info("Filled destination field");
    }

    public void selectTypeOfRoom() {
        Select roomTypeDropDown = new Select(typeOfRoomList);
        roomTypeDropDown.selectByVisibleText("2 osobowy");
        logger.info("Selected type of room");
    }

    public void selectNumberOfRooms() {
        Select roomsNumberDropDown = new Select(numberOfRoomsList);
        roomsNumberDropDown.selectByVisibleText("1 pokój");
        logger.info("Selected number of rooms");
    }

    public void clickOnSearchButton() {
        buttonSearchHotel.click();
        logger.info("Clicked on search button");
    }
}
