package ad.com.baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Reusable_Methods {
	public static WebDriver driver;

	public static void browserLaunch(String value) throws Exception {
		try {
			if (value.equalsIgnoreCase("edge")) {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();

			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("unable to launch browser");
		}
	}

	public static void maximize() {
		try {
			driver.manage().window().maximize();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void getUrl(String value) {
		driver.get(value);
	}

	public static void click(WebElement element) {
		element.click();
	}

	public static void dropDown(WebElement element, String value, String value1) {
		Select s = new Select(element);
		if (value.equalsIgnoreCase("value")) {
			s.selectByValue(value1);
		} else if (value.equalsIgnoreCase("index")) {
			s.selectByIndex(Integer.parseInt(value1));
		} else if (value.equalsIgnoreCase("text")) {
			s.selectByValue(value1);
		}

	}

	public static void sendText(WebElement element, String value) {
		element.sendKeys(value);
	}
}