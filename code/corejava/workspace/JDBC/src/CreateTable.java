import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CreateTable {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd19jan","root","root");
			PreparedStatement pstmt = con.prepareStatement("create table student(id int, name varchar(20), city varchar(20))");
			int c = pstmt.executeUpdate();
			pstmt.close();
			con.close();
			
			System.out.println("Table Created Successfully...");
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
