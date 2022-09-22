package servlet_jsp_mini_project;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/getuser")
public class GetUserController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
UserDao dao=new UserDao();
		
		HttpSession session = req.getSession(false);
		String uname = (String)session.getAttribute("name");
		
		User_Dto u = dao.getUserByName(uname);
		req.setAttribute("user", u);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("viewUser.jsp");
		dispatcher.forward(req, resp);
	}
}
