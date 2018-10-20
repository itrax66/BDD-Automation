package Pages.Repository;

import Pages.BasePageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasicTrainingPage extends BasePageObject {

    @FindBy(xpath = "//div[@class ='no-login-button']//a[text()='Log in']")
    WebElement loginButton;
    @FindBy(xpath = "//div[@class ='no-login-button']//a[text()='Sign up']")
    WebElement signUpButton;

    public TrainingLoginPage enterLoginPage(){
        clickElement(loginButton);

        return new TrainingLoginPage();
    }
    public TrainingSignUpPage enterSignUpPage(){
        clickElement(signUpButton);
        return new TrainingSignUpPage();
    }

}
