package com.lib16.java.utils.enums;

/**
 * CSS Units
 */
public enum Unit
{
	NONE, PX, EM, EX, PT, IN, CM, MM, PERCENT, REM, VW, VH;

	private String str;

	private Unit()
	{
		str = name() == "NONE" ? "" : name() == "PERCENT" ? "%" : name().toLowerCase();
	}

	@Override
	public String toString()
	{
		return str;
	}
}