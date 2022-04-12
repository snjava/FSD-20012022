import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertData {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd19jan","root","root");
			PreparedStatement stmt = conn.prepareStatement("insert into student values(1,'Abc','Pune'),(2,'Prq','Pune'),(3,'Lmn','Mumbai')");
			int count = stmt.executeUpdate();
			conn.close();
			
			System.out.println("Total Rows Inserted : " + count);
			
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
