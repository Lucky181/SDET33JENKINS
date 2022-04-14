package com.crm.test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase_01_Test {
	
	
	
	@Test
	public void test1() {
		String browser=System.getProperty("BROWSER");
		String url=System.getProperty("URL");
		Reporter.log(browser,true);
		Reporter.log(url,true);
		Reporter.log("hi",true);
	}

}
