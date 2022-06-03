

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Set")
public class Set extends HttpServlet {
	  
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = null;
		try {
			
			out = response.getWriter();
			
			// Create Cookies 
			Cookie c1 =  new Cookie("name", "Satyadev");
			Cookie c2 =  new Cookie("course", "BCA");
			Cookie c3 =  new Cookie("language", "Java");
			Cookie c4 =  new Cookie("adress", "Noida");
			
			//set age of the Cookies..
			c1.setMaxAge(60*60*24);
			c2.setMaxAge(60*60*24);
			c3.setMaxAge(60*60*24);
			c4.setMaxAge(60*60*24);
			
			//send Cookies to the browser
			response.addCookie(c1);
			response.addCookie(c2);
			response.addCookie(c3);
			response.addCookie(c4);
			
			
		} catch (Exception e) {
			out.print(e);
		}
	}

}
