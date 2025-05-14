package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class EventModule extends BaseClass {

	@Test(groups = "Smoke")
	public void createEvent()
	{
		Reporter.log("createEvent", true);
	}
	
	@Test(groups = "Regression")
	public void modifyEvent()
	{
		Reporter.log("modifyEvent", true);
	}
	
	@Test(groups = "Regression")
	public void deleteEvent()
	{
		Reporter.log("deleteCustomer", true);
	}
}
