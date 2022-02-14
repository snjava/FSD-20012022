public class Array2D_1
{
	public static void main(String ar[])
	{
		double percent[][];

		percent = new double[3][4];

		percent[0][1] = 98;
		percent[1][2] = 72.2;

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