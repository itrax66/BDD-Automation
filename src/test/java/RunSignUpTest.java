import TestBaseClasses.TestBaseClass;
import cucumber.api.CucumberOptions;

@CucumberOptions(
        features = "src/main/resources/features/Sign Up/"
)
public class RunSignUpTest extends TestBaseClass {
}
