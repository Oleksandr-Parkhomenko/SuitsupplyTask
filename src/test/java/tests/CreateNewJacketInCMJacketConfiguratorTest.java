package tests;

import base.TestBase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CoatPage;
import pages.DesignYourOwnSideMenuPage;
import pages.HomePage;
import pages.LeftSideMenuPage;


public class CreateNewJacketInCMJacketConfiguratorTest extends TestBase {

    private Logger log = LoggerFactory.getLogger(CreateNewJacketInCMJacketConfiguratorTest.class);
    private HomePage homePage = new HomePage();
    private LeftSideMenuPage leftSideMenuPage = new LeftSideMenuPage();
    private DesignYourOwnSideMenuPage designYourOwnSideMenuPage = new DesignYourOwnSideMenuPage();
    private CoatPage coatPage = new CoatPage();

    @Test
    public void createNewCustomJacket() {
        log.info("---- Test" + getClass().getName() + " is started----");
        homePage.clickMenuButton();
        leftSideMenuPage.clickDesignYourOwnButton();
        designYourOwnSideMenuPage.clickCoatButton();
        coatPage.selectFabric();
        coatPage.clickNextButton();
        coatPage.setFitMeranoStyle();
        coatPage.setLiningDarkBlueStyle();
        coatPage.setBrownHornButtonStyle();
        coatPage.set44Size();

        //Summary
        Assert.assertEquals(coatPage.getFabricType(), "Black Pure Wool");
        Assert.assertEquals(coatPage.getFitType(), "Merano");
        Assert.assertEquals(coatPage.getLiningType(), "Dark Blue");
        Assert.assertEquals(coatPage.getButtonsType(), "Brown Horn");
        Assert.assertEquals(coatPage.getSize(), "44");
        log.info("Assertions of Fabric, Fit, Lining, Buttons and Size are successful");

        coatPage.clickAddButton();
        coatPage.confirmCheckoutButtonIsVisible();
        log.info("--------");
    }
}
