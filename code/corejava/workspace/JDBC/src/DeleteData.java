import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteData {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Id : ");
		int id = scan.nextInt();
		
		scan.close();
		
		try {
			Class.forName(PropLoader.getValue("driver"));
			Connection con = DriverManager.getConnection(PropLoader.getValue("url"),PropLoader.getValue("user"),PropLoader.getValue("password"));
			PreparedStatement st = con.prepareStatement("delete from student where id=?"); // parameterized query
			st.setInt(1, id);
			int count = st.executeUpdate();
			con.close();
			
			System.out.println(count + " : rows Deleted...");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
