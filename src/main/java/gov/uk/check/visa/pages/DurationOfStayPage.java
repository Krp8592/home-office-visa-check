package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class DurationOfStayPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='6 months or less']")
    WebElement lessThanSixMonth;

    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='longer than 6 months']")
    WebElement moreThanSixMonths;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;

    public void selectLengthOfStay(String moreOrLess){
        Reporter.log("Select length of stay" + moreThanSixMonths.toString());
        Reporter.log("Select length of stay" + lessThanSixMonth.toString());
        CustomListeners.test.log(Status.PASS, "Select length of stay" + moreThanSixMonths.toString());
        CustomListeners.test.log(Status.PASS, "Select length of stay" + lessThanSixMonth.toString());

        String duration = moreOrLess;

        switch (duration){
            case "more":
                clickOnElement(moreThanSixMonths);
                break;
            default:
                clickOnElement(lessThanSixMonth);
        }
    }

    public void clickContinue(){
        Reporter.log("Click continue" + nextStepButton.toString());
        CustomListeners.test.log(Status.PASS, "Click continue" + nextStepButton.toString());
        clickOnElement(nextStepButton);
    }
}
