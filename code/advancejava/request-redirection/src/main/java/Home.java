

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/user-home")
public class Home extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("uname");
		
		String email = (String) request.getAttribute("user-email");
		String contact = (String) request.getAttribute("user-contact");
		
		
		out.print("<h1>Welcome User, "+userName+" </h1>");
		out.print("<h3>Email : "+email+" </h3>");
		out.print("<h3>Contact : "+contact+" </h3>");
	}

}
