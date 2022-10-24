package com.testing.qa.ProstasiaWeb.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	ThreadLocal<WebDriverWait> explicitWait = new ThreadLocal<WebDriverWait>();

	public BasePage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		this.driver = driver;
		this.explicitWait = explicitWait;
	}

	public void clickAndWait(By locator) {
		driver.get().findElement(locator).click();
	}

	public void getModal(By locator) {
		driver.get().findElement(locator);
	}

	public String getText(By locator) {
		return driver.get().findElement(locator).getText();
	}

	public void setText(By locator, String text) {
		driver.get().findElement(locator).click();
		driver.get().findElement(locator).sendKeys(text);
	}

	public void setNumber(By locator, int number) {
		driver.get().findElement(locator).clear();
		driver.get().findElement(locator).sendKeys(String.valueOf(number));
	}

	public void clearValues(By locator) {
		driver.get().findElement(locator).clear();
	}
}
