import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateData {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Id : ");
		int id = scan.nextInt();
		
		System.out.println("Enter City : ");
		String city = scan.next();
		
		scan.close();
		
		try {
			Class.forName(PropLoader.getValue("driver"));
			Connection con = DriverManager.getConnection(PropLoader.getValue("url"),PropLoader.getValue("user"),PropLoader.getValue("password"));
			PreparedStatement st = con.prepareStatement("update student set city=? where id=?"); // parameterized query
			st.setString(1, city);
			st.setInt(2, id);
			int count = st.executeUpdate();
			con.close();
			
			System.out.println(count + " : rows Updated...");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
