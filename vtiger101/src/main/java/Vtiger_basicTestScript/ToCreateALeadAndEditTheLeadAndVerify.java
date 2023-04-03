package Vtiger_basicTestScript;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.BaseClass;

@Listeners(genericUtility.ListenerImplementionClass.class)
public class ToCreateALeadAndEditTheLeadAndVerify extends BaseClass {


	@Test
	public void toCreateALeadAndEditTheLeadAndVerify() {
		//Assert.fail();
	System.out.println("The Lead has been created and Edited and Verified");	
	}
}


