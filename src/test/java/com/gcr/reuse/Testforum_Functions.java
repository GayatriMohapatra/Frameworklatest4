package com.gcr.reuse;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.gcr.config.StartBrowser;
//import com.gcr.or.Register;
import com.gcr.or.Testforumpage;
import com.gcr.wdcmds.ActionDriver;

public class Testforum_Functions {
	public ActionDriver aDriver;
	public WebDriver driver;
	
	public  Testforum_Functions () {
		aDriver = new ActionDriver();
		driver=StartBrowser .driver ;
		
	}
	public void ViewtheHomepage() throws Exception{
		aDriver.navigateToApplication("https://testautomationforum.com/");
		aDriver.click(Testforumpage.lnkHome, "Home link");
	    aDriver.click(Testforumpage.lnkArticles, "Article link");
		aDriver.click(Testforumpage.lnkAbout, "About link");
		aDriver.click(Testforumpage.lnkShowseries, "Showcase Series link");
		
	}
}

	
		

		
		
	

	
		



