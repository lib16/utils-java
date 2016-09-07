package com.lib16.java.utils;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NumberFormatterTest
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
			{new Float(2.34567f), "2.3457"},
			{-0.00000001, "0"}
		};
	}

	@Test(dataProvider = "provider")
	public void test(Number actual, String expected)
	{
		NumberFormatter numberFormatWrapper = new NumberFormatter(4);
		Assert.assertEquals(numberFormatWrapper.format(actual), expected);
	}
}
