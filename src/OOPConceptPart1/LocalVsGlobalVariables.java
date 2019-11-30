package OOPConceptPart1;

public class LocalVsGlobalVariables {
	//Global/Class variables
	String name = "Tom";//non static//so only obj can be used for access
	int age = 25;//object non static

	public static void main(String[] args) {
		
		int i = 10;//local variable for main meth
		System.out.println(i);//local variable can be used directly
		//System.out.println(name);//Error since its a non static var
		LocalVsGlobalVariables obj = new LocalVsGlobalVariables();
		System.out.println(obj.name);
		System.out.println(obj.age);

	}
	
	public void sum() {
		int i = 15;//local variable of sum method//scope or usage only inside this method
		int j = 20;
		int age = 25;
	}

}
