package com.lib16.java.utils.enums;

public enum ImageType
{
	GIF("image/gif"), PNG("image/png"), JPG("image/jpg"), SVG("image/svg+xml");

	private String str;

	private ImageType(String type)
	{
		str = type;
	}

	@Override
	public String toString()
	{
		return str;
	}
}