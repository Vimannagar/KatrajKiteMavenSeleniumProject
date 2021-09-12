package pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BaseClass {

	WebDriver driver;
	WebDriverWait wait;

	@FindBy(xpath = "//*[@id='userid']")
	private WebElement username;

	@FindBy(xpath = "//*[@id='password']")
	private WebElement password;

	@FindBy(xpath = "//*[@type='submit']")
	private WebElement loginbutton;

	@FindBy(xpath = "//*[@id='pin']")
	private WebElement pin;
	

	@FindBy(xpath = "//*[@type='submit']")
	private WebElement continuebutton;
	
	
	@FindBy(linkText = "Logout")
	private WebElement logoutlink;
	
	
	

	public LoginPage(WebDriver driver) throws IOException {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		wait = new WebDriverWait(driver, 60);

	}

	public void loginToApp() {
		username.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		loginbutton.click();
	}
	
	public void enterPin()
	{
		wait.until(ExpectedConditions.elementToBeClickable(pin));
		
		pin.sendKeys(prop.getProperty("pin"));
		continuebutton.click();
	}

	public void logout() throws InterruptedException {
	

		Thread.sleep(2000);

		logoutlink.click();

	}

}
