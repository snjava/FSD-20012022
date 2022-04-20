

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ResponseDemo")
public class ResponseDemo extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html"); // set the type of response
		PrintWriter write = response.getWriter(); // to return the response to the user.
		write.print("<h1>Welcome To Servlet</h1>");
		write.print("<h1>This is my first response</h1>");
		write.print("<div align='center'>");
		write.print("<img src='https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png' />");
		write.print("<br>");
		write.print("Search : <input type='text' name='msg' >");
		write.print("<br><br>");
		write.print("<input type='Submit' value='Google Search' style='background-color:green;' >");
		write.print("</div>");
	}

}
