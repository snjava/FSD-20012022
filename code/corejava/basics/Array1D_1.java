public class Array1D_1
{
	public static void main(String ar[])
	{
		int[] percent = new int[] {78,89,56,79,78,54,67,87,78,45,51,78,87};
		
		System.out.println(percent.length); // total number of values in array
		System.out.println(percent.length - 1); // it will return the last index of array
		
		System.out.println("=============================");
		
		for(int i = 0 ; i <= percent.length - 1 ; i++) {
			System.out.println(percent[i]);
		}

		System.out.println("=============================");

		for(int var : percent)
		{
			System.out.println(var);
		}
	}
}