package com.douglas.testCases;

import com.douglas.pageObjects.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC02InvalidLoginTest extends BaseClass{

    @Test(priority = 1)
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

    @Test(priority = 2)
    public void InValidPasswordlogin() throws InterruptedException {

        driver.get(baseURL);
        LoginPage lp = new LoginPage(driver);
        lp.setUsername(username);
        lp.setPassword("12345");
        lp.clickloginButton();
        String actualString = driver.findElement(By.xpath("/html/body/responsive-design/main/div/div[3]/div[1]/div/div[1]/div/form/div[1]/span")).getText();
        String expectedString = "Ihre Eingabedaten sind leider fehlerhaft, stimmen Benutzername und Passwort?";
        Assert.assertEquals(actualString,expectedString);
    }

    @Test(priority = 3)
    public void VerifyEmptyFields() throws InterruptedException {

        driver.get(baseURL);
        LoginPage lp = new LoginPage(driver);
        lp.setUsername("");
        lp.setPassword("");
        lp.clickloginButton();
        String emptyUsernameField = driver.findElement(By.xpath("/html/body/responsive-design/main/div/div[3]/div[1]/div/div[1]/div/form/div[1]/label/span[1]")).getText();
        String emptyPasswordField = driver.findElement(By.xpath("/html/body/responsive-design/main/div/div[3]/div[1]/div/div[1]/div/form/div[2]")).getText();
        if (emptyUsernameField.equals("E-Mail Adresse: Bitte füllen Sie das Feld aus.") || emptyPasswordField.equals("Passwort: Bitte füllen Sie das Feld aus."))
        {
            System.out.println("Username or Password is blank");
        }
        else {
            System.out.println("Fields are present ");
        }
    }
}
