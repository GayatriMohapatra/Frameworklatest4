package com.gcr.reuse;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.gcr.config.StartBrowser;
import com.gcr.or.Register;
import com.gcr.wdcmds.ActionDriver;

public class Registerfunctions {

	
	public ActionDriver aDriver;
	public WebDriver driver;

	public Registerfunctions()
	{
		aDriver = new ActionDriver();
		driver = StartBrowser.driver;
	}

	public void RegisterinHomepage() throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Select product from featured product");
		aDriver.navigateToApplication("http://demowebshop.tricentis.com/");
		aDriver.mouseHover(Register.LnkRegister , "Hover to Register");
		aDriver.click(Register.LnkRegister , "Register Link");
		
		
	}
	
	
	public void FilltheDetails() throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Add a Product To wishlisht");
		//aDriver.navigateToApplication("http://demowebshop.tricentis.com/");
		//aDriver.click(Register.radiobtnGender,"Gender");
		
		aDriver.type(Register.txtFirstname,"Gayatri", "First Name");
		aDriver.type(Register.txtLastname,"Mohapatra", "Last Name");
		aDriver.type(Register.txtEmailid, "Gayatri@gmail.com","Text Email");
		aDriver.type(Register.txtpwd, "Gay123","Text Password");
		aDriver.type(Register.txtCnfrmpwd,"Gay123", "Confirm Password");
		aDriver.click(Register.btnRegister, "Register button");
       //aDriver.selectByVisibleText(Register.radiobtnGender, "Female");
		
	}

	
	}

	    
	    
	    
	

		
		
	

	
		



