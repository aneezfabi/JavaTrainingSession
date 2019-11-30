package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		
		//at a time only 1 value for 1 variable
		//array: to store similar data type values in a (array) variable//can store multiple values
		//integer array
		//1 dimensional arrays
		//2 disadvantages of array::
		//1. size is fixed - static array//To overcome this problem we use collections like ArrayList,Hashtable - dynamic arrays
		//2. can store only similar datatypes//To overcome this problem we use object array.
		int i[] = new int[4]; //i will be divided into 4;0 is the lowest index and highest(upper) index/bound = sizeOfArray - 1
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		System.out.println(i[2]);
		System.out.println(i[3]);
		
		//System.out.println(i[4]); //ArrayIndexOutOfBoundsException
		System.out.println(i.length);//size/length of array
		
		//Print all the values of array //just use (for or while) loop ALWAYS
		for(int j=0;j<i.length;j++) {
			System.out.println(i[j]);//looping variable(j)(individual row variable) should be changing one
			//printing/usage should be the array variable(i) itself
		}
		double d[] = new double[3];
		d[0] = 12.33;
		d[1] = 14.44;
		d[2] = 45.55;
		
		System.out.println(d[2]);
		
		char c[] = new char[3];
		c[0] = 'a';
		c[1] = '$';
		c[2] = '3';
		
		boolean b[] = new boolean[2];
		b[0] = true;
		b[1] = false;
		
		String s[] = new String[3];
		s[0] = "Test";
		s[1] = "Hello";
		s[2] = "World";
		
		System.out.println(s.length);
		System.out.println(s[1]);
		
		
		//Object Array is used to store different data types values
		//Object is a class
		Object ob[] = new Object[6];//Super class of all the classes in java
		ob[0] = "Tom";
		ob[1] = 24.55;
		ob[2] = "1/1/1993";
		ob[3] = 'M';
		ob[4] = "%%";
		ob[5] = "London";
		
		System.out.println(ob[5]);
		
		for(int k=0;k<ob.length;k++) {
			System.out.println(ob[k]);
		}
	}

}
