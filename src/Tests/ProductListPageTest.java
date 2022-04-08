package Tests;

import org.junit.Test;

import Pages.CartPage;
import Pages.LoginPage;
import Pages.ProductListPage;

public class ProductListPageTest extends BaseTest {
    
    public LoginPage loginPage;
    public ProductListPage productListPage;

    String numberOfProductsWomanPage = "There are 7 products.";
    String numberOfProductsDressesPage = "There are 5 products.";
    String numberOfProductsTshirtsPage = "There is 1 product.";
    String productAddedSuccessfullyToCart = "Product successfully added to your shopping cart";
    String numberOfItemsInCart = "There is 1 item in your cart.";
    private CartPage cartPage;


    @Test

    public void verifyNumberOfProductsOnAllProductPages(){

        loginPage = new LoginPage(driver);
        productListPage = new ProductListPage(driver);
        

        loginPage.basePage();
        productListPage.clickOnWomanSectionButton();
        productListPage.verifyNumberOfProductsWomanSection(numberOfProductsWomanPage);
        productListPage.clickOnDressesSectionButton();
        productListPage.verifyNumberOfProductsDressesSection(numberOfProductsDressesPage);
        productListPage.clickOnTshirtsSectionButton();
        productListPage.verifyNumberOfProductsTshirtsSection(numberOfProductsTshirtsPage);

    }

    @Test

    public void addProductFromTshirtsPageToCart(){

        loginPage = new LoginPage(driver);
        productListPage = new ProductListPage(driver);
        cartPage = new CartPage(driver);

        loginPage.basePage();
        productListPage.clickOnTshirtsSectionButton();
        productListPage.selectItemFromTshirtsPage();
        cartPage.clickAddToCart();
        cartPage.verifySuccessfullyAddedProductToCart(productAddedSuccessfullyToCart);
        cartPage.clickCloseWindow();
        

    }
}
