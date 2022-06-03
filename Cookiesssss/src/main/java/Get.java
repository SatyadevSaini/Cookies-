

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Get")
public class Get extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	     PrintWriter out = null;
	     
	     try {
	    	 out = response.getWriter();
	    	 
             out.print("<!DOCTYPE html> <html> <body>");
			 out.print("<p> Get The Coookies to the Browser  </p>");
	    	 
	    	 // get the Cookies ...
			 Cookie c[] = request.getCookies();
			 
			 // 2 condition occur cookies has data or not ...
			 
			 if( c != null ) {
				 for(Cookie x : c) {
					 out.print("<p> "+x.getName()+"  &nbsp  "+x.getValue()+"</p>"); 
				 }
			 }
			 else {
				 out.print("<p>  No Cookies Found </p>");
			}
			 out.print("</body></html>");
				
		} catch (Exception e) {
			
		}
	}

}
