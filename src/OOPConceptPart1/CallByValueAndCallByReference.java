package OOPConceptPart1;

public class CallByValueAndCallByReference {
	
	int p;
	int q;

	public static void main(String[] args) {
		
		CallByValueAndCallByReference obj = new CallByValueAndCallByReference();
		int x=10;
		int y=20;
		System.out.println(obj.testSum(x, y));//Call by value/*pass by value*
		//The copy of x and y will be given/passed not the original
		//Photo copy changes are done. It will not affect original one
		int x1=10;
		int y1=20;
		System.out.println("Before SwapValue x1= "+x1+" y1 "+y1);
		obj.swapValue(x1, y1);
		System.out.println("After SwapValue x1= "+x1+" y1 "+y1);
		
		obj.p = 50;
		obj.q = 60;
		System.out.println("Before SwapReference obj.p= "+obj.p+" obj.q= "+obj.q);
		//call by reference//*passing the object references*
		obj.swap(obj);
		//after swap
		System.out.println("After SwapReference obj.p= "+obj.p+" obj.q= "+obj.q);


	}
	public int testSum(int a, int b) {
		a=30;
		b=40;
		int c = a+b;
		return c;
	}
	//pass reference to reference
	public void swap(CallByValueAndCallByReference t) {
		//obj will be given to t//So 2 references for 1 particular obj
		int temp;
		temp = t.p;//temp=50
		t.p = t.q;//t.p=60
		t.q = temp;//t.q=50
		
	}
	
	public void swapValue(int h, int k) {
		//obj will be given to t//So 2 references for 1 particular obj
		int temp;
		temp = h;//temp=50
		h = k;//t.p=60
		k = temp;//t.q=50
		System.out.println("h(x1) "+h+" k(y1) "+k);
	}

}
