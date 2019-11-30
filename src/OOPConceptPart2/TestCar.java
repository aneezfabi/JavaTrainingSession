package OOPConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		
		//static polymorphism or compile time polymorphism
		//coz at compile time , java will decide which meth to take
		//so tell the meth overriding definition and eg
		//theftSafety can be accessed only using compile time polymorphism
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftSafety();
		b.engine();
		
		System.out.println("***");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		
		//Top casting//moving/fitting small thing to big thing
		Car c1 = new BMW();//child class object can be referred by parent
		//class reference variable -- dynamic polymorphism or runtime polymorphism
		c1.start();
		c1.stop();
		c1.refuel();
		//only parent class methods and overridden methods can be used by this
	

		//Down casting
		BMW b1 = (BMW)new Car();//(BMW)new Car();
		
	}

}
