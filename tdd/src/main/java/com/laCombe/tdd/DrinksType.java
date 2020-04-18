package com.laCombe.tdd;

public enum DrinksType {
	
	TEA("T"), COFFEE("C"), CHOCOLATE("H");
	
	public final String value;
	
	private DrinksType(String value) {
		this.value = value;
	}

}
