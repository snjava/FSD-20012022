public class Array2D_2
{
	public static void main(String ar[])
	{

		double percent[][] = { 
				{78, 65, 78, 89}, 
				{78, 87 , 67, 89}, 
				{87, 67, 65, 90} 
			};		


		System.out.println(percent.length); // total number of rows
		System.out.println(percent[0].length); // total number of values in 0th row


		System.out.println("===============================");

		for ( int r = 0 ; r<3 ; r++ )
		{
			for( int c = 0 ; c<4 ; c++ )
			{
				System.out.print(percent[r][c] + "\t");
			}
			System.out.println();
		}

		System.out.println("===============================");

		for(double var[] : percent) 
		{
			for(double value : var)
			{
				System.out.print(value + "\t");
			}
			System.out.println();
		}
	}
}