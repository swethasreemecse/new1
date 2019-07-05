package com.app.page;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeObject extends basePage{
	
	@FindBy(xpath="//a[text()='Women']")
	public WebElement Women;

	@FindBy(xpath="(//a[text()='Dresses'])[2]")
	public WebElement Dresses;


	@FindBy(xpath="(//a[text()='T-shirts'])[2]")
	public WebElement tshirts;
	
	
	@FindBy(xpath="//*[@class='title_block']")
	public WebElement navwomen;
	
	@FindBy(xpath="(//*[@class='title_block'])[1]")
	public WebElement navdresses;

	@FindBy(xpath="(//*[@class='title_block'])[1]")
	public WebElement navtshirts;
	@FindBy(xpath="//*[@id='newsletter-input']")
	public WebElement newsletter;
	
	@FindBy(xpath="(//*[@class='btn btn-default button button-small'])[2]")
	public WebElement newsbutton;
	
	@FindBy(xpath="(//*[@class='clearfix'])[2]")
	//@FindBy(xpath="//*[@class='alert alert-success']")
	public WebElement newsalert;





	
	public HomeObject() {
	PageFactory.initElements(driver,this);
}
	public WebElement getwomentabpage()
	{
		return Women;
	}
	public WebElement getDressestabpage()
	{
		return Dresses;
	}
	public WebElement gettshirttabpage()
	{
		return tshirts;
	}
	public WebElement getnavwomen()
	{
		Women.click();
		return navwomen;
	}
	public WebElement getnavdresses()
	{
		Dresses.click();
		return navdresses;
}
	public WebElement getnavtshirts()
	{
		tshirts.click();
		return navtshirts;
}
	public WebElement addnewsletter()
	{
		int random=new Random().nextInt(50000000);
		String  email="selinium"+random+"@gmail.com";
	     newsletter. sendKeys(email);
         newsbutton.click();
		return newsletter;
	}
	public WebElement clickcuttion()
	{
		newsbutton.click();
return newsbutton;
	}
	
	public WebElement getnewsalert()
	{
		newsalert.getText();
      return newsalert; 
	}
	}

