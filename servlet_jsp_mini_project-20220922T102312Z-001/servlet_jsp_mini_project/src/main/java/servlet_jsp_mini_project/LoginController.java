package servlet_jsp_mini_project;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	    resp.setContentType("text/html");  
	    PrintWriter out = resp.getWriter();  
		
		String email = req.getParameter("username");
		String password = req.getParameter("password");
		
		long pwd = Long.parseLong(password);
		
		UserDao dao = new UserDao();
		User_Dto user = dao.getUserByEmail(email, pwd);
		
		if (user != null) {
			HttpSession session = req.getSession();
			session.setAttribute("name", user.getName());
			
			RequestDispatcher rd = req.getRequestDispatcher("home.jsp");
			rd.forward(req, resp);
		}
		 else {
			 	out.print("Invalid Password or Email......!!!!!!");
			 	
				RequestDispatcher dispatcher=req.getRequestDispatcher("login.jsp");
				dispatcher.include(req, resp);
			}
	}
}
