package JavaBasics;

public class StringConcatenation {

	public static void main(String[] args) {
		
		//println for writing in console with the new line after that
		//print for just print
		
		int a = 100;
		int b = 200;
		
		String x = "Hello";
		String y = "World";
		
		double c = 12.33;
		double d = 10.33;
		
		System.out.println(a+b);
		System.out.println(x+y);
		
		System.out.println(a+b+x+y);//left to right execution//300HW
		
		System.out.println(x+y+a+b);//left to right execution//so 100200 not 300//HW100200
		
		System.out.println(x+y+(a+b));//so beginning matters//int or string//if string comes in middle rest will be string if no () again
		
		System.out.println(a+b+x+y+a+x+b+y);
		
		System.out.println(a+b+x+y+a+b);
		
		System.out.println(x+y+c+d);
		
		System.out.println("HelloWorld");
		
		System.out.println("the value of a is "+a);
		
		System.out.println("the addition of a and b is "+(a+b));
		
		System.out.print("HelloSelenuim");//no new line
		System.out.println("helloTesting");//ln to give lineNew
		
	}

}
