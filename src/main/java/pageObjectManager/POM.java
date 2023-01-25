package pageObjectManager;

import org.openqa.selenium.WebDriver;

import ad.com.baseClass.Reusable_Methods;
import ad.com.locators.Book_Hotel;
import ad.com.locators.LogOut;
import ad.com.locators.LoginPage;
import ad.com.locators.Search_Hotel;
import ad.com.locators.Select_Hotel;

public class POM extends Reusable_Methods {

	public POM(WebDriver xdriver) {
		this.driver = xdriver;

	}

	private LoginPage loginPage;
	private Search_Hotel search_Hotel;
	private Select_Hotel select_Hotel;
	private Book_Hotel book_Hotel;
	private LogOut logout;

	public LoginPage getLoginPage() {
		if (loginPage == null) {
			loginPage = new LoginPage(driver);
		}
		return loginPage;
	}

	public Search_Hotel getSearch_Hotel() {
		if (search_Hotel == null) {
			search_Hotel = new Search_Hotel(driver);
		}
		return search_Hotel;
	}

	public Select_Hotel getSelect_Hotel() {
		if (select_Hotel == null) {
			select_Hotel = new Select_Hotel(driver);
		}
		return select_Hotel;
	}

	public Book_Hotel getBook_Hotel() {
		if (book_Hotel == null) {
			book_Hotel = new Book_Hotel(driver);
		}
		return book_Hotel;
	}

	public LogOut getLogout() {
		if (logout == null) {
			logout = new LogOut(driver);
		}
		return logout;
	}

}
