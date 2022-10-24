package com.testing.qa.ProstasiaWeb.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

	By loginBtn = By.linkText("Login");
	By username = By.xpath("//input[@id='txtUserName']");
	By password = By.xpath("//input[@id='txtPassword']");
	By loginBtn2 = By.xpath("//button[normalize-space()='Login']");
	By btnCaptcha = By.xpath("//input[@id='txtCaptcha']");
	By headerTitle = By.xpath("//h2[normalize-space()='Login Petty Cash Online']");

	public LoginPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
	}

	public void LoginKalbe(String user, String pass, String cptha) {
		clickAndWait(loginBtn);
		setText(username, user);
		setText(btnCaptcha, cptha);
		setText(password, pass);
//		clickAndWait(loginBtn2);
//		clickAndWait(modalInformasi);
	}

	public String getHeaderTitle() {
		return getText(headerTitle);
	}
}
