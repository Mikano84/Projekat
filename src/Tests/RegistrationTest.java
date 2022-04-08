package Tests;

import org.junit.Test;

import Pages.LoginPage;
import Pages.RegistrationPage;

public class RegistrationTest extends BaseTest {

    public LoginPage loginPage;
    public RegistrationPage registrationPage;

    String emailAdress = "TestingQAAAAA@testing.com"; //promeniti email za testiranje registracije
    String firstName = "Milos";
    String lastName = "Milutinovic";
    String password = "Testing@1234";
    String address = "Ulica bez broja";
    String city = "Beograd";
    String zip = "11000";
    String mobile = "+38166000000";
    String alias = "Ulica za alias";
    String completeRegistration = "MY ACCOUNT";

    @Test
    public void submitRegistrationForm(){

        loginPage = new LoginPage(driver);
        registrationPage = new RegistrationPage(driver);

        loginPage.basePage();
        loginPage.clickOnSignInButton();
        registrationPage.createAccount(emailAdress);
        registrationPage.fillOutRegistrationForm(firstName, lastName, emailAdress, password, address, city, zip, mobile, alias);
        registrationPage.verifyCompletedRegistration(completeRegistration);

    }

    
}
