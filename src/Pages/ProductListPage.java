package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductListPage extends BasePage {

    public ProductListPage(WebDriver driver) {
        super(driver);

    }
    
    By womanSectionButton = By.xpath("//*[@id='block_top_menu']/ul/li[1]/a");
    By womanSectionNumberOfProducts = By.xpath("//*[@id='center_column']/h1/span[2]");
    By dressesSectionButton = By.xpath("//*[@id='block_top_menu']/ul/li[2]/a");
    By dressesSectionNumberOfProducts = By.xpath("//*[@id='center_column']/h1/span[2]");
    By tshirtsSectionButton = By.xpath("//*[@id='block_top_menu']/ul/li[3]/a");
    By tshirtsSectionNumberOfProducts = By.xpath("//*[@id='center_column']/h1/span[2]");
    By addToCartItemOnTshirtsPage = By.xpath("//*[@id='center_column']/ul/li/div/div[2]/div[2]/a[1]/span");
    By productOnTshirtsPage = By.xpath("//*[@id='center_column']/ul/li/div/div[1]/div/a[1]/img");

    public ProductListPage clickOnWomanSectionButton(){
        click(womanSectionButton);
        return this;
    }

    public ProductListPage clickOnDressesSectionButton(){
        click(dressesSectionButton);
        return this;
    }

    public ProductListPage clickOnTshirtsSectionButton(){
        waitVisibility(tshirtsSectionButton);
        click(tshirtsSectionButton);
        return this;
    }

    public ProductListPage verifyNumberOfProductsWomanSection(String expectedText){
        String actualTitle = readText(womanSectionNumberOfProducts);
        assertTextEquals(expectedText, actualTitle);
        return this;
    }

    public ProductListPage verifyNumberOfProductsDressesSection(String expectedText){
        String actualTitle = readText(dressesSectionNumberOfProducts);
        assertTextEquals(expectedText, actualTitle);
        return this;
    }

    public ProductListPage verifyNumberOfProductsTshirtsSection(String expectedText){
        String actualTitle = readText(tshirtsSectionNumberOfProducts);
        assertTextEquals(expectedText, actualTitle);
        return this;
    }

    public ProductListPage selectItemFromTshirtsPage(){
        click(productOnTshirtsPage);
        return this;
    }

    public ProductListPage addToCartItemFromTshirtsPage(){
        click(addToCartItemOnTshirtsPage);
        return this;
    }


}
