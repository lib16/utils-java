package com.lib16.java.utils;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatWrapper
{
	private NumberFormat numberFormat;

	public NumberFormatWrapper(int maximumFractionDigits) {
		numberFormat = NumberFormat.getNumberInstance(Locale.ENGLISH);
		numberFormat.setMaximumFractionDigits(maximumFractionDigits);
		numberFormat.setRoundingMode(RoundingMode.HALF_UP);
	}

	public String format(Number number)
	{
		if (number != null) return numberFormat.format(number);
		return null;
	}

	public NumberFormat getNumberFormat()
	{
		return numberFormat;
	}
}
