package JavaBasics;

public class IncrementAndDecrementOperator {

	public static void main(String[] args) {
		
		int i = 1;
		int j = i++; //post increment//give i to j then increase the value of i by 1//inc/dec last
		
		System.out.println(i);
		System.out.println(j);
		
		int a = 1;
		int b = ++a; //pre increment//increase the value of a by 1 then give it to b
		
		System.out.println(a);
		System.out.println(b);
		
		int m = 2;
		int n = m--; //post dec
		
		System.out.println(m);
		System.out.println(n);
		
		int p = 3;
		int q = --p;
		
		System.out.println(p);
		System.out.println(q);
	}

}
