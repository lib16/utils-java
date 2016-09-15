package com.lib16.java.utils.enums;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EnumsTest
{
	@DataProvider(name = "provider")
	public static Object[][] provider()
	{
		return new Object[][] {
			{Unit.CM, "cm"},
			{Unit.EM, "em"},
			{Unit.EX, "ex"},
			{Unit.IN, "in"},
			{Unit.MM, "mm"},
			{Unit.NONE, ""},
			{Unit.PERCENT, "%"},
			{Unit.PX, "px"},
			{Unit.REM, "rem"},
			{Unit.VH, "vh"},
			{Unit.VW, "vw"},
			{ImageType.GIF, "image/gif"},
			{ImageType.PNG, "image/png"},
			{ImageType.JPG, "image/jpg"},
			{ImageType.SVG, "image/svg+xml"},
			{IconType.ICO, "image/vnd.microsoft.icon"},
			{IconType.GIF, "image/gif"},
			{IconType.PNG, "image/png"},
			{IconType.SVG, "image/svg+xml"},
		};
	}

	@Test(dataProvider = "provider")
	public void test(Enum<?> actual, String expected)
	{
		Assert.assertEquals(actual.toString(), expected);
	}
}
