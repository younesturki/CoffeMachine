package com.laCombe.tdd;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 * Coffe Machine
 *
 */
public class CoffeMachine {
	
	private final int MAX = 2;
	private String stick = "";
	private BigDecimal rest;
	
	public CoffeMachine() {
		
	}
	
	
	public String drinkMakerProtocol(DrinksType dt, int nbSugar, double money, boolean extraHot) {
		
		String message = "";
		
		if(money >= dt.getAmount() && extraHot) 
			message = messagetoCustomer(dt,nbSugar,extraHot);
		else if (money >= dt.getAmount() && !extraHot)
			message = messagetoCustomer(dt,nbSugar,extraHot);
		else {
			rest = calculationRest(dt, money);
			message = "M:You need to add: " + rest + " euro";
		}
		return message;
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
	
	private BigDecimal calculationRest(DrinksType dt, double money) {
		
		MathContext mc = new MathContext(1);
		BigDecimal rest = new BigDecimal(dt.getAmount());
		rest = rest.subtract(new BigDecimal(money),mc);
		
		return rest;
	}
	
	private String messagetoCustomer(DrinksType dt, int nbSugar,boolean extraHot) {
		String sugar = containSugar(nbSugar);
		
		if(extraHot) 
			 return dt.getValue() + "h:" + sugar + ":" + stick;
		 else 
			 return dt.getValue() + ":" + sugar + ":" + stick;
	}
	
	private String transformIntInString(int transform) {
		return String.valueOf(transform);
	}
}
