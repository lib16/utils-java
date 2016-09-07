package com.lib16.java.utils;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatter
{
	public static final NumberFormatter DEFAULT_FORMATTER = new NumberFormatter(4);
	public static final NumberFormatter DEFAULT_DEGREE_FORMATTER = new NumberFormatter(2);

	private NumberFormat numberFormat;

	public NumberFormatter(int maximumFractionDigits) {
		numberFormat = NumberFormat.getNumberInstance(Locale.ENGLISH);
		numberFormat.setMaximumFractionDigits(maximumFractionDigits);
		numberFormat.setRoundingMode(RoundingMode.HALF_UP);
	}

	public String format(Number number)
	{
		if (number != null) {
			String string = numberFormat.format(number);
			if (string.equals("-0")) {
				string = "0";
			}
			return string;
		}
		return null;
	}
}
