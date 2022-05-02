

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/create-user")
public class SaveUserDetails extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h1>This is a save process</h1>");
		
		try {
			
			
			//System.out.println(PropLoader.getValue("url"));
			
			// DB connection
			// Insert data into DB		
			// redirect to personal-info.jsp
			
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
