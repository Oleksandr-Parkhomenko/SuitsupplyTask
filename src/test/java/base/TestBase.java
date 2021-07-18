package base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.util.Properties;

import static com.codeborne.selenide.Selenide.open;

public class TestBase {

    private Properties properties = new Properties();
    private String url;

    //get application URL from config file
    private String getURL() {
        try {
            properties.load(this.getClass().getClassLoader().getResourceAsStream("environment.properties"));
            url = properties.getProperty("url");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return url;
    }

    @BeforeMethod
    public void setUp() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());

        Configuration.baseUrl = getURL();
        open(Configuration.baseUrl);
        WebDriverRunner.getWebDriver().manage().window().maximize();
        Configuration.timeout = 20000;
    }

    @AfterMethod(alwaysRun = true)
    protected void tearDown() {
        Selenide.closeWebDriver();
    }

}

