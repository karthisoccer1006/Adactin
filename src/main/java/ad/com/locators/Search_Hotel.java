package ad.com.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ad.com.baseClass.Reusable_Methods;

public class Search_Hotel extends Reusable_Methods {
	
	public Search_Hotel(WebDriver xdriver) {
		this.driver=xdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotels;
	
	@FindBy(id="room_type")
	private WebElement room_type;
	
	@FindBy(id="room_nos")
	private WebElement no_ofRooms;
	
	@FindBy(id="datepick_in")
	private WebElement date_In;
	
	@FindBy(id="datepick_out")
	private WebElement date_Out;
	
	@FindBy(name="adult_room")
	private WebElement adult;
	
	@FindBy(name="child_room")
	private WebElement child;
	
	@FindBy(id="Submit")
	private WebElement submit_Button;
	
	@FindBy(id="checkin_span")
	private WebElement err_msg;

	public WebElement getErr_msg() {
		return err_msg;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoom_type() {
		return room_type;
	}

	public WebElement getNo_ofRooms() {
		return no_ofRooms;
	}

	public WebElement getDate_In() {
		return date_In;
	}

	public WebElement getDate_Out() {
		return date_Out;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSubmit_Button() {
		return submit_Button;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
