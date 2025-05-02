package Tests;


import Pages.RegistrationPage;
import Utils.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.security.PublicKey;


public class RegistrationTest extends BaseTest {

    @Test(priority = 1)
    public void Invalidregistration() throws InterruptedException {
        driver.get("https://labsqajobs.qaharbor.com/candidate-registration/");
        RegistrationPage regi = new RegistrationPage();
        Thread.sleep(2000);
        regi.Registration("ayhkam789", "asdf.com","QAHharbor","QAHarbor");

        String ExpectedURL = "https://labsqajobs.qaharbor.com/candidate-registration/?status=success";
        String ActualURL=driver.getCurrentUrl();
        Assert.assertNotEquals(ActualURL,ExpectedURL,"Registration error");
    }



    @Test(priority = 1)
    public void validRegistration() throws InterruptedException {
        driver.get("https://labsqajobs.qaharbor.com/candidate-registration/");
       RegistrationPage regis = new RegistrationPage();
       regis.Registration("anamikamukherjee","anamikamukherjeesumi@gmail.com", "Bolbona8235@","Bolbona8235@");
        Thread.sleep(5000);

        String ExpectedURL = "https://labsqajobs.qaharbor.com/candidate-registration/?status=success";
        String ActualURL = driver.getCurrentUrl();
        Thread.sleep(5000);
        Assert.assertEquals(ActualURL,ExpectedURL,"Registration error");
    }

}
