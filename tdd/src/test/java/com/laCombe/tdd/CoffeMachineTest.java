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

	/////////////////////FIRST ITERATION////////////////////
    @Test
    public void when_drinkmaker_makes_1tea_1sugar_and_aStick(){
    	assertThat(cfM.drinkMakerProtocol(DrinksType.TEA, 1, false)).isEqualTo("T:1:0");
  
    }
    
    @Test
    public void when_drinkmaker_makes_1Chocolate_nosugar_and_noStick(){
    	assertThat(cfM.drinkMakerProtocol(DrinksType.CHOCOLATE, 0, false)).isEqualTo("H::");
  
    }
    
    @Test
    public void when_drinkmaker_makes_1Coffe_2sugar_and_Stick(){
    	assertThat(cfM.drinkMakerProtocol(DrinksType.COFFEE, 2, false)).isEqualTo("C:2:0");
  
    }
    
    @Test
    public void when_drinkmaker_makes_message_to_the_customer(){
    	assertThat(cfM.drinkMakerProtocol(DrinksType.COFFEE, 2, true)).isEqualTo("M:message-content");
  
    }
}
