package org.example.stepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import javafx.scene.control.Tab;
import org.example.pages.P01_register;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {


        P01_register register = new P01_register();
        @Given("user go to register page")
        public void goRegisterPage()  {
            register.registerlink().click();
        }
@And("user select gender type")
    public void user_select_gender_type(){
    register.gender_type().click();
}
@And("^user enter first name \"(.*)\"$")
public void first_name(String x){
    register.firstReg().sendKeys(x);
}
    @And("^last name \"(.*)\"$")
    public void last_name(String y){
            register.lastReg().sendKeys(y);
    }
@And("^user enter day of birth\"(.*)\"$")
    public void data_of_birthday(String x){
    register.date_of_birthdayReg().sendKeys(x);
}
    @And("^user enter month of birth\"(.*)\"$")
    public void data_of_birthmon(String y){
        register.date_of_birthmonReg().sendKeys(y);
    }
    @And("^user enter year of birth\"(.*)\"$")
    public void data_of_birthyear(String z){
        register.date_of_birthyearReg().sendKeys(z);
    }
    @And("^user enter email \"(.*)\"$")
    public void user_enter_email(String z){
        register.user_enter_emailReg().sendKeys(z);
    }
    @And("^user enter company name \"(.*)\"$")
public void user_enter_company(String companyName)  {
            register.user_enter_companyReg().sendKeys(companyName);

        }
    @And("click on select Newsletter option")
    public void click_on_select_Newsletter(){
            register.click_on_select_NewsletterReg().click();
    }

 @And("^user enter password")
 public void user_enter_password(){
     register.user_enter_passwordReg().sendKeys("P@ssw0rd");
    }
    @And("user confirm password")
           public void user_confirm_password(){
            register.user_confirm_passwordReg().sendKeys("P@ssw0rd");
    }
@And("user clicked on REGISTER button")
    public void user_clicked_on_REGISTER_button(){
            register.user_clicked_on_REGISTER_buttonReg().click();
}
    @Then("user should see Your registration completed message")
         public void user_should_see_Your_registration_completed_message(){
        String ExpectedResult = "Your registration completed";
        String ActualResult = Hooks.driver.findElement(By.className("result")).getText();
        Hooks.verify.assertTrue(ActualResult.contains(ExpectedResult),"message Assert");
       Hooks.verify.assertAll();
    }
   @And("color of this message is green")
   public void color_of_this_message(){
String ExpectedResult = "#4cb17c";
String Actualresult = Hooks.driver.findElement(By.className("result")).getCssValue("color");
       Hooks.verify.assertTrue(Actualresult.contains(ExpectedResult),"color Assert");}
    }


