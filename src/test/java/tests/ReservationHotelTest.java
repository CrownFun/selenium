package tests;

import driver.DriverManager;
import org.testng.annotations.Test;
import page.objects.HotelListPage;
import page.objects.HotelSearchPage;
import page.objects.ReservationPage;
import page.objects.SearchResultPage;

import static org.testng.AssertJUnit.assertEquals;

public class ReservationHotelTest extends TestBase {

    @Test
    public void tryToMakeReservationHotel() {

        HotelSearchPage hotelSearchPage = new HotelSearchPage();
        hotelSearchPage.fillDestinationJourneyField("Zakopane");
        hotelSearchPage.selectTypeOfRoom();
        hotelSearchPage.selectNumberOfRooms();
        hotelSearchPage.clickOnSearchButton();

        SearchResultPage searchResultPage = new SearchResultPage();
        searchResultPage.clickOnShowResults();

        HotelListPage hotelListPage = new HotelListPage();
        hotelListPage.clickOnButtonReservation();

        ReservationPage reservationPage = new ReservationPage();
        reservationPage.fillFirstNameField("Anonim");
        reservationPage.fillLastNameField("Anonim");
        reservationPage.fillEmailField("Anonim@anonim.pl");
        reservationPage.fillPhoneNumberField("123456789");
        reservationPage.fillClientFirstName("Anonim");
        reservationPage.fillClientLastName("Anonim");
        reservationPage.chooseInvoicePayment();
        reservationPage.clickToAcceptAgreements();
        reservationPage.clickOnButtonPayment();

        String Title = DriverManager.getWebDriver().getTitle();

        assertEquals(Title, "eTravel Authorization Center");

    }


}
