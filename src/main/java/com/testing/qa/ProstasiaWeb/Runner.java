package com.testing.qa.ProstasiaWeb;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.testing.qa.ProstasiaWeb.Pages.LoginPage;
import com.testing.qa.ProstasiaWeb.Pages.MainPage;

public class Runner extends BaseWeb {

	String username = "michael.leonard";
	String password = "abcdef";
	String captcha = "YJXP9";

	LoginPage loginPage = new LoginPage(driver, explicitWait);
	MainPage mainPage = new MainPage(driver, explicitWait);

	@Test
	public void openPage() {
		driver.get().get("https://pettycash.kalbenutritionals.web.id/");
		mainPage.BerandaPage();
		String actualText = mainPage.BerandaPage();
		String expectedText = "PETTY CASH ONLINE";
		Assert.assertTrue(actualText.contains(expectedText));
	}

	@Test
	public void testLogin() {
		driver.get().get("https://pettycash.kalbenutritionals.web.id/");
		loginPage.LoginKalbe(username, password, captcha);
		loginPage.getHeaderTitle();
		String actualText = loginPage.getHeaderTitle();
		System.out.println("anda sedang beranda dihalaman: " + actualText);
	}
}
