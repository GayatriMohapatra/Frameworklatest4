package com.gcr.reuse;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.gcr.config.StartBrowser;
import com.gcr.or.HomepageEL;
//import com.gcr.or.ProductpageEL;
//import com.gcr.or.Register;
import com.gcr.wdcmds.ActionDriver;

public class ElectronicsFunctions {

	
	public ActionDriver aDriver;
	public WebDriver driver;

	public ElectronicsFunctions()
	{
		aDriver = new ActionDriver();
		driver = StartBrowser.driver;
	}

	public void SelectCategory() throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Select product from Electronics");
		aDriver.navigateToApplication("http://demowebshop.tricentis.com/");
		aDriver.mouseHover(HomepageEL.lnkElectronics, "Electronics link");
		aDriver.click(HomepageEL.lnkElectronics, "Electronics link");
		aDriver.mouseHover(HomepageEL.lnkCellphone, "Camera link");
		aDriver.click(HomepageEL.lnkCellphone, "Camera link");
		
		
		
	}
	
	
/*	public void Emailafriend() throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Add a Product To wishlisht");
		//aDriver.navigateToApplication("http://demowebshop.tricentis.com/");
		aDriver.click(ProductpageEL.imgproduct, "Product image");
		aDriver.click(ProductpageEL.txtproduct, "Product text");
		aDriver.click(ProductpageEL.btnEmail,  "Email a friend");
		aDriver.type(ProductpageEL.txtFrndsemail, "hgjki@gmail.com", "Friends email");
		aDriver.type(ProductpageEL.txtyourmail, "ghjif@gamil.com", "Your email");
		aDriver.type(ProductpageEL.txtprsnlmsg, "Hii just comapre it", "Personal message");
		aDriver.click(ProductpageEL.btnsendmail, "Send email");
	}
	 */
	/*public void Seetheresult() throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode("View the result");
		aDriver.
	
	}*/

}    
	    
	    
	

		
		
	

	
		



