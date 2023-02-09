package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_login {
    public WebElement loginlink()  {

        return Hooks.driver.findElement(By.className("ico-login")) ;
    }
    public WebElement valid_email_login(){
        return Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement valid_password_login(){
        return Hooks.driver.findElement(By.id("Password"));
    }
    public WebElement login_button(){
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 login-button\"]"));
    }
}
