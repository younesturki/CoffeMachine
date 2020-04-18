package com.laCombe.tdd;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CoffeMachineTest {
    
	private CoffeMachine cfM;

	@Before
	public void init() {
		cfM = new CoffeMachine();
	}

    @Test
    public void when_drinkmaker_makes_1tea_1sugar_and_aStick(){
    	assertThat(cfM.drinkMakerProtocol(DrinksType.TEA, 1, false)).isEqualTo("T:1:0");
  
    }
}
