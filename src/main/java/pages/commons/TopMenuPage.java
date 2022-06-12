package pages.commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;
import pages.user.LoginPage;

public class TopMenuPage extends BasePage {
    public TopMenuPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[name='s']")
    private WebElement searchInput;

    @FindBy(css = "#search_widget .search")
    private WebElement searchBtn;

    @FindBy(css = ".user-info a")
    private WebElement goToSignInBtn;

    @FindBy(css = ".account span")
    private WebElement userName;

    // moje
    @FindBy(css = "#category-3 > a")
    private static WebElement proceedToClothes;

    @FindBy(css = "#category-6 > a")
    private static WebElement proceedToAccessories;

    @FindBy(css = "#category-9 > a")
    private static WebElement proceedToArt;

    @FindBy(css = ".h1")
    private static WebElement title;

    // moje

    public LoginPage goToSignIn(){
        click(goToSignInBtn);
        return new LoginPage(driver);
    }

    public void goToMyAccount(){
        click(userName);
    }

    public String getLoggedInUserName(){
        return userName.getText();
    }

    public void searchForProduct(String productToSearch) {
        sendKeys(searchInput, productToSearch);
        click(searchBtn);
    }

    //moje
    public void proceedToClothes() {
        click(proceedToClothes);
    }
    public void proceedToAccessories() {
        click(proceedToAccessories);
    }
    public void proceedToArt() {
        click(proceedToArt);
    }

    public String title() {
        return title.getText();
    }

    //moje


}