package pages;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.codeborne.selenide.Selenide.$;

public class DesignYourOwnSideMenuPage {

    private Logger log = LoggerFactory.getLogger(DesignYourOwnSideMenuPage.class);
    private By coat = By.xpath("//*[@automation-key-category-id='custom-made_coats']");


    public void clickCoatButton(){
        $(coat).click();
        log.info("Coat button was clicked");
    }
}
