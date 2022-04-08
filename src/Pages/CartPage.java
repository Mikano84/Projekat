package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage{

    public CartPage(WebDriver driver) {
        super(driver);

    }

    By addToCartButton = By.xpath("//*[@id='add_to_cart']/button/span");
    By procceedToCheckoutButton = By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span");
    By totalPriceOfProduct = By.xpath("//*[@id='cart_summary']/tfoot/tr[7]"); //$19.25
    By procceedToCheckOutButton2 = By.xpath("//*[@id='center_column']/p[2]/a[1]/span");
    By procceedToCheckOutButton3 = By.xpath("//*[@id='center_column']/form/p/button/span");
    By agreeTermsCheckBox = By.xpath("//*[@id='uniform-cgv']");
    By procceedToCheckOutButton4 = By.xpath("//*[@id='form']/p/button/span");
    By successfullAddedOneItemToCart = By.xpath("//*[@id='cart_title']/span");
    By payByBankWire = By.xpath("//*[@id='HOOK_PAYMENT']/div[1]/div/p/a");
    By orderConfirmationButton = By.xpath("//*[@id='cart_navigation']/button/span");
    By completeOrderMessage = By.xpath("//*[@id='center_column']/div/p/strong");
    By productSuccessfullyAddedToCart = By.xpath("//*[@id='layer_cart']/div[1]/div[1]/h2");
    By continueShoppingButton = By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/span/span");
    By closeWindowButton = By.xpath("//*[@id='layer_cart']/div[1]/div[1]/span");
    By openCartPageButton = By.xpath("//*[@id='header']/div[3]/div/div/div[3]/div/a");
    By cartSummaryPageConfirmation = By.xpath("//*[@id='order_step']/li[1]/span");
    By totalProductsPrice = By.xpath("//*[@id='total_product']");
    By totalShippingPrice = By.xpath("//*[@id='total_shipping']");
    By totalPriceWithoutTax = By.xpath("//*[@id='total_price_without_tax']");
    By totalTaxPrice = By.xpath("//*[@id='total_tax']");
    By subTotalPrice = By.xpath("//*[@id='total_price']");
    By addressTextBox = By.xpath("//*[@id='order_step']/li[3]/span");
    By procceedToCheckOutButton1 = By.xpath("//*[@id='center_column']/p[2]/a[1]/span");
    By shippingTextBox = By.xpath("//*[@id='order_step']/li[4]/span");
    By paymentTextBox = By.xpath("//*[@id='step_end']/span");
    By payByBankWireTextBox = By.xpath("//*[@id='center_column']/form/div/h3");


    public CartPage clickAddToCart(){
        assertElementVisible(addToCartButton);
        click(addToCartButton);
        return this;
    }


    public CartPage clickProcceedToCheckout(){
        click(procceedToCheckoutButton);
        return this;
    }

    public CartPage clickProcceedToCheckout1(){
        click(procceedToCheckOutButton1);
        return this;
    }

    public CartPage verifyTotalPriceOfItem(String expectedText){
        String actualTitle = readText(totalPriceOfProduct);
        assertTextEquals(expectedText, actualTitle);
        return this;
    }

    public CartPage verifyAddedItemToCart(String expectedText){
        String actualTitle = readText(successfullAddedOneItemToCart);
        assertTextEquals(expectedText, actualTitle);
        return this;
    }

    public CartPage clickProcceedToCheckout2(){
        click(procceedToCheckOutButton2);
        return this;
    }

    public CartPage clickProcceedToCheckout3(){
        click(procceedToCheckOutButton3);
        return this;
    }

    public CartPage agreeTermsClick(){
        waitVisibility(agreeTermsCheckBox);
        click(agreeTermsCheckBox);
        return this;
    }

    public CartPage clickProcceedToCheckout4(){
        click(procceedToCheckOutButton4);
        return this;
    }

    public CartPage clickPayByBankWire(){
        click(payByBankWire);
        return this;
    }

    public CartPage clickOrderConfirmation(){
        click(orderConfirmationButton);
        return this;
    }

    public CartPage verifyOrderConfirmation(String expectedText){
        String actualTitle = readText(completeOrderMessage);
        assertTextEquals(expectedText, actualTitle);
        return this;
    }

    public CartPage verifySuccessfullyAddedProductToCart(String expectedText){
        String actualTitle = readText(productSuccessfullyAddedToCart);
        assertTextEquals(expectedText, actualTitle);
        return this;
    }

    public CartPage verifyNumberOfItemsInCart(String expectedText){
        String actualTitle = readText(productSuccessfullyAddedToCart);
        assertTextEquals(expectedText, actualTitle);
        return this;
    }

    public CartPage clickContinueShopping(){
        click(continueShoppingButton);
        return this;
    }

    public CartPage clickCloseWindow(){
        click(closeWindowButton);
        return this;
    }

    public CartPage clickOpenCartPage(){
        click(openCartPageButton);
        return this;
    }

    public CartPage verifyCartPageSummary(String expectedText){
        String actualTitle = readText(cartSummaryPageConfirmation);
        assertTextEquals(expectedText, actualTitle);
        return this;

    }

    public CartPage verifyCartTotalProductPrice(String expectedText){
        String actualTitle = readText(totalProductsPrice);
        assertTextEquals(expectedText, actualTitle);
        return this;

    }

    public CartPage verifyCartTotalShippingPrice(String expectedText){
        String actualTitle = readText(totalShippingPrice);
        assertTextEquals(expectedText, actualTitle);
        return this;

    }

    public CartPage verifyCartTotalPriceWithoutTax(String expectedText){
        String actualTitle = readText(totalPriceWithoutTax);
        assertTextEquals(expectedText, actualTitle);
        return this;

    }

    public CartPage verifyCartTotalTaxPrice(String expectedText){
        String actualTitle = readText(totalTaxPrice);
        assertTextEquals(expectedText, actualTitle);
        return this;

    }

    public CartPage verifyCartSubTotalPrice(String expectedText){
        String actualTitle = readText(subTotalPrice);
        assertTextEquals(expectedText, actualTitle);
        return this;

    }

    public CartPage verifyStep3Text(String expectedText){
        String actualTitle = readText(addressTextBox);
        assertTextEquals(expectedText, actualTitle);
        return this;

    }

    public CartPage verifyStep4Text(String expectedText){
        String actualTitle = readText(shippingTextBox);
        assertTextEquals(expectedText, actualTitle);
        return this;

    }

    public CartPage verifyStep5Text(String expectedText){
        String actualTitle = readText(paymentTextBox);
        assertTextEquals(expectedText, actualTitle);
        return this;

    }

    public CartPage verifyStep6Text(String expectedText){
        String actualTitle = readText(payByBankWireTextBox);
        assertTextEquals(expectedText, actualTitle);
        return this;

    }
    
}
