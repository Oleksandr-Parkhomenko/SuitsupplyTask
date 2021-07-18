package pages;

import com.codeborne.selenide.SelenideElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.shadowCss;
import static com.codeborne.selenide.Selenide.$;

public class CoatPage {

    private Logger log = LoggerFactory.getLogger(CoatPage.class);
    private String rootShadowHost = "cmtm-root[class='hydrated']";
    private SelenideElement fabricButton = $(shadowCss(".title", rootShadowHost, "div:nth-child(1) > ss-card:nth-child(1)"));
    private SelenideElement nextButton = $(shadowCss(".button", rootShadowHost, ".border-solid.width-contained.background-dark.hydrated"));
    private SelenideElement applyButton = $(shadowCss(".button", rootShadowHost, "cmtm-side-navigation > div > ss-button"));
    private SelenideElement fitStyle = $(shadowCss(".main-detail", rootShadowHost, "ss-detail-button[title='Fit']"));
    private SelenideElement MeranoStyle = $(shadowCss("ss-lazy-image > img", rootShadowHost, "#\\34 242495a-4213-4dc9-9de1-e247e4dbabdc"));
    private SelenideElement liningStyle = $(shadowCss(".main-detail", rootShadowHost, "#\\35 89c83e0-68ab-448e-80e0-f5cb308d5b4e"));
    private SelenideElement liningDarkBlueStyle = $(shadowCss("div.title", rootShadowHost, "#\\37 d9619d7-d7a8-4ee8-89de-f4e00b82c33d"));
    private SelenideElement buttonsStyle = $(shadowCss(".main-detail", rootShadowHost, "#d20365b9-6a2e-4f88-9cca-40bd074a34c8"));
    private SelenideElement brownHornButton = $(shadowCss("ss-lazy-image > img", rootShadowHost, "#b3ba44b8-b39c-4057-ba0d-6cc44b8ea6fe"));
    private SelenideElement yourSizeButton = $(shadowCss("main", rootShadowHost, "#\\38 d914671-6fe5-49a4-9685-f82ad4c6c4dd"));
    private SelenideElement size44 = $(shadowCss("ss-button[title='44']", rootShadowHost, ".grid.with-letters.hydrated"));
    private SelenideElement fabricButtonText = $(shadowCss(".name", rootShadowHost, "#\\36 58d023f-705f-42cd-89be-4771a4120511"));
    private SelenideElement fitTypeText = $(shadowCss(".main-detail", rootShadowHost, "#b5f87861-824b-463b-99cb-fb78ade85fb8"));
    private SelenideElement liningTypeText = $(shadowCss(".main-detail", rootShadowHost, "#\\35 89c83e0-68ab-448e-80e0-f5cb308d5b4e"));
    private SelenideElement buttonsTypeText = $(shadowCss(".text", rootShadowHost, "#d20365b9-6a2e-4f88-9cca-40bd074a34c8"));
    private SelenideElement sizeText = $(shadowCss(".main-detail", rootShadowHost, "#\\38 d914671-6fe5-49a4-9685-f82ad4c6c4dd"));
    private SelenideElement addButton = $(shadowCss(".button", rootShadowHost, ".border-solid.width-contained.background-dark.hydrated"));
    private SelenideElement checkoutButton = $("div.cart__summary-buttons.js-cart-buttons > div > a");


    // Select Fabric
    public void selectFabric() {
        fabricButton.scrollIntoView(false);
        fabricButton.click();
        log.info("Fabric was selected");
    }

    public void clickNextButton() {
        nextButton.shouldHave(exactText("Next"));
        nextButton.click();
        log.info("Next button was clicked");
    }

    public void clickApplyButton() {
        applyButton.shouldHave(exactText("Apply"));
        applyButton.click();
        log.info("Apply button was clicked");
    }

    public void clickAddButton() {
        addButton.click();
        log.info("Add button was clicked");
    }

    // Select Fit
    public void clickFitStyle() {
        fitStyle.click();
        log.info("Fit button was clicked");
    }

    // Select Fit type
    public void clickFitMeranoStyle() {
        MeranoStyle.click();
        log.info("Merano Style was clicked");
    }

    // Set Merano Fit Style
    public void setFitMeranoStyle() {
        clickFitStyle();
        clickFitMeranoStyle();
        clickApplyButton();
        log.info("Merano Fit Style was set");
    }

    // Select Lining
    public void clickLiningStyle() {
        liningStyle.click();
        log.info("Lining button was clicked");
    }

    // Select Lining type
    public void clickLiningDarkBlueStyle() {
        liningDarkBlueStyle.scrollIntoView(false);
        liningDarkBlueStyle.click();
        log.info("Lining Dark Blue button was clicked");
    }

    // Set a Dark Blue Lining type
    public void setLiningDarkBlueStyle() {
        clickLiningStyle();
        clickLiningDarkBlueStyle();
        clickApplyButton();
        log.info("Lining Dark Blue type was set");
    }

    // Select Buttons
    public void clickButtonsStyle() {
        buttonsStyle.click();
        log.info("Buttons Style was clicked");
    }

    // Select Buttons type
    public void clickBrownHornButtonStyle() {
        brownHornButton.scrollIntoView(false);
        brownHornButton.click();
        log.info("Brown Horn Button was clicked");
    }

    // Set a Horn Button type
    public void setBrownHornButtonStyle() {
        clickButtonsStyle();
        clickBrownHornButtonStyle();
        clickApplyButton();
        clickNextButton();
        log.info("Brown Horn Button was set");
    }

    // Your size
    public void clickYourSize() {
        yourSizeButton.click();
        log.info("Your size button was clicked");
    }

    // Select Your size
    public void click44Size() {
        size44.click();
        log.info("The 44 size was clicked");
    }

    // Set 44 size
    public void set44Size() {
        clickYourSize();
        click44Size();
        clickApplyButton();
        clickNextButton();
        log.info("The 44 size was set");
    }

    public String getFabricType() {
        return $(fabricButtonText).getText();
    }

    public String getFitType() {
        return $(fitTypeText).getText();
    }

    public String getLiningType() {
        return $(liningTypeText).getText();
    }

    public String getButtonsType() {
        return $(buttonsTypeText).getText();
    }

    public String getSize() {
        return $(sizeText).getText();
    }

    public void confirmCheckoutButtonIsVisible() {
        checkoutButton.shouldBe(visible);
        Assert.assertTrue($(checkoutButton).isDisplayed());
        log.info("Checkout Button Is Visible");
    }
}


