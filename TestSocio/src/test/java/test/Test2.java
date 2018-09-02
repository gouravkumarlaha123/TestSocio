package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import lib.BaseTest;

public class Test2 extends BaseTest {
	@Test
	public void testFacebook() {
		driver.get(TEST_URL_FACEBOOK);
		String eTitle = "Facebook – log in or sign up";
		String aTitle = driver.getTitle();
		Assert.assertEquals(aTitle, eTitle);
	}

}
