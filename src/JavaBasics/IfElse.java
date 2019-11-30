package JavaBasics;

public class IfElse {

	public static void main(String[] args) {

		int a = 30;
		int b = 20;
		
		if(b>a) {//inside if condition always a boolean condition is written(true or false
			System.out.println("b is greater than a");
		}
		else {
			System.out.println("a is greater than b");
		}
		
		//comparison operators
		//>,<,<=,>=,!=,==

		int c = 50;
		int d = 40;
		
		if(c==d) {
			System.out.println("c and d are equal");
		}
		else {
			System.out.println("c and d are not equal");
		}
		
		//write a logic to find out the highest number
		int a1 = 400;
		int b1 = 500;
		int c1 = 300;
		
		//nested if else
		if (a1>b1 & a1>c1) {//false & false = false//first 2 conditions
			System.out.println("a1 is the greatest");
		}
		else if (b1>c1) { //false//second 2-1 conditions
			System.out.println("b1 is the greatest");
		}
		else { //true//third 2-2 conditions
			System.out.println("c1 is the greatest");
		}
		
	}

}
