package extentlisteners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGen {
	static ExtentReports extent;
	
	
	public static ExtentReports extentReportGenerator()
	{
		String path = System.getProperty("user.dir")+"//Reports//KiteZerodhaSanityReport.html";
		
		ExtentHtmlReporter reporter = new ExtentHtmlReporter(path);
		
		reporter.config().setReportName("SanityCheckZerodha");
		
		reporter.config().setTheme(Theme.DARK);
		
		 extent = new ExtentReports();
		
		extent.attachReporter(reporter);
		
		extent.setSystemInfo("Environment", "Stage");
		
		extent.setSystemInfo("OS", "Windows");
		
		extent.setSystemInfo("Run By", "Automation Team");
		
		return extent;
		
		
		
		
	}

}
