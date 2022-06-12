package pages.user;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

public class OrderDetailsPage extends BasePage {
    public OrderDetailsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#content > table > tbody > tr > th")
    private WebElement referenceOrderNumber;

    public String setReferenceOrderNumber() {
        return referenceOrderNumber.getText();
    }

    @FindBy(css = "#content > table > tbody > tr > td.text-sm-center.order-actions > a:nth-child(1)")
    private WebElement orderDetails;

    public OrderDetailsPage goToOrderDetails(){
        click(orderDetails);
        return this;
    }
}