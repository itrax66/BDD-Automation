package Pages;


import Pages.Repository.BasicTrainingPage;
import Pages.Repository.TrainingSignUpPage;

public class PageNavigator {
    //Allows navigation using the test class
    public static BasicTrainingPage BasicTrainingPage(){
        return new BasicTrainingPage();
    }
    public static TrainingSignUpPage TrainingSignUpPage(){return new TrainingSignUpPage();}
}
