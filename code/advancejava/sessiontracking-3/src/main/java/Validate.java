

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
			HttpSession session = request.getSession(); // create new or get existing session  
			session.setAttribute("user", userName); // set the data inside session
			
			response.sendRedirect("home.jsp");
		} else {
			response.sendRedirect("login.jsp?code=401");
		}
		
	}

}













