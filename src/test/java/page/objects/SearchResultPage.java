package page.objects;

import driver.DriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage {

    private Logger logger = LogManager.getRootLogger();
    public SearchResultPage(){
        PageFactory.initElements(DriverManager.getWebDriver(),this);
    }


    @FindBy(css = "#srchsuggest > div.section.city > div.suggest.first-child > div.term > h3 > a")
    WebElement showResults;


    public void clickOnShowResults(){
        showResults.click();
        logger.info("Clicked on show result button");
    }
}
