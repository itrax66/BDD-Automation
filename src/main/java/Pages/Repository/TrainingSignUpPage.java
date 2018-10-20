package Pages.Repository;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class TrainingSignUpPage extends BasicTrainingPage {

    @FindBy(css = "#id_firstname")
    WebElement firstNameInput;

    @FindBy(css = "#id_lastname")
    WebElement lasttNameInput;

    @FindBy(css = "#id_email")
    WebElement emailAdressInput;

    @FindBy(css = "#id_phone1")
    WebElement phone1Input;

    @FindBy(css = "#id_phone2")
    WebElement phone2Input;

    @FindBy(css = "#id_profile_field_jobrole")
    WebElement jobRoleList;

    @FindBy(css = "input[name = 'submit']")
    WebElement nextButton;

    public void enterFirstName(String text){
        submitText(firstNameInput,text);


    }
    public void enterLastName(String text){
        submitText(lasttNameInput,text);

    }
    public void enterEmailAdress(String text){
        submitText(emailAdressInput,text);

    }
    public void enterPhone1(String text){
        submitText(phone1Input,text);

    }
    public void enterPhone2(String text){
        submitText(phone2Input,text);

    }
    public void selectJobRole(String text){
        Select jobRoleSelect = new Select(jobRoleList);
        jobRoleSelect.selectByVisibleText(text);
        reportLogBeforeAction("option was successfully chosen", Status.PASS);
    }
    public void submitInfo(){
        clickElement(nextButton);
    }

}
