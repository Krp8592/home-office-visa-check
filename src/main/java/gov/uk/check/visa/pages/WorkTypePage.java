package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class WorkTypePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;
    public void selectJobType(String job){
        Reporter.log("Select job type");
        CustomListeners.test.log(Status.PASS, "Select job type" + nextStepButton.toString());
        clickOnElement(By.xpath("//label[contains(text(),'"+job+"')]"));
    }

    public void clickContinue(){
        Reporter.log("Click continue" + nextStepButton.toString());
        CustomListeners.test.log(Status.PASS, "Click continue" + nextStepButton.toString());
        clickOnElement(nextStepButton);
    }
}
