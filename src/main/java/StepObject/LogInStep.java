package StepObject;

import PageObject.LogInPage;
import org.openqa.selenium.WebDriver;

public class LogInStep extends LogInPage {
    WebDriver driver;

    public LogInStep(WebDriver driver) {
        super();
    }

    public void LoginStep(WebDriver driver1){
        driver = driver1;

    }
    public void emailInput(String s){
        driver.findElement(emailField).sendKeys(s);
    }

    public void passwordInput(String s){
        driver.findElement(passwordField).sendKeys(s);
    }

    public void logInButton(){
        driver.findElement(LoginButton).click();
    }
}