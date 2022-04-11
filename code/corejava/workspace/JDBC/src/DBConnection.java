import java.sql.DriverManager;
import java.sql.Connection;

public class DBConnection {
	public static void main(String[] args) {
		try {
			// 1. Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2. Create Connection 
			Connection conObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd19jan","root","root"); 
			
			System.out.println("Conncetion Success...");
			
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
