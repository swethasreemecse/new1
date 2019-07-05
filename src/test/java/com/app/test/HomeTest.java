package com.app.test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.app.page.HomeObject;
import com.app.page.basePage;



public class HomeTest {
	HomeObject hp;
	basePage bp;

	public HomeTest()
	{
	  hp=new HomeObject();
		bp=new basePage();
		
	}
	@Test
	public void verifywomenTabText()
	{
		Assert.assertTrue(hp.elementFound(hp.getwomentabpage()));
		
	}
	@Test
	public void verifydressesTabText()
	{
		Assert.assertTrue(hp.elementFound(hp.getDressestabpage()));

}
@Test
public void verifytshirtTabText()
{
		Assert.assertTrue(hp.elementFound(hp.gettshirttabpage()));
	

	}
@Test
public void checkwomentab()
{
	Assert.assertEquals(hp.navwomen,hp.getnavwomen());

	
}
@Test
public void checkdressesab()
{
	Assert.assertEquals(hp.navdresses,hp.getnavdresses());
}
@Test
public void checktshirtstab()
{
	Assert.assertEquals(hp.navtshirts,hp.getnavtshirts());
}
@AfterTest
public void checknewsletter()
{
	Assert.assertTrue(hp.elementFound(hp.addnewsletter()));

}
@AfterTest
public void checkclickbutton()
{
	Assert.assertTrue(hp.elementFound(hp.clickcuttion()));

}

@AfterTest
public void checkalert()
{
	Assert.assertTrue(hp.elementFound(hp.getnewsalert()));

}}
