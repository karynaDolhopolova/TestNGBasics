package homeWork19;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageCertificate {
    @FindBy(xpath = "//div[@class=\"certificate-check_group\"]/input")
    WebElement input;
    @FindBy(xpath = "//div[@class=\"certificate-check_group\"]/button")
    WebElement checkButton;
    @FindBy(className = "certificate-check_message")
    WebElement checkMessage;

    public void enterCertificateNum (String number){
        input.sendKeys(number);
    }
    public boolean messageDisplay (){
       return checkMessage.isEnabled();
    }
    public void clickButton(){
        checkButton.click();
    }



}
