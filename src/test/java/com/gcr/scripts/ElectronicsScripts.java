package com.gcr.scripts;



//import org.testng.Assert;
import org.testng.annotations.Test;
import com.gcr.config.StartBrowser;
import com.gcr.reuse.ElectronicsFunctions;
//import com.gcr.reuse.Registerfunctions;



public class ElectronicsScripts extends StartBrowser{
	@Test
	public void ElectronicsScriptsTestCase() throws Exception {
		ElectronicsFunctions efs= new ElectronicsFunctions();
		  
		 efs.SelectCategory();
		  //efs.Emailafriend();
		  //String pName=ffs.Shoppingcart();
		  //Assert.assertEquals(pName);
		   Thread.sleep(9000);
		
		
		
	
		
		
	}
}
