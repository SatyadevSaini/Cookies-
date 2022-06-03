

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/S1")
public class S1 extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = null;
		try {
			out = response.getWriter();
			String s1 =request.getParameter("name");
			String s2 =request.getParameter("class");
			String s3 =request.getParameter("age");
			String s4 =request.getParameter("adress");
			
			out.print("<html><body>");
			out.print("<h3>Name is : "+s1+"</h3>");
			out.print("<h3>Class is : "+s2+"</h3>");
			out.print("<h3>Age is : "+s3+"</h3>");
			out.print("<h3>Adress is : "+s4+"</h3>");
			
			out.print("</body></html>");
			
			
			
		} catch (Exception e) {
			out.print(e);
		}
	}

}
