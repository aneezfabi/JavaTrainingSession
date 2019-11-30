package JavaBasics; //mentioning / defining package. keyword package.
//Package - Just like a folder - Files for search fnality, codes related to login fnality, dividing codes for search related in 1 folder, etc...
//(Seperate Packages)
public class DataTypes {// public -> access modifier. Means can access from anywhere in the project

	//Hi this is my first java code
	
	/*This
	 * is my
	 * first java
	 * code */
	
	//main method -> starting / execution point of the prog
	public static void main(String[] args) {// inside main method we will write code
		// Primitive DTs -> int, double, char, boolean. String is not
		//types for representing your data. int keyword. int is a datatype
		int i = 10;
		i = 20;
		int j = 30;
		System.out.println(j);//System is class, println is method//output in console
		int k = 40;//each and every java statement should be ended with ';'//no semicolon for others
		int l = -1;
		System.out.println(l);//syso ctrl+space
		System.out.println(i+j);
		//can't use/print d before declaration here.
		double d = 12.33;
		double d1 = 100;//will be treated as 100.00
		System.out.println(d1);
		char c = 'a';//always with single quotes//only single digit value
		char c1 = '1';
		boolean b1 = true;//true and false are keywords as well as value
		boolean b2 = false;
		//string is a class not a DT. but can be used as a datatype. So has capital S in beginning
		String s = "Hello World";
		String s4 = "12.33";//treated as string
		System.out.println(s4);
		
	}

}
