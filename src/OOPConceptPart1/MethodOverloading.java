package OOPConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);//one to one mapping
		obj.sum(10, 5);

	}
	public static void main(int a) {}
	public static void main(int b,int c) {}
	//So main meth can be overloaded//although never used
	//you cannot create one method inside another method
	
	//Method overloading is when the method name is same with different
	//arguments or input parameters within the same class
	//or with different data types
	public void sum() {//0 input params
		System.out.println("Sum method--zero param");
//		public void sum2() {}
	}
	public void sum(int j) {//1 input params
		System.out.println("Sum method--1 input param");
	}
//	public void sum(int j) {//1 input params
//		System.out.println("Sum method--1 input param");
//	}
	public void sum(double j) {//1 input params
		System.out.println("Sum method--1 input param");
	}
	public void sum(int k, int l) {//2 input params
		System.out.println("Sum method--2 input params");
		System.out.println(k+l);
	}
}
