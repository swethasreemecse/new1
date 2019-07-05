package com.app.page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class DressObject extends basePage {
	@FindBy(xpath="(//a[text()='Dresses'])[2]")
	public WebElement Dresses;
	@FindBy(xpath="(//ul[@class='col-lg-12 layered_filter_ul'])[2]")
	public WebElement Dresssize;
	@FindBy(xpath="//*[@class='heading-counter']")
	public WebElement countproduct;

	@FindBys(@FindBy(xpath="//*[@class='product_list grid row']"))
	public List<WebElement> totalproduct;


	
	
	public DressObject() {
		PageFactory.initElements(driver,this);
	}
		public WebElement getdresstabpage()
		{
			 Dresses.click();
			return Dresssize;

		}
		public List<String> gettotalproduct()
		{
			ArrayList<String>List=new ArrayList<String>();
			for(WebElement element:totalproduct) {
				List.add(element.getText());
			}
		return List;
	
}}
