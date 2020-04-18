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
		
		if(!messageToCustomer) {
			
			String sugar = containSugar(nbSugar);
			return dt.value + ":" + sugar + ":" + stick ;
		}
			
		else 
			return "M:message-content";
	}
	
	
	
	private int touillette(int nbSugar) {
		
		if(nbSugar > 0 && nbSugar <= MAX) {
			stick = "0";
		  }
		else if (nbSugar > MAX) 
			nbSugar = MAX;
		return nbSugar;
	}
	
	private String containSugar(int nbrSugar) {
		touillette(nbrSugar);
		if(nbrSugar > 0)
			return transformIntInString(nbrSugar);
		else 
			return "";
	}
	
	private String transformIntInString(int transform) {
		return String.valueOf(transform);
	}
}
