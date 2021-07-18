package pages;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.codeborne.selenide.Selenide.$;

public class LeftSideMenuPage {

    private Logger log = LoggerFactory.getLogger(LeftSideMenuPage.class);
    private By designYourOwnButton = By.cssSelector("li.nav-links__item.js-nav-links-item.js-category-men-nav-custom-made > button");

    public void clickDesignYourOwnButton(){
        $(designYourOwnButton).click();
        log.info("Menu button was clicked");
    }

}
