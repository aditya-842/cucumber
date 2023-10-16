package com.sarvatra.test.ehub.Hooks;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.qa.util.CommonFunctions;
import com.qa.util.ConfigReader;
import com.qa.util.Constants;
import com.qa.util.DriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApplicationHooks {

	private DriverFactory driverFactory;
	private WebDriver driver;
	private ConfigReader configReader;
	public CommonFunctions cf = new CommonFunctions(DriverFactory.driver);
	Properties prop;
	Logger log = (Logger) LogManager.getLogger("ApplicationHooks.java");

	@Before(order = 0)
	public void getProperty() {
		configReader = new ConfigReader();
		prop = configReader.init_prop();
	}

	@Before(order = 1)
	public void launchBrowser() {
		log.info("Open the Browser");
		String browserName = prop.getProperty("browser");
		driverFactory = new DriverFactory();
		driver = driverFactory.init_driver(browserName);
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(Constants.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);

	}

	@After(order = 1)
	public void TakesScreeanShots(Scenario result) throws Exception {
		
		if(result.isFailed()){
			TakesScreenshot ts=(TakesScreenshot)driver;
			byte[] src = ts.getScreenshotAs(OutputType.BYTES);
			result.attach(src, "image/png", "screenshot");
		}
//		cf.takesScreenShotOfFailedTC(result);
	}

	@After(order = 0)
	public void quitBrowser() throws InterruptedException {
		Thread.sleep(2000);
		log.info("Close the Browser");
		driver.quit();
	}

}
