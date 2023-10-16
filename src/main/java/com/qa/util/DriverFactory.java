package com.qa.util;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public static WebDriver driver;

	public WebDriver init_driver(String browser) {

		System.out.println("browser value is: " + browser);

		if (browser.equals("chrome")) {

			WebDriverManager.chromedriver().setup();

			ChromeDriverService chromeService = ChromeDriverService.createDefaultService();

			ChromeOptions opt = getChromeOptions();

			driver = new ChromeDriver(chromeService, opt);

		} else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver(getFirefoxOptions());

		} else {
			System.out.println("Please pass the correct browser value: " + browser);
		}

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		return driver;

	}

	private static ChromeOptions getChromeOptions() {
		ChromeOptions options = new ChromeOptions();

		options.setAcceptInsecureCerts(true);

		Proxy proxy = new Proxy();
		proxy.setNoProxy("192.168.1.176"); 
		// proxy.setProxyType(ProxyType.DIRECT);
		options.setCapability("proxy", proxy);

		options.addArguments("--no-proxy-server");

		String headlessMode = System.getenv("TESTENV_HEADLESS_MODE");
		if (headlessMode != null && !"".equals(headlessMode) && "true".equalsIgnoreCase(headlessMode)) {
			System.out.println("Headless mode is turned on");
			options.addArguments("--headless");
			options.addArguments("--disable-gpu");
		}

		return options;
	}

	private static FirefoxOptions getFirefoxOptions() {
		FirefoxOptions options = new FirefoxOptions();
		options.setAcceptInsecureCerts(true);
		options.addPreference("network.proxy.type", 0);

		String headlessMode = System.getenv("TESTENV_HEADLESS_MODE");
		if (headlessMode != null && !"".equals(headlessMode) && "true".equalsIgnoreCase(headlessMode)) {
			System.out.println("Headless mode is turned on");
			options.setHeadless(true);
		}

		return options;

	}

	public static synchronized WebDriver getDriver() {
		return getDriver();
	}

}
