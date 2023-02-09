package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.example.pages.P03_ResetPassword;

public class D03_ResetPassword {
    P03_ResetPassword Reset = new P03_ResetPassword();
@When("user click on forgot password")
    public void forgotPassword(){
    Reset.forgot_passwordp03().click();
}

}
