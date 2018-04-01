import core.GoogleMainPage;
import org.testng.annotations.Test;

public class SimpleTest extends TestBase {


    @Test
    public void search() {
        GoogleMainPage googleMainPage = new GoogleMainPage(driver);
        googleMainPage.open();
        googleMainPage.enterText("facebook");
    }


}


