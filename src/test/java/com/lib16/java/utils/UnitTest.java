package com.lib16.java.utils;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.lib16.java.utils.Unit;

public class UnitTest
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
		};
	}

	@Test(dataProvider = "provider")
	public void test(Unit unit, String expected)
	{
		Assert.assertEquals(unit.toString(), expected);
	}
}
