

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sign-in")
public class Login extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html>"
					+ "<head>"
						+ "<title>User Sign-in</title>"
					+ "</head>"
					+ "<body>"
					+ "<div align='center'>"
					+ "<h1>User Sing-in Page</h1>"
						+ "<form action='validate' method='post'>"
							+ "Enter UserName : <input type='text' name='uname'><br><br>"
							+ "Enter Password : <input type='password' name='pass'><br><br>"
							+ "<input type='submit' value='Login'><br><br>"
						+ "</form>"
						+ "<div>"
					+ "</body>"
				+ "</html>");
		
	}

}
