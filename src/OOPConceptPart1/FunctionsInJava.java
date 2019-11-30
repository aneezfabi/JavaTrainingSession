package OOPConceptPart1;

public class FunctionsInJava {

	public static void main(String[] args) {//starting point of execution
		//main meth is void coz it never returns a value 
		FunctionsInJava obj = new FunctionsInJava();
		//All nonstatic meth's copy will be given to this object(whenever one object is created)
		//one object will be created, obj is the reference variable, referring to this object
		obj.test();//calling this nonstatic method
		int l = obj.pqr();
		System.out.println(l);
		String s1 = obj.qa();
		System.out.println(s1);
		int div = obj.division(30, 10);//30 will be given to x...//one to one mapping
		System.out.println(div);
		
//		System.out.println(division(10,5));
//		System.out.println(qa());
//		System.out.println(pqrl());
		
	}
	
	//non static methods
	//1st type of method - no input no output
	public void test() {//publicly available//test - method name//void means does not return anything//void return
		System.out.println("test method");
		
	}
	//2. No input but some output
	public int pqr() {//returns integer in this function//return type is int
		System.out.println("PQR method");
		int a = 10;
		int b = 20;
		int c = a+b;
		
		return c;
		
	}
	//2.
	public String qa() { //returns String
		System.out.println("QA method");
		String s = "Selenium";
		return s;
	}//3. Some input and based on input output is generated
	public int division(int x, int y) {// x and y are input parameters or arguments
		System.out.println("division method");
		int d = x/y;
		return d;
	}
}
