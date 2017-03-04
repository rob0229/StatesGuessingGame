package com.rkclose;

import static org.junit.Assert.*;

import org.junit.Test;

public class StatesGameTest {
	StatesGame statesGame = StatesGame.getInstance();

	@Test
	public void getStateNameFromInt11Test() {
		assertEquals("Georgia", statesGame.getStateNameFromInt(11));
	}

	@Test
	public void getStateNameFromInt10Test() {
		assertEquals("Florida", statesGame.getStateNameFromInt(10));
	}

	@Test
	public void getStateNameFromInt44Test() {
		assertEquals("Texas", statesGame.getStateNameFromInt(44));
	}

	@Test
	public void getStateNameFromInt1Test() {
		assertEquals("Alaska", statesGame.getStateNameFromInt(1));
	}

	@Test
	public void getStateNameFromInt51Test() {
		assertEquals("Wyoming", statesGame.getStateNameFromInt(51));
	}

	@Test
	public void getStateNameFromInt0Test() {
		assertEquals("Invalid Index", statesGame.getStateNameFromInt(0));
	}

	@Test
	public void getStateNameFromInt52Test() {
		assertEquals("Invalid Index", statesGame.getStateNameFromInt(52));
	}
	
	@Test
	public void getStateNameFromInt36Test() {
		assertEquals("Ohio", statesGame.getStateNameFromInt(36));
	}
	
	
}
