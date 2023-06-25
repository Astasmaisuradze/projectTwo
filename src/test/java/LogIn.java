import StepObject.LogInStep;
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

        LogInStep step1 = new LogInStep(driver);
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


        LogInStep step2 = new LogInStep(driver);
        step2.emailInput(correctEmailData);
        step2.passwordInput(correctPasswordData);
        step2.logInButton();
        Thread.sleep(5000);
        driver.close();

    }



}





