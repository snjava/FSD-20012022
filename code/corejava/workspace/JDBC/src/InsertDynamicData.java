import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertDynamicData {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Id : ");
		int id = scan.nextInt();
		
		System.out.println("Enter Name : ");
		String name = scan.next();
		
		System.out.println("Enter City : ");
		String city = scan.next();
		
		scan.close();
		
		try {
			
			Class.forName(PropLoader.getValue("driver"));
			Connection con = DriverManager.getConnection(PropLoader.getValue("url"),PropLoader.getValue("user"),PropLoader.getValue("password"));
			PreparedStatement st = con.prepareStatement("insert into student values(?,?,?)"); // parameterized query
			st.setInt(1, id);
			st.setString(2, name);
			st.setString(3, city);
			int count = st.executeUpdate();
			con.close();
			
			System.out.println(count + " : rows inserted...");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}











