package pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;



public class DashBoardPage {
	
	WebDriver driver;
	Actions act;
	WebDriverWait wait;

	@FindBy(xpath = "//*[@class='button-blue']")
	private WebElement startbutton;
	
	@FindBy(xpath = "(//*[@id='search-input'])[2]")
	private WebElement searchinstrument;
	
			
	@FindBy(xpath = "(//*[@class='button-outline button-blue'])[2]")
	private WebElement buybutton;		

	
	
	
	

	public  DashBoardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		act = new Actions(driver);
		wait = new WebDriverWait(driver, 60);
	}
	
	public void searchInstruments()
	{
		startbutton.click();
		searchinstrument.sendKeys("sbin");
		
		act.sendKeys(searchinstrument, Keys.ENTER).build().perform();
		buybutton.click();
		
		
	}

	
	

}
