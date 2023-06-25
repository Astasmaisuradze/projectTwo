<<<<<<< HEAD
import StepObject.LogInStep;
=======
import StepObject.LogInSteps;
>>>>>>> 4b325a8 (change file name.)
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static DataObject.LogInData.*;



public class LogIn {
    @Test
    public void logInWithInCorrectData() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://github.com/login");
        String actualTitle = driver.getTitle();
        String expectedTitle = "Sign in to GitHub · GitHub";
        Assert.assertEquals(actualTitle, expectedTitle);

<<<<<<< HEAD
        LogInStep step1 = new LogInStep(driver);
=======
        LogInSteps step1 = new LogInSteps(driver);
>>>>>>> 4b325a8 (change file name.)
        step1.emailInput(incorrectEmailData);
        step1.passwordInput(incorrectPasswordData);
        step1.logInButton();
        Thread.sleep(5000);
    }
    @Test
    public void logInWithCorrectData() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://github.com/login");
        String actualTitle = driver.getTitle();
        String expectedTitle ="GitHub";
        Assert.assertNotEquals(actualTitle, expectedTitle);

<<<<<<< HEAD
        LogInStep step2 = new LogInStep(driver);
=======
        LogInSteps step2 = new LogInSteps(driver);
>>>>>>> 4b325a8 (change file name.)
        step2.emailInput(correctEmailData);
        step2.passwordInput(correctPasswordData);
        step2.logInButton();
        Thread.sleep(5000);
        driver.close();

    }



}





