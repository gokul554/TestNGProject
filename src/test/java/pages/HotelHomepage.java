package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelHomepage {
	
	//Web Elements
	
	@FindBy(xpath=".//*[contains(text(),'Book a Room')]")
	private WebElement BookaRoom;
	
		@FindBy(xpath=".//a")
		private List<WebElement> AllLinks;

		
		
		//Driver Object
		private WebDriver driver = null;
		
		//Constructor
		public HotelHomepage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		//Url method
		public boolean LaunchApplication(String URL)
		{
			driver.get(URL);
			return BookaRoom.isDisplayed();
			 
		}
		
		//Action method
		public void ActionOnHotelHomePage()
		{
			List<WebElement> links = AllLinks;
			 
			 System.out.println(links.size());
			 
			 for (int i = 1; i<=links.size(); i=i+1)
			 
			 {
			 
			 System.out.println(links.get(i).getText());
			 
			 }
		}
		

}
