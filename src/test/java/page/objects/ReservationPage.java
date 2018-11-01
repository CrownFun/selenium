package page.objects;

import driver.DriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ReservationPage {

    private Logger logger = LogManager.getRootLogger();
    public ReservationPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    @FindBy(name = "userfirstname")
    WebElement firstNameField;

    @FindBy(name = "userlastname")
    WebElement lastNameField;

    @FindBy(name = "useremail")
    WebElement emailField;

    @FindBy(name = "usertelnum")
    WebElement phoneNumberField;

    @FindBy(name = "invoicetypeid")
    WebElement invoice;


    @FindBy(css = "#checkallagree")
    WebElement acceptAgreements;

    @FindBy(css = "#reservationForm > div.box1.color1.payments > div > div.guaranteed.payment.hotelcard > button")
    WebElement buttonPayment;

    @FindBy(id = "forfirstname")
    WebElement clientFirstName;

    @FindBy(id = "forlastname")
    WebElement clientLastName;


    public void fillFirstNameField(String text) {
        firstNameField.sendKeys(text);
        logger.info("Filled first name field");
    }

    public void fillLastNameField(String text) {
        lastNameField.sendKeys(text);
        logger.info("Filled last name field");
    }

    public void fillEmailField(String text) {
        emailField.sendKeys(text);
        logger.info("Filled email field");
    }

    public void fillPhoneNumberField(String text) {
        phoneNumberField.sendKeys(text);
        logger.info("Filled phone number field");
    }

    public void fillClientFirstName(String text){
        clientFirstName.sendKeys(text);
        logger.info("Filled client first name");
    }

    public void fillClientLastName(String text){
        clientLastName.sendKeys(text);
        logger.info("Filled client last name");
    }

    public void chooseInvoicePayment() {
        Select invoiceDropDown = new Select(invoice);
        invoiceDropDown.selectByVisibleText("Bez faktury");
        logger.info("Choosed invoice type");
    }

    public void clickToAcceptAgreements() {
        acceptAgreements.click();
        logger.info("Accepted agreements");
    }

    public void clickOnButtonPayment() {
        buttonPayment.click();
        logger.info("Clicked on button payment");
    }

}
