package JavaBasics;

public class LoopsConcept {//for removing repetitive code use loops

	public static void main(String[] args) {
		
		//while loop
		//disadvantage is it will generate infinite loop if you dont give inc/decremental part
		
		int i = 0;//initialization
		while(i<10) {//true//conditional part
			System.out.println(i);
			i = i+1;//incremental/decremental part
		}
		System.out.println("**********");
		//j++ means j = j+1, doesn't mean j = j++ or j = ++j, just that j = j+1
		//for loop
		for(int j=1;j<=2;j++) {//1.initialization;2.conditionalPart;3.Inc/decrementalPart
		System.out.println(j);
	}
		for(int j=1;j<=2;++j) {//1.initialization;2.conditionalPart;3.Inc/decrementalPart
			System.out.println(j);
		}
		for(int k=10;k>=-10;k--) {//1.init->2.cond->3.body->4.inc/decPart->5.cond->6.body->7.incPart->...
			System.out.println(k);
		}
}
}