package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_register {

    public WebElement registerlink()  {

        return Hooks.driver.findElement(By.cssSelector("a[href=\"/register?returnUrl=%2F\"]")) ;
    }
    public WebElement gender_type(){
        return Hooks.driver.findElement(By.id("gender-male"));
    }
public WebElement firstReg (){
        return Hooks.driver.findElement(By.id("FirstName"));
}
    public WebElement lastReg (){
        return Hooks.driver.findElement(By.id("LastName"));
    }
    public WebElement date_of_birthdayReg(){
        return Hooks.driver.findElement(By.name("DateOfBirthDay"));
    }
    public WebElement date_of_birthmonReg(){
        return Hooks.driver.findElement(By.name("DateOfBirthMonth"));
    }
    public WebElement date_of_birthyearReg(){
        return Hooks.driver.findElement(By.cssSelector("select[name=\"DateOfBirthYear\"]"));
    }
    public WebElement user_enter_emailReg(){
        return Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement user_enter_companyReg(){
        return Hooks.driver.findElement(By.id("Company"));

    }
    public WebElement click_on_select_NewsletterReg(){
        return Hooks.driver.findElement(By.id("Newsletter"));
    }
    public WebElement user_enter_passwordReg(){
        return Hooks.driver.findElement(By.id("Password"));
    }
public WebElement user_confirm_passwordReg(){
    return Hooks.driver.findElement(By.id("ConfirmPassword"));
}
public WebElement user_clicked_on_REGISTER_buttonReg(){
    return Hooks.driver.findElement(By.id("register-button"));
}





}
