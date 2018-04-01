package core;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleMainPage extends BasePage {


        @FindBy(name="q")
        private WebElement search;

        public GoogleMainPage(WebDriver driver) {
        super(driver);
        }


    public void enterText(String search){
            this.search.clear();
            this.search.sendKeys(search, Keys.ENTER);
        }

}
