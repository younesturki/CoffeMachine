package com.laCombe.tdd;

public enum DrinksType {
	
	TEA("T",0.4), COFFEE("C",0.6), CHOCOLATE("H",0.5), ORANGE("O",0.6);
	
	public final String value;
	public double amount;
	
	private DrinksType(String value, double amount) {
		this.value = value;
		this.amount = amount;
	}

}
