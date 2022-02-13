/*
	print the following output
	day = 1,2,3,4,5  --> "Its'a Working Day"
	day = 6, 7  --> "It's a Weekend Day"
	day is not 1 to 7  --> "Invalid Day"
*/
public class SwitchDemo
{
	public static void main(String args[])
	{
		int day = 70;
		switch(day)
		{
			default:
				System.out.println("It's a Invalid Day");
				break;
			case 1:
			case 2:
			case 3: case 4: case 5:
				System.out.println("It's a Working Day");
				break;
			case 6: case 7:
				System.out.println("It's a Weekend Day");
				break;
		}
	}
}