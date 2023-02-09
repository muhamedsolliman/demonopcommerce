package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P01_register;
import org.example.pages.P02_login;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {
    P02_login login = new P02_login();
SoftAssert verifylogin = new SoftAssert();
@Given("user go to login page")
    public void user_go_to_login_page() throws InterruptedException {
    login.loginlink().click();
    Thread.sleep(3000);
}
    @And("^user Enter valid Email\"(.*)\"$")
    public void user_login_with_valid_Email(String Email){
    login.valid_email_login().sendKeys(Email);

    }
    @And("^write the password \"(.*)\"$")
    public void write_the_password(String password){
        login.valid_password_login().sendKeys(password);

}
@And("press on login button")
public void press_on_login_button() throws InterruptedException {
    login.login_button().click();
    Thread.sleep(3000);
}
    @Then("Home page will Appear")
    public void currentUrl(){
        Hooks.verify.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/","invalidUrl");
        Hooks.verify.assertAll();
    }
@And("My account tab isDisplayed")
    public void MyAccountTap(){
    Hooks.verify.assertTrue(Hooks.driver.findElement(By.cssSelector("a[href=\"/customer/info\"]")).isDisplayed(),"MyAccountTap");
}
}

