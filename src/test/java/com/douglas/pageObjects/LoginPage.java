package com.douglas.pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver ldriver;

    public LoginPage(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(id="uc-btn-accept-banner")
    WebElement acceptCookies;

    @FindBy(name="email")
    WebElement txtUserName;

    @FindBy(name="password")
    WebElement txtPassword;

    @FindBy(name="LoginForm|SubmitChanges")
    WebElement btnLogin;

    @FindBy(xpath= "/html/body/responsive-design/main/div/div/div[3]/div/div[5]/div/div/div[1]/div")
    WebElement popUpbtn;

    @FindBy(xpath= "/html/body/responsive-design/main/div/div[3]/div[1]/div/div[1]/div/form/div[2]/span/span/a")
    WebElement forgotBtn;

    @FindBy(name= "captcha")
    WebElement enterCaptcha;

    @FindBy(xpath= "/html/body/responsive-design/main/div/div[3]/form/div/div/div[3]/div/button[2]")
    WebElement sendEmailBtn;

    @FindBy(xpath= "/html/body/responsive-design/main/div/div[3]/form/div/div/div[3]/div/button")
    WebElement closeModal;

    public void clickAcceptCookies()
    {
        acceptCookies.click();
    }
    public void setUsername(String uname)
    {
        txtUserName.sendKeys(uname);
    }

    public void setPassword(String pwd)
    {
        txtPassword.sendKeys(pwd);
    }

    public void clickloginButton()
    {
        btnLogin.click();
    }

    public void closePopUpButton()
    {
        popUpbtn.click();
    }

    public void forgotPasswordlink()
    {
        forgotBtn.click();
    }

    public void setEnterCaptcha(String uname)
    {
        enterCaptcha.sendKeys(uname);
    }

    public void setSendEmailBtn()
    {
        sendEmailBtn.click();
    }

    public void setCloseModal()
    {
        closeModal.click();
    }


}

