import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectData {
	public static void main(String[] args) {
		try {
			Class.forName(PropLoader.getValue("driver"));
			Connection con = DriverManager.getConnection(PropLoader.getValue("url"),PropLoader.getValue("user"),PropLoader.getValue("password"));
			PreparedStatement st = con.prepareStatement("select * from student");
			ResultSet rs = st.executeQuery();
			
			while(rs.next()) {
				System.out.print(rs.getInt("id") + "\t");
				System.out.print(rs.getString("name") + "\t");
				System.out.println(rs.getString("city"));
			}
			
			rs.close();
			st.close();
			con.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
