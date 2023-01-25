package ad.com.stepdefination;

import org.junit.Assert;

import ad.com.baseClass.Reusable_Methods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjectManager.POM;

public class Steps extends Reusable_Methods {
	POM obj = new POM(driver);

	@Given("User launch {string} browser")
	public void user_launch_browser(String string) throws Exception {
		browserLaunch(string);
		maximize();
	}

	@Given("User navigate to url {string}")
	public void user_navigate_to_url(String string) {
		getUrl(string);
	}

	@Given("User enter the username {string}")
	public void user_enter_the_username(String string) {
		sendText(obj.getLoginPage().getUsername(), string);
	}

	@Given("User enter the password {string}")
	public void user_enter_the_password(String string) {
		sendText(obj.getLoginPage().getPassword(), string);
	}

	@Then("User click the login button")
	public void user_click_the_login_button() {
		click(obj.getLoginPage().getLoginButton());
	}

	@Given("User select the Location as in test data.")
	public void user_select_the_location_as_in_test_data() {
		dropDown(obj.getSearch_Hotel().getLocation(), "value", "Melbourne");

	}

	@Given("User select the Hotel as in test data.")
	public void user_select_the_hotel_as_in_test_data() {
		dropDown(obj.getSearch_Hotel().getHotels(), "value", "Hotel Sunshine");
	}

	@Given("User select the Room Type as in test data.")
	public void user_select_the_room_type_as_in_test_data() {
		dropDown(obj.getSearch_Hotel().getRoom_type(), "value", "Deluxe");
	}

	@Given("User select the No-of rooms as in test data.")
	public void user_select_the_no_of_rooms_as_in_test_data() {
		dropDown(obj.getSearch_Hotel().getNo_ofRooms(), "value", "1");
	}

	@Given("User Enter check-indate {string}  later than the check-outdate {string} field as in test data")
	public void user_enter_check_indate_later_than_the_check_outdate_field_as_in_test_data(String string,
			String string2) {
		sendText(obj.getSearch_Hotel().getDate_In(), string);
		sendText(obj.getSearch_Hotel().getDate_Out(), string2);

	}

	@Given("User click the search Button")
	
	public void user_click_the_search_button() throws InterruptedException {
		click(obj.getSearch_Hotel().getSubmit_Button());
		
		Thread.sleep(3000);
	}

	@Then("User Verify that system gives an error saying {string}")
	public void user_verify_that_system_gives_an_error_saying(String string) {
		Assert.assertTrue(string, obj.getSearch_Hotel().getErr_msg().isDisplayed());

	}

	@Given("user enter the check-In date {string}")
	public void user_enter_the_check_in_date(String string) {
		sendText(obj.getSearch_Hotel().getDate_In(), string); 
	}

	@Given("user enter the check-Out date {string}")
	public void user_enter_the_check_out_date(String string) {
		sendText(obj.getSearch_Hotel().getDate_Out(), string);
	}

	@Then("user verify locations selected in select Hotel as same as Search Hotel")
	public void user_verify_locations_selected_in_select_hotel_as_same_as_search_hotel() {
	Assert.assertEquals("Melbourne", obj.getSelect_Hotel().getLocationName());
	}

}
