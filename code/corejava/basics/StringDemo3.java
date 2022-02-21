public class StringDemo3
{
	public static void main(String ar[])
	{
		String str1 = new String("Welcome");
		System.out.println(str1);
		char ch[] = str1.toCharArray();
		for(int i = ch.length-1 ; i>=0 ; i--)
		{
			System.out.print(ch[i]);
		}
		System.out.println();
			
		String str2 = "Hello ";
		String str3 = "Good Morning";
		System.out.println(str2 + str3);
		System.out.println(str2.concat(str3));
		int a = 20, b = 30;
		System.out.println("Sum : " + a + b); // Sum : 2030 

		System.out.println("=======================");
		String str4 = "Good Morning";
		System.out.println("Original String : "+str4);
		String str5 = str4.toUpperCase(); // GOOD MORNING
		System.out.println("After UpperCase : " + str5);
		System.out.println("After LowerCase : " + str4.toLowerCase()); // good monring

		System.out.println("=======================");
		String str6 = "String in Java";
		System.out.println(str6);
		String strArray[] = str6.split(" ");
		for(int i = strArray.length-1 ; i>=0 ; i--)
		{
			System.out.print(strArray[i] + " ");
		}
		System.out.println();

		String str7 = "java/session/file/corejava.pdf";
		System.out.println(str7.endsWith(".pdf"));
		String strArr[] = str7.split("/");
		System.out.println(strArr[strArr.length-1]);

		System.out.println("=======================");
		String str8 = "Hello";
		String str9 = new String("Hello");
		String str10 = "HELLO";
		System.out.println(str8.equals(str9)); // ture
		System.out.println(str8.equalsIgnoreCase(str10)); // false
		

	}
}


//	index:-  0	1	2	3	4	5	6
//	Value:-  W	e	l	c	o	m	e


//	Index:-   0		1 	 2
//	Value:- String		in	Java

