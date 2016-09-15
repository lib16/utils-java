package com.lib16.java.utils.enums;

public enum IconType
{
	ICO("image/vnd.microsoft.icon"), GIF(ImageType.GIF), PNG(ImageType.PNG), SVG(ImageType.SVG);

	private String str;

	private IconType(String type)
	{
		str = type;
	}

	private IconType(ImageType type)
	{
		str = type.toString();
	}

	@Override
	public String toString()
	{
		return str;
	}
}
