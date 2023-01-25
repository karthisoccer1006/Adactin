package ad.com.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ad.com.baseClass.Reusable_Methods;

public class Select_Hotel extends Reusable_Methods {

	public Select_Hotel(WebDriver xdriver) {
		this.driver = xdriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="radiobutton_0")
	private WebElement radio_Button;

	@FindBy(id="continue")
	private WebElement continue_Button;
	
	@FindBy(id="location_0")
	private WebElement locationName;
	
	public WebElement getLocationName() {
		return locationName;
	}

	public WebElement getRadio_Button() {
		return radio_Button;
	}

	public WebElement getContinue_Button() {
		return continue_Button;
	}
	
}
