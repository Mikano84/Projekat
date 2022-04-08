package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage extends BasePage {


    public RegistrationPage(WebDriver driver) {
        super(driver);

    }


    String createAccountAndSignInURL = "http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation";



    By emailAddressToCreateAccount = By.id("email_create");
    By createAccountButton = By.id("SubmitCreate");
    By firstNamePersonal = By.xpath("//*[@id='customer_firstname']");
    By lastNamePersonal = By.xpath("//*[@id='customer_lastname']");
    By emailPersonal = By.xpath("//*[@id='email']");
    By passwordPersonal = By.xpath("//*[@id='passwd']");
    By firstNameAddress = By.xpath("//*[@id='firstname']");
    By lastNameAddress = By.xpath("//*[@id='lastname']");
    By addressAddress = By.xpath("//*[@id='address1']");
    By cityAddress = By.xpath("//*[@id='city']");
    By stateAddress = By.xpath("//*[@id='id_state']");
    By zipPostalCodeAddress = By.xpath("//*[@id='postcode']");
    By countryAddress = By.xpath("//*[@id='id_country']");
    By mobilePhoneAddress = By.xpath("//*[@id='phone_mobile']");
    By aliasAddress = By.xpath("//*[@id='alias']");

    By registerButton = By.xpath("//*[@id='submitAccount']/span");

    By registerCompletedText = By.xpath("/html/body/div/div[2]/div/div[3]/div/h1");


    public RegistrationPage createAccount (String email){
        writeText(emailAddressToCreateAccount, email);
        click(createAccountButton);
        return this;
    }



    public RegistrationPage fillOutRegistrationForm(String firstName, String lastName, String email, String password, String address,  String city, String zip, String mobile, String alias){
        writeText(firstNamePersonal, firstName);
        writeText(lastNamePersonal, lastName);
        writeText(emailPersonal, email);
        writeText(passwordPersonal, password);
        writeText(firstNameAddress, firstName);
        writeText(lastNameAddress, lastName);
        writeText(addressAddress, address);
        writeText(cityAddress, city);
        writeText(zipPostalCodeAddress, zip);
        writeText(mobilePhoneAddress, mobile);
        writeText(aliasAddress, alias);
        selectByText(stateAddress, "Alabama");
        click(registerButton);
        return this;

    }



/*     private void Select(By stateAddress) {
        WebElement identifier = driver.findElement(By.id("id_state"));
        Select select = new Select(identifier);
        select.selectByVisibleText("Alabama"); 
    } */

    public RegistrationPage verifyCompletedRegistration(String expectedText){
        String actualTitle = readText(registerCompletedText);
        assertTextEquals(expectedText, actualTitle);
        return this;
    }

}
