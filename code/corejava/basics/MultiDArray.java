public class MultiDArray
{
	public static void main(String ar[])
	{
		double percent[][] = {
			{67, 79, 80, 67},
			{76, 56},
			{56, 78, 99}
		};

		System.out.println(percent.length);	// 3
		System.out.println(percent[1].length);	// 2
		System.out.println(percent[0].length);	// 4

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