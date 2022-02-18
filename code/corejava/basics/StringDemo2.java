public class StringDemo2
{
	public static void main(String ar[])
	{
		String str1 = "Java Program";
		System.out.println(str1);
		
		System.out.println(str1.length());
		System.out.println(str1.isEmpty());
		System.out.println(str1.charAt(5)); // P
		System.out.println(str1.indexOf('a'));  // 1
		System.out.println(str1.lastIndexOf('a')); // 10
		System.out.println(str1.startsWith("Java")); // true
		System.out.println(str1.endsWith("Java")); // false
		
		String str2 = "                ";
		System.out.println(str2.isEmpty()); // false
		System.out.println(str2.isBlank()); // true (In JDK-11)


		String str3 = "String Java Program";
		System.out.println(str3.substring(7));
		System.out.println(str3.substring(7, 11));


	}
}