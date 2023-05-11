package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ResultPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h2")
    WebElement  resultMessage;

    public String getResultMessage(){
        Reporter.log("Get result message" + resultMessage.toString());
        CustomListeners.test.log(Status.PASS, "Get result message" + resultMessage.toString());
        return getTextFromElement(resultMessage);
    }
    public void confirmResultMessage(String expectedMessage){
        Reporter.log("Verify result message" + resultMessage.toString());
        CustomListeners.test.log(Status.PASS, "Verify result message" + resultMessage.toString());
         resultMessage.isDisplayed();
    }
}
