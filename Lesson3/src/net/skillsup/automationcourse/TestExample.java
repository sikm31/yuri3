package net.skillsup.automationcourse;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestExample {
	
	/**
	 * Precondition:
	 * car is stopped
	 * Steps:
	 * turn on the engine
	 * verify the car is started
	 */
	@Test
	@Before
	public void testSomething(){
		
		Car carObject = new Car();
		Assert.assertFalse(carObject.isEngineStarted());
		carObject.startEngine();
		Assert.assertTrue(carObject.isEngineStarted());
		carObject.stopEngine();
		Assert.assertFalse(carObject.isEngineStarted());
		
	}
	
	@Test
	public void bugaga(){
		System.out.println("TEST");
	}

}
