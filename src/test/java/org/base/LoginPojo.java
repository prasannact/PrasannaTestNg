package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass{

	public LoginPojo() {
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement ser;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement ok;

	public WebElement getSer() {
		return ser;
	}

	public WebElement getOk() {
		return ok;
	}
	
	
}
