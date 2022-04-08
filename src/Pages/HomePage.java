package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);

    }
    
    By numberOfProducts = By.xpath("//*[@id='center_column']/ul");
    By womanSectionButton = By.xpath("//*[@id='block_top_menu']/ul/li[1]/a");
    By returnToHomePageButtonMenu = By.xpath("/html/body/div/div[2]/div/div[3]/div/ul/li/a/span");
    By numberOfProductsOnPageTittle = By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/h1/span[2]");
    By selectedProduct = By.xpath("//*[@id='center_column']/ul/li[1]/div/div[2]/h5/a");
    By popularButtonBy = By.xpath("//*[@id='home-page-tabs']/li[1]/a");
    By bestSellersButtonBy = By.xpath("//*[@id='home-page-tabs']/li[2]/a");
    //By popularPageNumberOfProducts = By.className("product_list grid row homefeatured tab-pane");
    //By numberOfItemsSCC = By.cssSelector("[class^='homefeatured");
    By popularPageNumberOfProducts = By.cssSelector("html body#index.index.hide-left-column.hide-right-column.lang_en div#page div.columns-container div#columns.container div.row div#center_column.center_column.col-xs-12.col-sm-12 div.tab-content ul#homefeatured.product_list.grid.row.homefeatured.tab-pane.active li.ajax_block_product");
    By bestSellersPageNumberOfProducts = By.cssSelector("html body#index.index.hide-left-column.hide-right-column.lang_en div#page div.columns-container div#columns.container div.row div#center_column.center_column.col-xs-12.col-sm-12 div.tab-content ul#blockbestsellers.product_list.grid.row.blockbestsellers.tab-pane.active li.ajax_block_product");

    //public HomePage numberOfProducts(int expectedNumberOfProducts){
       //int actualNumberOFProducts = countItems(bestSellersPageNumberOfProducts);
       //assertIntegerEquals(bestSellersPageNumberOfProducts, actualNumberOFProducts);
        //return this;

    //}

    public HomePage clickOnReturnMenuButton(){
        click(returnToHomePageButtonMenu);
        return this;

    }

    public HomePage womanPageButtonNavigation(){
        click(womanSectionButton);
        return this;

    }

    public HomePage verifyNumberOfAllItemsOnPage(String expectedText){
        String actualTitle = readText(numberOfProductsOnPageTittle);
        assertTextEquals(expectedText, actualTitle);
        return this;
    }
    
    public HomePage selectProductButton(){
        click(selectedProduct);
        return this;
    }

    public HomePage selectPopularButton(){
        click(popularButtonBy);
        return this;
    }

    public HomePage selectBestSellersButton(){
        click(bestSellersButtonBy);
        return this;
    }

    public HomePage numberOfProductsOnPopularPage(int expectedNumberOfProducts){
        int actualNumberOFProducts = countItems(popularPageNumberOfProducts);
        assertIntegerEquals(expectedNumberOfProducts, actualNumberOFProducts);
        return this;
    }
    
    public HomePage numberOfProductsOnBestSellerPage(int expectedNumberOfProducts){
       int actualNumberOFProducts = countItems(bestSellersPageNumberOfProducts);
        assertIntegerEquals(expectedNumberOfProducts, actualNumberOFProducts);
       return this;
    }
}
