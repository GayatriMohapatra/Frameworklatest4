package com.gcr.scripts;



//import org.testng.Assert;
import org.testng.annotations.Test;
import com.gcr.config.StartBrowser;
//import com.gcr.reuse.Registerfunctions;
import com.gcr.reuse.Testforum_Functions;



public class Testforumscripts extends StartBrowser{
	@Test
	public void TestforumscriptsTestcase() throws Exception{
		Testforum_Functions tfs = new Testforum_Functions();
		tfs.ViewtheHomepage();
		Thread.sleep(9000);
		
		
		
	
		
		
	}
}
