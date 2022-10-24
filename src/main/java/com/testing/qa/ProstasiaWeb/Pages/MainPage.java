package com.testing.qa.ProstasiaWeb.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends BasePage {

	By headerPage = By.xpath("//h1[normalize-space()='PETTY CASH ONLINE']");

	public MainPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
	}

	public String BerandaPage() {
		return getText(headerPage);
	}
}
