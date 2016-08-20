package com.lib16.java.utils;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.lib16.java.utils.NumberFormatWrapper;

public class NumberFormatWrapperTest
{
	@DataProvider(name = "provider")
	public static Object[][] reverseProvider()
	{
		return new Object[][] {
			{2, "2"},
			{2.34567, "2.3457"},
			{2.34567f, "2.3457"},
			{null, null},
			{new Integer(2), "2"},
			{new Double(2.34567), "2.3457"},
			{new Float(2.34567f), "2.3457"}
		};
	}

	@Test(dataProvider = "provider")
	public void test(Number actual, String expected)
	{
		NumberFormatWrapper numberFormatWrapper = new NumberFormatWrapper(4);
		Assert.assertEquals(numberFormatWrapper.format(actual), expected);
	}
}
