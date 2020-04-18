package com.laCombe.tdd;

/**
 * Hello world!
 *
 */
public class CoffeMachine {
	
	public DrinksType drinksType;
	public final int MAX = 2;
	public String stick = "";
	
	public CoffeMachine() {
		
	}
	
	
	public String drinkMakerProtocol(DrinksType dt, int nbSugar, boolean messageToCustomer) {
		
		touillette(nbSugar);
		if(!messageToCustomer)
			return dt.value + ":" + nbSugar + ":" + stick ;
		else 
			return "M:message-content";
	}
	
	
	
	private void touillette(int nbSugar) {
		
		if(nbSugar > 0) 
			stick = "0";
	 
		if (nbSugar > MAX) 
			nbSugar = MAX;
	}
}
