package Tests;

import org.junit.Test;

import Pages.CartPage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.ProductListPage;

public class CartPageTest extends BaseTest {
    
    public HomePage homePage;
    public LoginPage loginPage;
    public CartPage cartPage;
    public ProductListPage productListPage;

    String emailAdress = "TestingQAA@testing.com";
    String password = "Testing@1234";
    String totalPrice = "$19.25";
    String confirmationOfAddedItemToCart = "Your shopping cart contains: 1 Product";
    String completedLogin = "MY ACCOUNT";
    String completeOrder = "Your order on My Store is complete.";
    String productAddedSuccessfullyToCart = "Product successfully added to your shopping cart";
    String cartSummaryPageMessage = "01. Summary";
    String totalProductPrice = "$16.51";
    String totalShippingPrice = "$2.00";
    String totalPriceWithoutTax = "$18.51";
    String totalTaxPrice = "$0.00";
    String subTotalPrice = "$18.51";

    @Test

    public void confirmAddToCartProduct(){

        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        cartPage = new CartPage(driver);

        loginPage.basePage();
        loginPage.clickOnSignInButton();
        loginPage.inputLoginData(emailAdress, password);
        loginPage.verifyCompletedLogin(completedLogin);
        homePage.womanPageButtonNavigation();
        homePage.selectProductButton();
        cartPage.clickAddToCart();
        cartPage.clickProcceedToCheckout();
        cartPage.verifyAddedItemToCart(confirmationOfAddedItemToCart);
    }

    @Test

    public void verifyCheckOutAndPaymentProcess(){

        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        cartPage = new CartPage(driver);

        loginPage.basePage();
        loginPage.clickOnSignInButton();
        loginPage.inputLoginData(emailAdress, password);
        loginPage.verifyCompletedLogin(completedLogin);
        homePage.womanPageButtonNavigation();
        homePage.selectProductButton();
        cartPage.clickAddToCart();
        cartPage.clickProcceedToCheckout();
        cartPage.verifyAddedItemToCart(confirmationOfAddedItemToCart);
        cartPage.clickProcceedToCheckout2();
        cartPage.clickProcceedToCheckout3();
        cartPage.agreeTermsClick();
        cartPage.clickProcceedToCheckout4();
        cartPage.clickPayByBankWire();
        cartPage.clickOrderConfirmation();
        cartPage.verifyOrderConfirmation(completeOrder);

    }

    @Test

    public void verifyTotalPriceOfAddedProductToCart(){


        loginPage = new LoginPage(driver);
        productListPage = new ProductListPage(driver);
        cartPage = new CartPage(driver);

        loginPage.basePage();
        productListPage.clickOnTshirtsSectionButton();
        productListPage.selectItemFromTshirtsPage();
        cartPage.clickAddToCart();
        cartPage.verifySuccessfullyAddedProductToCart(productAddedSuccessfullyToCart);
        cartPage.clickCloseWindow();
        cartPage.clickOpenCartPage();
        cartPage.verifyCartPageSummary(cartSummaryPageMessage);
        cartPage.verifyCartTotalProductPrice(totalProductPrice);
        cartPage.verifyCartTotalShippingPrice(totalShippingPrice);
        cartPage.verifyCartTotalPriceWithoutTax(totalPriceWithoutTax);
        cartPage.verifyCartTotalTaxPrice(totalTaxPrice);
        cartPage.verifyCartSubTotalPrice(subTotalPrice);


    }


}
