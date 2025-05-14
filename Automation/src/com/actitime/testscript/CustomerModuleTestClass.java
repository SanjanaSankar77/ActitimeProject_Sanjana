package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModuleTestClass extends BaseClass {

	@Test(groups = "Smoke")
	public void createCustomer()
	{
		Reporter.log("createCustomer", true);
		Assert.fail();
	}
	
	@Test(groups = "Regression")
	public void modifyCustomer()
	{
		Reporter.log("modifyCustomer", true);
	}
	
	@Test(groups = "Regression")
	public void deleteCustomer()
	{
		Reporter.log("deleteCustomer", true);
	}
}
