package CucumberFeatures;

import Pages.PageNavigator;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignUPTrainingSteps {
    @Given("^I am in the Sign Up page$")
    public void navigate_to_sign_up_page(){
        PageNavigator.BasicTrainingPage().enterSignUpPage();
    }
    @When("I submit the first name \"(.*)\"")
    public void i_submit_first_name(String text){
        PageNavigator.TrainingSignUpPage().enterFirstName(text);
    }
    @When("I submit the last name \"(.*)\"")
    public void i_submit_last_name(String text){
        PageNavigator.TrainingSignUpPage().enterLastName(text);
    }
    @When("I submit the email adress \"(.*)\"")
    public void i_submit_email(String text){
        PageNavigator.TrainingSignUpPage().enterEmailAdress(text);
    }
    @When("I submit the phone 1 \"(.*)\"")
    public void i_submit_phone1(String text){
        PageNavigator.TrainingSignUpPage().enterPhone1(text);
    }
    @When("I submit the phone 2 \"(.*)\"")
    public void i_submit_phone2(String text){
        PageNavigator.TrainingSignUpPage().enterPhone2(text);
    }
    @When("I submit the job role \"(.*)\"")
    public void i_submit_job_role(String text){
        PageNavigator.TrainingSignUpPage().selectJobRole(text);
    }
    @When("I click on the NEXT button")
    public void i_click_on_the_next_button(){
        PageNavigator.TrainingSignUpPage().submitInfo();
    }


}
