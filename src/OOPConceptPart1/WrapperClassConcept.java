package OOPConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		
		String x = "100";
		System.out.println(x+20);
		
		//Data conversion from string to integer
		//Integer,Double,Character,Boolean are wrapper classes
		int i = Integer.parseInt(x);//parse into integer
		System.out.println(i+20);
		
		String y = "12.33";
		double d = Double.parseDouble(y);
		System.out.println(d);
		
		//String to boolean
		String k = "true";
		boolean b = Boolean.parseBoolean(k);
		System.out.println(b);
		
		//int to string conversion
		int j = 200;
		System.out.println(j+20);
		String s = String.valueOf(j);//"200"
		System.out.println(s+20);
		
		String u = "100a";
		Integer.parseInt(u);//NumberFormatException for input string "100a".
		//it should be a pure integer value
		
	}

}
