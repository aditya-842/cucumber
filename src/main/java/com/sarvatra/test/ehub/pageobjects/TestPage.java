package com.sarvatra.test.ehub.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.util.CommonFunctions;

public class TestPage {

	private WebDriver driver;
	private WebDriverWait wait;
	CommonFunctions cf;
	LoginPage lp;

	public TestPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 1), this);
		cf = new CommonFunctions(driver);
		lp = new LoginPage(driver);
	}

	private By prodcutTableFieldnames = By
			.xpath("\r\n" + "//table[@class='table-product-role-details']/tbody/tr/td//label");
	private By BasicDetailsTablefiledNames = By
			.xpath("//div[@ng-show=\"data.mode === 'view'\"]//table//tbody//tr//label");

	private By prodcutTableFieldvalues = By
			.xpath("//table[@class='table-product-role-details']/tbody/tr/td//label//following::td[2]");

	private By BasicDetailsTablefilevalues = By
			.xpath("//div[@ng-show=\"data.mode === 'view'\"]//table//tbody//tr//label//following::td[2]");

	public List<String> getBasictablefiledNames() {
		List<String> filedNames = cf.getElementsTextList(BasicDetailsTablefiledNames);
		return filedNames;
	}

	public List<String> getBasictablefiledValues() {
		List<String> filedvalues = cf.getElementsTextList(BasicDetailsTablefilevalues);
		return filedvalues;
	}

	public List<String> getProducttablefiledNames() {
		List<String> filedNames = cf.getElementsTextList(prodcutTableFieldnames);
		// System.out.println("FNames:" +filedNames);
		return filedNames;
	}

	public List<String> getProducttablefiledValues() {
		List<String> filedValues = cf.getElementsTextList(prodcutTableFieldvalues);
		// System.out.println("Fvalues" +filedValues);
		return filedValues;
	}

}
