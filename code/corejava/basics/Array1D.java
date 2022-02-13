public class Array1D
{
	public static void main(String ar[])
	{
		double percent[]; // declaration

		percent = new double[5]; // instance creation

		percent[0] = 67.78;  // initialization
		percent[3] = 87.18;
		percent[5] = 87.18; 
		
		for(int i = 0 ; i < 5 ;i++) 
		{
			System.out.println(percent[i]);
		}

	}
}