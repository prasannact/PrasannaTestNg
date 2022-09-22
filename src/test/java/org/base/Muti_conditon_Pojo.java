package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Muti_conditon_Pojo extends BaseClass {

	public Muti_conditon_Pojo() {
		PageFactory.initElements(driver,this);
		
	
	}
	@CacheLookup
	@FindBys({
		@FindBy(id="twotabsearchtextbox"),
		@FindBy(xpath="//input[@type='text']")
	})
	private WebElement ser;
	@CacheLookup
	@FindAll({
		@FindBy(id="n submit-button"),
		@FindBy(xpath="//input[@type='submit']")
	})
	private WebElement ok;
	
	
	
	}
