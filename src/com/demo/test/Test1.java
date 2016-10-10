package com.demo.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.SeleneseTestBase;

public class Test1 extends SeleneseTestBase {
	DefaultSelenium selenium = null;

	@Override
	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*firefox",
				"http://www.baidu.com/");
		selenium.start();
	}

	@Test
	public void testBaiduSearch() throws Exception {
		selenium.open("/");
		selenium.type("id=kw", "selenium java");
		selenium.click("id=su");
		selenium.waitForPageToLoad("30000");
	}

	@Override
	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}