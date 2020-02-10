package loginpackage;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;
/**
 * Servlet implementation class logincontroller
 */
@WebServlet("/logincontroller")
public class logincontroller extends HttpServlet {
	    

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		fileRW fileRW=new fileRW();
        String button=request.getParameter("button");
        System.out.println(button);
        if(button.equals("Login")) {
        	String un = request.getParameter("username");
            String pw = request.getParameter("password");
            System.out.println(System.getProperty("user.dir"));
            user user=new user(un,pw);
            boolean isValid=fileRW.isValid(user);
        if (isValid) 
        {
            response.sendRedirect("success.html");
            return;
        } 
        else 
        {
            response.sendRedirect("error.html");
            return;
        }
        }
        else {
        	String un = request.getParameter("user_name");
            String pw = request.getParameter("password");
            if(un!=null && pw!=null) {
            	user user=new user(un,pw);
            	fileRW.add(user);
            	response.sendRedirect("login.jsp");
            }
        	
        	
        }
	}

}
