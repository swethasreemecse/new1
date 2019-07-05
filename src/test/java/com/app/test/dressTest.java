package com.app.test;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.app.page.DressObject;
import com.app.page.HomeObject;
import com.app.page.basePage;

public class dressTest {
	public class HomeTest {
		DressObject dp;
		basePage bp;

		public HomeTest()
		{
		  dp=new DressObject();
			bp=new basePage();
			
		}
		@Test
		public void verifydresssizeTab()
		{
			Assert.assertTrue(dp.elementFound(dp.getdresstabpage()));
			
		}
		@Test
		List<String>count=hp.gettotalproduct();
		ArrayList<String>expected=new ArrayList<String>();
		Assert.assertequals()




	}}
