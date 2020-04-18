package com.laCombe.tdd;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 * Hello world!
 *
 */
public class CoffeMachine {
	
	public DrinksType drinksType;
	public final int MAX = 2;
	public String stick = "";
	public BigDecimal rest;
	
	public CoffeMachine() {
		
	}
	
	
	public String drinkMakerProtocol(DrinksType dt, int nbSugar, double money) {
		
		if(money >= dt.amount) {
			String sugar = containSugar(nbSugar);
			return dt.value + ":" + sugar + ":" + stick ;
		}
			
		else {
			rest = calculationRest(dt, money);
			return "M:You need to add: " + rest + " euro";
		}
			
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
	
	private BigDecimal calculationRest(DrinksType dt, double money) {
		
		MathContext mc = new MathContext(1);
		BigDecimal rest = new BigDecimal(dt.amount);
		rest = rest.subtract(new BigDecimal(money),mc);
		
		return rest;
	}
}
