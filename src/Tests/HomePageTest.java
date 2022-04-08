package Tests;

import org.junit.Test;

import Pages.HomePage;
import Pages.LoginPage;

public class HomePageTest extends BaseTest {

    public HomePage homePage;
    public LoginPage loginPage;

    int numberOfProductsPopularPage = 7;
    int numberOfProductsBestSellersPage = 7;
    String emailAdress = "TestingQAA@testing.com";
    String password = "Testing@1234";
    String numberOfProductsOnPage = "There are 7 products.";

    @Test

    public void confirmNumberOfProducts(){

        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);

        loginPage.basePage();
        loginPage.clickOnSignInButton();
        loginPage.inputLoginData(emailAdress, password);
        homePage.womanPageButtonNavigation();
        homePage.verifyNumberOfAllItemsOnPage(numberOfProductsOnPage);

    }
   
    @Test

    public void verifyNumberOfProductsOnPopularPage(){

        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
    
        loginPage.basePage();
        homePage.numberOfProductsOnPopularPage(numberOfProductsPopularPage);

    }
   
    @Test

    public void verifyNumberOfProductsOnBestSellerPage(){

        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
    
        loginPage.basePage();
        homePage.selectBestSellersButton();
        homePage.numberOfProductsOnBestSellerPage(numberOfProductsBestSellersPage);
    }
   
}
