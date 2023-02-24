package homeWork19;

import org.testng.annotations.DataProvider;

public class CertificateData {
    @DataProvider
    public Object[][] certificateList(){
        return new Object[][]{
                {"invalid1"},
                {"invalid2"},
                {"invalid3"},
                {"valid"}
        };
    }

}
