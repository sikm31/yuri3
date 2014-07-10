
public class MilitaryBase {
	
	private Car car;
	
	MilitaryBase(Car car){
		this.car = car;
	}
	
	MilitaryBase(){
		car = new Car();
	}
	
	void rideCar(){
		car.move();
	}
	
	void rideCar(int requiredSpeed){
		System.out.println("speed is " + requiredSpeed);
		car.move();
	}
	
	void setCar(Car car){
		this.car = car;
	}

	public static void main(String[] args) {
		Car anyOne = new Car();
		MilitaryBase militaryBase = new MilitaryBase(anyOne);
		System.out.println("count of cars: " + Car.carCount);
		militaryBase.rideCar();
		militaryBase.setCar(new Btr());
		System.out.println(anyOne.carCount);
		militaryBase.rideCar();
		
		int a = 5;
		int b = 5;
		
		Integer a1 = new Integer(a);
		Integer b1 = new Integer(b);
		
		if(a == b){
			System.out.println("Equals");
		}
		
		if(a1.equals(b1)){
			System.out.println("Everething is ok");
		}
		else{
			System.out.println("something wrong, body!");
		}
		
		Car car3 = null;
	}

}
