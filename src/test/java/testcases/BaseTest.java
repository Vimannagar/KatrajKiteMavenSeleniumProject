package testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.DashBoardPage;
import pages.LoginPage;

public class BaseTest {


	
	
	
	public static WebDriver driver;
	public LoginPage lp;
	
	public Properties prop;
	public FileInputStream fis;
public	String path;
	public DashBoardPage db;

	@BeforeSuite
	public void initBrowser() throws IOException {
//		System.setProperty("webdriver.chrome.driver",
//			"E:\\Desktop\\Katraj\\May 21\\selenium download\\chromedriver.exe");

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		
		options.addArguments("--start-maximized");
		
		options.addArguments("--incognito");
		
	
		
		
//		options.addArguments("--headless");
		
		driver = new ChromeDriver(options);
		 path = System.getProperty("user.dir") + "//config.properties";
		 fis = new FileInputStream(path);
		 prop = new Properties();

		prop.load(fis);

//		driver.manage().window().maximize();

		driver.get(prop.getProperty("testsiteurl"));

	}

	@BeforeClass
	public void createObject() throws IOException {
		lp = new LoginPage(driver);
		db = new DashBoardPage(driver);
	}

//	@AfterSuite
//	public void tearDown() throws InterruptedException {
//	
//
//		driver.quit();
//	}

}
