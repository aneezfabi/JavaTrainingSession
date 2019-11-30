package OOPConceptPart1;

public class Car {

	//class variables//copy of these variables be given to all the objects//global to whole class
	int mod;
	int wheel;
	
	public static void main(String[] args) {
		
		Car a = new Car();//RHS new Car() is called Object//a is object referring variable//a is representing this object
		Car b = new Car();//new keyword is used to create an object
		Car c = new Car();//a,b,c called object reference variable
		
		a.mod = 2015;
		a.wheel = 4;
		
		b.mod = 2014;
		b.wheel = 4;
		
		c.mod = 2013;
		c.wheel = 6;
		//Before shifting the object references
		System.out.println(a.mod);
		System.out.println(a.wheel);
		
		System.out.println(b.mod);
		System.out.println(b.wheel);
		
		System.out.println(c.mod);
		System.out.println(c.wheel);
		
		
		a = b;
		b = c;
		c = a;
		
		a.mod = 10;
		System.out.println(a.mod);
		c.mod = 20;
		System.out.println(a.mod);
		
	}

}
