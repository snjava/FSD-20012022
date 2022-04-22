

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/validate")
public class Validate extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("uname");
		String password = request.getParameter("pass");
		
		if("Admin".equals(userName) && "Admin123".equals(password))
		{
			RequestDispatcher rd = request.getRequestDispatcher("user-home");
			rd.forward(request, response);
		}
		else
		{
			response.sendRedirect("invalid");
		}
		
	}

}
