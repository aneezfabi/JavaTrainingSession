package JavaBasics;

public class TwoDimArray {

	public static void main(String[] args) {
		
		String x[][] = new String[3][5];
		
		System.out.println(x.length);//total no of rows
		System.out.println(x[0].length);//total no of columns
		
		//1sr row
		x[0][0] = "A";
		x[0][1] = "B";
		x[0][2] = "C";
		x[0][3] = "D";
		x[0][4] = "E";
		
		x[1][0] = "A1";
		x[1][1] = "B1";
		x[1][2] = "C1";
		x[1][3] = "D1";
		x[1][4] = "E1";
		
		x[2][0] = "A2";
		x[2][1] = "B2";
		x[2][2] = "C2";
		x[2][3] = "D2";
		x[2][4] = "E2";

		System.out.println(x[1][2]);
		System.out.println(x[2][2]);
		System.out.println(x[0][4]);
		
		//print all the values of 2d array
		for (int row=0;row<x.length;row++) {//10's place (using outerloop)
			System.out.println();
			for (int col=0;col<x[0].length;col++) {//units place is inside(inner loop) and rest like that
				System.out.print(x[row][col]+" ");
			}
		}
		String y[][][][] = new String[1][1][1][2];
		y[0][0][0][0] = "You discovered ";
		y[0][0][0][1] = "4 dimensions, congrats";
		for(int x1=0;x1<y.length;x1++) {
			for(int y1=0;y1<y[0].length;y1++) {
				for(int z1=0;z1<y[0][0].length;z1++) {
					for(int a1=0;a1<y[0][0][0].length;a1++) {
						System.out.println(y[x1][y1][z1][a1]);
					}
				}
			}
		}
		
	}

}
