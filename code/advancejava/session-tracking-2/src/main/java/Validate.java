

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/validate")
public class Validate extends HttpServlet {
	
	Map<String, String> userInfo = new HashMap<String, String>();
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		userInfo.put("Admin", "Admin123");
		userInfo.put("Abc", "Abc123");
		userInfo.put("Xyz", "Xyz123");
		userInfo.put("Pqr", "Pqr123");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("uname");
		String userPass = request.getParameter("upass");
		
		String pass = userInfo.get(userName);
		if(pass!=null && pass.equals(userPass)) {
			
			//create and send cookie at client side
			Cookie ck = new Cookie("user", userName); // to create a cookie
			ck.setMaxAge(48*60*60); // to set the expire time for the cookie in seconds
			response.addCookie(ck); // to send cookie at client side
			
			RequestDispatcher dis = request.getRequestDispatcher("home.jsp");
			dis.forward(request, response);
		} else {
			response.sendRedirect("login.jsp?c=401");
		}
		
	}

}













