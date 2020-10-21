package com.douglas.testCases;

import com.douglas.pageObjects.LoginPage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;

public class TC03ForgotPassword extends BaseClass {

    @Test
    public void ForgotPassword() throws InterruptedException {
        driver.get(baseURL);
        LoginPage lp = new LoginPage(driver);
        lp.clickAcceptCookies();
        lp.forgotPasswordlink();
        String s1= driver.findElement(By.className("rd__modal-content")).getText();
        System.out.println(s1);
        driver.findElement(By.xpath("/html/body/responsive-design/main/div/div[3]/form/div/div/div[2]/div/div/div/div[1]/div/input")).sendKeys("ankitshrivatri@yahoo.in");
        String str= JOptionPane.showInputDialog("Enter your captcha");
        lp.setEnterCaptcha(str);
        lp.setSendEmailBtn();
        lp.setCloseModal();
    }
}
