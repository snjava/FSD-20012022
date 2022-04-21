

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/search")
public class Search extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html>");
			out.print("<head>");
				out.print("<title>Search.com</title>");
			out.print("</head>");
			out.print("<body>");
				out.print("<div align='center'>");
				out.print("<form action='result'>");
					out.print("<img src='https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png' />");
					out.print("<br/>");
					out.print("Search For : <input type ='text' name='q'/>");
					out.print("<br/><br/>");
					out.print("<button type='submit'>My Search</button>");
				out.print("</form>");
				out.print("</div>");
			out.print("</body>");
		out.print("</html>");
	}

}
