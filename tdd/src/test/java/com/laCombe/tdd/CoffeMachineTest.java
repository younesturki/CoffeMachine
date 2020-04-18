package com.laCombe.tdd;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;

import org.junit.Test;

/**
 * Unit test for simple CoffeMachineTest.
 */
public class CoffeMachineTest {
    
	private CoffeMachine cfM;

	@Before
	public void init() {
		cfM = new CoffeMachine();
	}

	/////////////////////TEST////////////////////
    @Test
    public void when_drinkmaker_makes_1tea_1sugar_and_aStick_noHot(){
    	assertThat(cfM.drinkMakerProtocol(DrinksType.TEA, 1, 0.4,false)).isEqualTo("T:1:0");
  
    }
    
    @Test
    public void when_drinkmaker_makes_1Chocolate_nosugar_and_noStick_noHot(){
    	assertThat(cfM.drinkMakerProtocol(DrinksType.CHOCOLATE, 0, 0.5,false)).isEqualTo("H::");
  
    }
    
    @Test
    public void when_drinkmaker_makes_1Coffe_2sugar_and_Stick_noHot(){
    	assertThat(cfM.drinkMakerProtocol(DrinksType.COFFEE, 2, 0.7,false)).isEqualTo("C:2:0");
  
    }
    
    @Test
    public void when_drinkmaker_makes_message_to_the_customer_needMoreMoney(){
    	assertThat(cfM.drinkMakerProtocol(DrinksType.COFFEE, 2, 0.5, false)).isEqualTo("M:You need to add: 0.1 euro");
  
    }
    
    @Test
    public void when_drinkmaker_makes_orange_Juice(){
    	assertThat(cfM.drinkMakerProtocol(DrinksType.ORANGE, 0, 0.6, false)).isEqualTo("O::");
  
    }
    
    @Test
    public void when_drinkmaker_makes_coffe_noSugar_extraHot(){
    	assertThat(cfM.drinkMakerProtocol(DrinksType.COFFEE, 0, 0.6, true)).isEqualTo("Ch::");
  
    }
    
    @Test
    public void when_drinkmaker_makes_chocolate_1Sugar_extraHot(){
    	assertThat(cfM.drinkMakerProtocol(DrinksType.CHOCOLATE, 1, 0.5, true)).isEqualTo("Hh:1:0");
  
    }
    
    @Test
    public void when_drinkmaker_makes_tea_2Sugar_extraHot(){
    	assertThat(cfM.drinkMakerProtocol(DrinksType.TEA, 2, 0.4, true)).isEqualTo("Th:2:0");
  
    }
}
