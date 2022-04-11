package Tests;

import org.junit.Test;
import Pages.LoginPage;

public class LoginTest extends BaseTest {


    public LoginPage loginPage;

    String emailAdress = "TestingQAA@testing.com";
    String password = "Testing@1234";
    String completedLogin = "MY ACCOUNT";
    String loginWithoutEmailMessage = "An email address required.";
    String loginWithoutPasswordMessage = "Password is required.";
    String verifySuccessfulSignOutMessage = "AUTHENTICATION";
    String invalidEmailAddress = "proba@proba";
    String invalidEmailAddressMessage = "Invalid email address.";
    String wrongPassword = "Testing";
    String invalidPasswordMessage = "Authentication failed.";

    @Test

    public void loginToWebPage(){

        loginPage = new LoginPage(driver);

        loginPage.basePage();
        loginPage.clickOnSignInButton();
        loginPage.inputLoginData(emailAdress, password);
        loginPage.verifyCompletedLogin(completedLogin);
    }
    

    @Test

    public void loginWithoutEmail(){

        loginPage = new LoginPage(driver);

        loginPage.basePage();
        loginPage.clickOnSignInButton();
        loginPage.inputLoginData("", password);
        loginPage.loginWithoutEmailMessage(loginWithoutEmailMessage);
    }

    @Test

    public void loginWithoutPassword(){

        loginPage = new LoginPage(driver);

        loginPage.basePage();
        loginPage.clickOnSignInButton();
        loginPage.inputLoginData(emailAdress, "");
        loginPage.loginWithoutPasswordMessage(loginWithoutPasswordMessage);
    }


    @Test

    public void signOutFromWebPage(){

        loginPage = new LoginPage(driver);

        loginPage.basePage();
        loginPage.clickOnSignInButton();
        loginPage.inputLoginData(emailAdress, password);
        loginPage.clickOnSignOutButton();
        loginPage.successfulSignOutMessage(verifySuccessfulSignOutMessage);
    }

    @Test

    public void signInWithInvalidEmailAddress(){

        loginPage = new LoginPage(driver);

        loginPage.basePage();
        loginPage.clickOnSignInButton();
        loginPage.inputLoginData(invalidEmailAddress, "");
        loginPage.invalidEmailMessage(invalidEmailAddressMessage);
    }

    @Test

    public void signInWithInvalidPassword(){

        loginPage = new LoginPage(driver);

        loginPage.basePage();
        loginPage.clickOnSignInButton();
        loginPage.inputLoginData(emailAdress, wrongPassword);
        loginPage.invalidEmailMessage(invalidPasswordMessage);
    }


}
