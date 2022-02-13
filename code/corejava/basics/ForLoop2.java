/*
	1 1 1 1 1
	2 2 2 2 2
	3 3 3 3 3
	4 4 4 4 4
*/


public class ForLoop2 {
	public static void main(String ar[]) {
		for (int r=1 ; r<=4 ; r++)    // row
		{ 
			for(int c = 1 ; c<=5 ; c++)  // column
			{ 
				System.out.print(r + " ");
			}
			System.out.println();
		}
	}
}