package com.rkclose;

import junit.framework.Assert;
import junit.framework.TestCase;

import com.rkclose.StatesGame;


public class StatesGameTest extends TestCase {
	
	private StatesGame sone = null, stwo = null;

	   public StatesGameTest() {
	      super();
	   }
	   
	   public void setUp(){
	      sone = StatesGame.getInstance();
	      stwo = StatesGame.getInstance();
	    
	   }
	   public void testUnique() {
	      
	      Assert.assertEquals(true, sone == stwo);
	      Assert.assertEquals(-1, sone.getDistance("random Text"));
	      //not testable...yet. The distance is determined by a randomly generated state
	      //Assert.assertEquals(4, sone.getDistance("New York"));
	   }
	
	

}
