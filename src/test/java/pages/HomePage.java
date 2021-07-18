package pages;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    private Logger log = LoggerFactory.getLogger(HomePage.class);
    private By menuButton = By.xpath(".//*[@class='header__wrap']/button");

    public void clickMenuButton(){
        $(menuButton).click();
        log.info("Menu button was clicked");
    }
}
