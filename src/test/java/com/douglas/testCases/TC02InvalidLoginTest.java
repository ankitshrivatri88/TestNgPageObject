package com.douglas.testCases;

import com.douglas.pageObjects.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC02InvalidLoginTest extends BaseClass{

    @Test
    public void InValidUserNamelogin() throws InterruptedException {

        driver.get(baseURL);
        LoginPage lp = new LoginPage(driver);
        lp.clickAcceptCookies();
        lp.setUsername("Ankit@yahoo.in");
        lp.setPassword(password);
        lp.clickloginButton();
        String actualString = driver.findElement(By.xpath("/html/body/responsive-design/main/div/div[3]/div[1]/div/div[1]/div/form/div[1]/span")).getText();
        String expectedString = "Ihre Eingabedaten sind leider fehlerhaft, stimmen Benutzername und Passwort?";
        Assert.assertEquals(actualString,expectedString);
    }
}
