package com.java.enumerate;

public enum Season {
	SPRING, SUMMER, AUTUMN, WINTER;

	public String getNameIndex() {
		return this.ordinal() + "-" + this.name();
	}
}
