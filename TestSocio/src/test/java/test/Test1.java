package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import lib.BaseTest;

public class Test1 extends BaseTest{
	
	@Test
	public void testGoogle() {
		driver.get(TEST_URL_Google);
		String eTitle = "Google";
		String aTitle = driver.getTitle();
		Assert.assertEquals(aTitle, eTitle);
	}

}
