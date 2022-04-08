package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage extends BasePage {

    public AccountPage(WebDriver driver) {
        super(driver);

    }

    By accountPageTittle = By.xpath("//*[@id='center_column']/h1");
    By orderHistoryButton = By.xpath("//*[@id='center_column']/div/div[1]/ul/li[1]/a/span");
    By myCreditSlipsButton = By.xpath("//*[@id='center_column']/div/div[1]/ul/li[2]/a/span");
    By myAddressesButton = By.xpath("//*[@id='center_column']/div/div[1]/ul/li[3]/a/span");
    By myPersonalInformationButton = By.xpath("//*[@id='center_column']/div/div[1]/ul/li[4]/a/span");
    By myWhishListsButton = By.xpath("//*[@id='center_column']/div/div[2]/ul/li/a/span");
    By babkToMyAccountButton = By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a/span");
    By orderHistoryPageTittle = By.xpath("//*[@id='center_column']/h1");
    By creditSlipsPageTittle = By.xpath("//*[@id='center_column']/h1");
    By myAddressesPageTittle = By.xpath("//*[@id='center_column']/h1");
    By myPersonalInformationPageTittle = By.xpath("//*[@id='center_column']/div/h1");
    By myWhishListPageTittle = By.xpath("//*[@id='mywishlist']/h1");
    By logoutButtonBy = By.xpath("//*[@id='header']/div[2]/div/div/nav/div[2]/a");
    By backToHomeButton = By.xpath("//*[@id='columns']/div[1]/a/i");

    public AccountPage verifyMyAccountTittle(String expectedText){
        String actualTitle = readText(accountPageTittle);
        assertTextEquals(expectedText, actualTitle);
        return this;
    }

    public AccountPage orderHistoryPage(){
        waitVisibility(orderHistoryButton);
        click(orderHistoryButton);
        return this;
    }
    public AccountPage myCreditSlipsPage(){
        waitVisibility(myCreditSlipsButton);
        click(myCreditSlipsButton);
        return this;
    }

    public AccountPage myAddressPage(){
        waitVisibility(myAddressesButton);
        click(myAddressesButton);
        return this;
    }

    public AccountPage myPersonalInformationPage(){
        waitVisibility(myPersonalInformationButton);
        click(myPersonalInformationButton);
        return this;
    }

    public AccountPage mywishListPage(){
        waitVisibility(myWhishListsButton);
        click(myWhishListsButton);
        return this;
    }

    public AccountPage backToMyAccount(){
        waitVisibility(babkToMyAccountButton);
        click(babkToMyAccountButton);
        return this;
    }

    public AccountPage verifyOrderHistoryPageTittle(String expectedText){
        waitVisibility(orderHistoryPageTittle);
        String actualTitle = readText(orderHistoryPageTittle);
        assertTextEquals(expectedText, actualTitle);
        return this;
    }

    public AccountPage creditSlipsPageTittle(String expectedText){
        waitVisibility(creditSlipsPageTittle);
        String actualTitle = readText(creditSlipsPageTittle);
        assertTextEquals(expectedText, actualTitle);
        return this;
    }

    public AccountPage myAddressesPageTittle(String expectedText){
        waitVisibility(myAddressesPageTittle);
        String actualTitle = readText(myAddressesPageTittle);
        assertTextEquals(expectedText, actualTitle);
        return this;
    }

    public AccountPage myPersonalInformationPageTittle(String expectedText){
        waitVisibility(myPersonalInformationPageTittle);
        String actualTitle = readText(myPersonalInformationPageTittle);
        assertTextEquals(expectedText, actualTitle);
        return this;
    }

    public AccountPage myWishListPageTittle(String expectedText){
        waitVisibility(myWhishListPageTittle);
        String actualTitle = readText(myWhishListPageTittle);
        assertTextEquals(expectedText, actualTitle);
        return this;
    }

    public AccountPage logoutButton(){
        waitVisibility(logoutButtonBy);
        click(logoutButtonBy);
        return this;
    }

    public AccountPage backToHomeButton(){
        waitVisibility(backToHomeButton);
        click(backToHomeButton);
        return this;
    }
}
