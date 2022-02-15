/*
Createa variable percentage,
	print the output as "PASS" if percent is grater than eq 40 else print "FAIL" if its less than 40
	Print the following output
		if percent is between 40-49 -> Pass Class
		if percent is between 50-59 -> Second Class
		if percent is between 60-74 -> First Class
		if percent is between 75-100 -> Dist...
*/
public class IfDemo
{
	public static void main(String args[])
	{
		double percent = 20.23;
		
		if(percent>=40 && percent<=100) 
		{
			if (percent >= 40 && percent<50)
			{
				System.out.println("Congrats!! You got Pass Class."); // 1
			}
			else if(percent>=50 && percent<60)
			{
				System.out.println("Congrats!! You got Second Class."); // 2
			}
			else if(percent>=60 && percent<75)
			{
				System.out.println("Congrats!! You got First Class."); // 3
			}
			else if(percent>=75 && percent<100) 
			{
				System.out.println("Congrats!! You got Dist..."); // 4
			}
		}
		else
		{
			System.out.println("Sorry!! You are FAIL."); // 5
		}
	}
}