package net.skillsup.automationcourse;

public class Car {
	
	private Boolean isEngineStarted;
	
	public Car(){
		isEngineStarted = false;
		System.out.println(isEngineStarted);
	}
	
	public void startEngine(){
		isEngineStarted = true;
	}
	
	public void stopEngine(){
		isEngineStarted = false;
	}
	
	public boolean isEngineStarted(){
		return isEngineStarted;
	}

}
