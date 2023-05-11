package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ReasonForTravelPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;
    public void selectReasonForVisit(String reason){
        Reporter.log("Select reason for travel");
        CustomListeners.test.log(Status.PASS, "Select reason for travel");
        clickOnElement(By.xpath("//label[contains(text(),'"+reason+"')]"));
    }

    public void clickContinue(){
        Reporter.log("Click continue" + nextStepButton.toString());
        CustomListeners.test.log(Status.PASS, "Click continue" + nextStepButton.toString());
        clickOnElement(nextStepButton);
    }
}
