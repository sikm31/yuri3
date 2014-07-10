
public class Car extends Transport {
	
	int countOfWheels;
	int countOfDoors;
	
	String name;
	
	public static int carCount = 0;
	
	Car(){
		carCount++;
	}
	
	public void move(){
		System.out.println("I'm a car, and I'm moving");
	}

}
