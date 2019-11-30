package OOPConceptPart1;

public class StaticAndNonStaticConcept {
	//global vars. The scope of global vars will be available across all the fns with some conditions
	String name = "Tom";//non static global variable
	static int age = 25;//static global variable

	public static void main(String[] args) {
		//how to call static meths n vars
		//1. direct call
		sum();
		//2. calling by classname
		StaticAndNonStaticConcept.sum();
		
		System.out.println(age);
		System.out.println(StaticAndNonStaticConcept.age);
		
		//How to call non static meths n variables
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		obj.sendMail();
		System.out.println(obj.name);
		
		//can I access static meths using obj reference//Ans: yes
		obj.sum();//one warning will be given
		
		

	}
	public void sendMail() {//non static meth
		System.out.println("send mail meth");
	}
	public static void sum() {//static meth
		System.out.println("sum meth");
	}
}
