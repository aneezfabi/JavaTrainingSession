package OOPConceptPart2;

public class BMW extends Car {
	
	//method overriding//when one meth is present in parent as well as child class
	//with same name and same no of arguments
	public void start() {//over-ridden method
		System.out.println("BMW--start");
	}
	public void theftSafety() {
		System.out.println("BMW--theftSafety");
	}
}
