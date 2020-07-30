package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
	public class SearchPage {
		
		@FindBy(xpath=".//*[contain searchroom')]")
		private WebElement loginbutton;

}
}
