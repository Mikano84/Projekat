package Tests;

import org.junit.Test;

import Pages.AccountPage;
import Pages.LoginPage;

public class AccountPageTest extends BaseTest {
    

    public LoginPage loginPage;
    public AccountPage accountPage;

    String emailAdress = "TestingQAA@testing.com";
    String password = "Testing@1234";
    String accountPageVerification = "MY ACCOUNT";
    String orderHistoryPageVerification = "ORDER HISTORY";
    String myCreditSlipsPageVerification = "CREDIT SLIPS";
    String myAddressesPageVerification = "MY ADDRESSES";
    String myPersonalInformationPageTittle = "YOUR PERSONAL INFORMATION";
    String myWishListPageVerificationTittle = "MY WISHLISTS";
    String logoutSucessfullTittle = "CREATE AN ACCOUNT";


    @Test

    public void testLinksOnAccountPage(){

    loginPage = new LoginPage(driver);
    accountPage = new AccountPage(driver);

    loginPage.basePage();
    loginPage.clickOnSignInButton();
    loginPage.inputLoginData(emailAdress, password);
    accountPage.verifyMyAccountTittle(accountPageVerification);
    accountPage.orderHistoryPage();
    accountPage.verifyOrderHistoryPageTittle(orderHistoryPageVerification);
    accountPage.backToMyAccount();
    accountPage.myCreditSlipsPage();
    accountPage.creditSlipsPageTittle(myCreditSlipsPageVerification);
    accountPage.backToMyAccount();
    accountPage.myAddressPage();
    accountPage.myAddressesPageTittle(myAddressesPageVerification);
    accountPage.backToMyAccount();
    accountPage.myPersonalInformationPage();
    accountPage.myPersonalInformationPageTittle(myPersonalInformationPageTittle);
    accountPage.backToMyAccount();
    accountPage.mywishListPage();
    accountPage.myWishListPageTittle(myWishListPageVerificationTittle);
    accountPage.backToMyAccount();
    accountPage.logoutButton();
    loginPage.verifyLoginPage(logoutSucessfullTittle);


    }

}
