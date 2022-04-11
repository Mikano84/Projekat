package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);

    }

    String baseURL = "http://automationpractice.com/index.php";

    By signInButton = By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a");
    By emailAddressToLogin = By.xpath("//*[@id='email']");
    By passwordToLogin = By.xpath("//*[@id='passwd']");
    By emailBy = By.id("email");
    By passwordBy = By.id("passwd");
    By submitLoginButton = By.xpath("//*[@id='SubmitLogin']/span");
    By loginSuccesfull = By.xpath("//*[@id='center_column']/h1");
    By loginPageIdentification = By.xpath("//*[@id='create-account_form']/h3");
    By errorMessageLoginWithoutEmail = By.xpath("//*[@id='center_column']/div[1]/ol/li");
    By errorMessageLoginWithoutPassword = By.xpath("//*[@id='center_column']/div[1]/ol/li");
    By signOutButton = By.xpath("//*[@id='header']/div[2]/div/div/nav/div[2]/a");
    By messageForSuccessfullSignOut = By.xpath("//*[@id='center_column']/h1");
    By messageInvalidEmailAddress = By.xpath("//*[@id='center_column']/div[1]/ol/li");
    By messageInvalidPassword = By.xpath("//*[@id='center_column']/div[1]/ol/li");
    //By orderHistoryButton = By.xpath("//*[@id='center_column']/div/div[1]/ul/li[1]/a/span");
    //By myCreditSlipsButton = By.xpath("//*[@id='center_column']/div/div[1]/ul/li[2]/a/span");



    public LoginPage basePage(){
        driver.get(baseURL);
        return this;

    }

    public LoginPage clickOnSignInButton(){
        click(signInButton);
        return this;
    }

    public LoginPage inputLoginData(String username, String password){
        writeText(emailBy, username);
        writeText(passwordBy, password);
        click(submitLoginButton);
        return this;

    }

    public LoginPage verifyCompletedLogin(String expectedText){
        waitVisibility(loginSuccesfull);
        String actualTitle = readText(loginSuccesfull);
        assertTextEquals(expectedText, actualTitle);
        return this;
    }

    public LoginPage verifyLoginPage(String expectedText){
        waitVisibility(loginPageIdentification);
        String actualTitle = readText(loginPageIdentification);
        assertTextEquals(expectedText, actualTitle);
        return this;
    }

    public LoginPage loginWithoutEmailMessage(String expectedText){
        waitVisibility(errorMessageLoginWithoutEmail);
        String actualTitle = readText(errorMessageLoginWithoutEmail);
        assertTextEquals(expectedText, actualTitle);
        return this;
    }

    public LoginPage loginWithoutPasswordMessage(String expectedText){
        waitVisibility(errorMessageLoginWithoutPassword);
        String actualTitle = readText(errorMessageLoginWithoutPassword);
        assertTextEquals(expectedText, actualTitle);
        return this;
    }

    public LoginPage clickOnSignOutButton(){
        click(signOutButton);
        return this;
    }

    public LoginPage successfulSignOutMessage(String expectedText){
        waitVisibility(messageForSuccessfullSignOut);
        String actualTitle = readText(messageForSuccessfullSignOut);
        assertTextEquals(expectedText, actualTitle);
        return this;
    }

    public LoginPage invalidEmailMessage(String expectedText){
        waitVisibility(messageInvalidEmailAddress);
        String actualTitle = readText(messageInvalidEmailAddress);
        assertTextEquals(expectedText, actualTitle);
        return this;
    }
    
    public LoginPage invalidPasswordMessage(String expectedText){
        waitVisibility(messageInvalidPassword);
        String actualTitle = readText(messageInvalidPassword);
        assertTextEquals(expectedText, actualTitle);
        return this;
    }
}
