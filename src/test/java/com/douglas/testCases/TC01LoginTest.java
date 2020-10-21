package com.douglas.testCases;

import com.douglas.pageObjects.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC01LoginTest extends BaseClass{

    @Test
    public void ValidloginTest() throws InterruptedException {
        driver.get(baseURL);

        LoginPage lp= new LoginPage(driver);
        lp.clickAcceptCookies();
        lp.setUsername(username);
        lp.setPassword(password);
        lp.clickloginButton();
        lp.closePopUpButton();
        if (driver.getCurrentUrl().equals("https://www.douglas.de/mydouglas"))
        {
            Assert.assertTrue(true);
        }
        else
        {
            Assert.assertTrue(false);
        }
    }

}
