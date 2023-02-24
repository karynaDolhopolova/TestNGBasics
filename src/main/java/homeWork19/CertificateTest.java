package homeWork19;

import config.BaseClass1;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ResourceBundle;

public class CertificateTest extends BaseClass1 {

    PageCertificate pageCertificate;
    @Test(dataProvider = "certificateList", dataProviderClass = CertificateData.class)
    public void TestCert(String type){
        driver.get("https://certificate.ithillel.ua/");
        ResourceBundle bundle=ResourceBundle.getBundle(type);
        pageCertificate = PageFactory.initElements(driver, PageCertificate.class);
        pageCertificate.enterCertificateNum(bundle.getString("number"));
        pageCertificate.clickButton();
        Assert.assertTrue(pageCertificate.messageDisplay(),bundle.getString("message"));

    }
}
