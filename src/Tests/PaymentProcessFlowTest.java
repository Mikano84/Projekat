package Tests;

import org.junit.Test;

import Pages.CartPage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.ProductListPage;

public class PaymentProcessFlowTest extends BaseTest {

    public HomePage homePage;
    public LoginPage loginPage;
    public CartPage cartPage;
    public ProductListPage productListPage;
    
    String emailAdress = "TestingQAA@testing.com";
    String password = "Testing@1234";
    String completedLogin = "MY ACCOUNT";
    String productAddedSuccessfullyToCart = "Product successfully added to your shopping cart";
    String cartSummaryPageMessage = "01. Summary";
    String addressSummaryPageMessagee = "03. Address";
    String shippingSummaryPageMessage = "04. Shipping";
    String paymentSummaryPageMessage = "05. Payment";
    String payByBankWirePageMessage = "BANK-WIRE PAYMENT.";
    String completeOrder = "Your order on My Store is complete.";

    
    @Test

    public void stepOnePaymentProcessFlow(){

        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        cartPage = new CartPage(driver);
        productListPage = new ProductListPage(driver);

        loginPage.basePage();
        loginPage.clickOnSignInButton();
        loginPage.inputLoginData(emailAdress, password);
        loginPage.verifyCompletedLogin(completedLogin);
        productListPage.clickOnTshirtsSectionButton();
        productListPage.selectItemFromTshirtsPage();
        cartPage.clickAddToCart();
        cartPage.verifySuccessfullyAddedProductToCart(productAddedSuccessfullyToCart);
        cartPage.clickCloseWindow();
        cartPage.clickOpenCartPage();
        cartPage.verifyCartPageSummary(cartSummaryPageMessage);

    }

    @Test

    public void stepTwoPaymentProcessFlow(){

        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        cartPage = new CartPage(driver);
        productListPage = new ProductListPage(driver);

        loginPage.basePage();
        loginPage.clickOnSignInButton();
        loginPage.inputLoginData(emailAdress, password);
        loginPage.verifyCompletedLogin(completedLogin);
        productListPage.clickOnTshirtsSectionButton();
        productListPage.selectItemFromTshirtsPage();
        cartPage.clickAddToCart();
        cartPage.verifySuccessfullyAddedProductToCart(productAddedSuccessfullyToCart);
        cartPage.clickCloseWindow();
        cartPage.clickOpenCartPage();
        cartPage.verifyCartPageSummary(cartSummaryPageMessage);
        cartPage.clickProcceedToCheckout1();
        cartPage.verifyStep3Text(addressSummaryPageMessagee);

    }

    @Test

    public void stepThreePaymentProcessFlow(){

        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        cartPage = new CartPage(driver);
        productListPage = new ProductListPage(driver);

        loginPage.basePage();
        loginPage.clickOnSignInButton();
        loginPage.inputLoginData(emailAdress, password);
        loginPage.verifyCompletedLogin(completedLogin);
        productListPage.clickOnTshirtsSectionButton();
        productListPage.selectItemFromTshirtsPage();
        cartPage.clickAddToCart();
        cartPage.verifySuccessfullyAddedProductToCart(productAddedSuccessfullyToCart);
        cartPage.clickCloseWindow();
        cartPage.clickOpenCartPage();
        cartPage.verifyCartPageSummary(cartSummaryPageMessage);
        cartPage.clickProcceedToCheckout1();
        cartPage.verifyStep3Text(addressSummaryPageMessagee);
        cartPage.clickProcceedToCheckout3();
        cartPage.verifyStep4Text(shippingSummaryPageMessage);
        cartPage.agreeTermsClick();


    }

    @Test

    public void stepFourPaymentProcessFlow(){

        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        cartPage = new CartPage(driver);
        productListPage = new ProductListPage(driver);

        loginPage.basePage();
        loginPage.clickOnSignInButton();
        loginPage.inputLoginData(emailAdress, password);
        loginPage.verifyCompletedLogin(completedLogin);
        productListPage.clickOnTshirtsSectionButton();
        productListPage.selectItemFromTshirtsPage();
        cartPage.clickAddToCart();
        cartPage.verifySuccessfullyAddedProductToCart(productAddedSuccessfullyToCart);
        cartPage.clickCloseWindow();
        cartPage.clickOpenCartPage();
        cartPage.verifyCartPageSummary(cartSummaryPageMessage);
        cartPage.clickProcceedToCheckout1();
        cartPage.verifyStep3Text(addressSummaryPageMessagee);
        cartPage.clickProcceedToCheckout3();
        cartPage.verifyStep4Text(shippingSummaryPageMessage);
        cartPage.agreeTermsClick();
        cartPage.clickProcceedToCheckout4();
        cartPage.verifyStep5Text(paymentSummaryPageMessage);


    }

    @Test

    public void stepFivePaymentProcessFlow(){

        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        cartPage = new CartPage(driver);
        productListPage = new ProductListPage(driver);

        loginPage.basePage();
        loginPage.clickOnSignInButton();
        loginPage.inputLoginData(emailAdress, password);
        loginPage.verifyCompletedLogin(completedLogin);
        productListPage.clickOnTshirtsSectionButton();
        productListPage.selectItemFromTshirtsPage();
        cartPage.clickAddToCart();
        cartPage.verifySuccessfullyAddedProductToCart(productAddedSuccessfullyToCart);
        cartPage.clickCloseWindow();
        cartPage.clickOpenCartPage();
        cartPage.verifyCartPageSummary(cartSummaryPageMessage);
        cartPage.clickProcceedToCheckout1();
        cartPage.verifyStep3Text(addressSummaryPageMessagee);
        cartPage.clickProcceedToCheckout3();
        cartPage.verifyStep4Text(shippingSummaryPageMessage);
        cartPage.agreeTermsClick();
        cartPage.clickProcceedToCheckout4();
        cartPage.verifyStep5Text(paymentSummaryPageMessage);
        cartPage.clickPayByBankWire();
        cartPage.verifyStep6Text(payByBankWirePageMessage);


    }

    @Test

    public void stepFinalPaymentProcessFlow(){

        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        cartPage = new CartPage(driver);
        productListPage = new ProductListPage(driver);

        loginPage.basePage();
        loginPage.clickOnSignInButton();
        loginPage.inputLoginData(emailAdress, password);
        loginPage.verifyCompletedLogin(completedLogin);
        productListPage.clickOnTshirtsSectionButton();
        productListPage.selectItemFromTshirtsPage();
        cartPage.clickAddToCart();
        cartPage.verifySuccessfullyAddedProductToCart(productAddedSuccessfullyToCart);
        cartPage.clickCloseWindow();
        cartPage.clickOpenCartPage();
        cartPage.verifyCartPageSummary(cartSummaryPageMessage);
        cartPage.clickProcceedToCheckout1();
        cartPage.verifyStep3Text(addressSummaryPageMessagee);
        cartPage.clickProcceedToCheckout3();
        cartPage.verifyStep4Text(shippingSummaryPageMessage);
        cartPage.agreeTermsClick();
        cartPage.clickProcceedToCheckout4();
        cartPage.verifyStep5Text(paymentSummaryPageMessage);
        cartPage.clickPayByBankWire();
        cartPage.verifyStep6Text(payByBankWirePageMessage);
        cartPage.clickOrderConfirmation();
        cartPage.verifyOrderConfirmation(completeOrder);
    
    }




}


