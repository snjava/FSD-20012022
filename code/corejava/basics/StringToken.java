/*
"2202-7.40-Abcd"
Date : 2202
Time : 7.40
Name : Abcd
*/
import java.util.StringTokenizer;
public class StringToken
{
	public static void main(String args[])
	{
		StringTokenizer st = new StringTokenizer("2202-7.40-Abcd", "-");
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}	
}