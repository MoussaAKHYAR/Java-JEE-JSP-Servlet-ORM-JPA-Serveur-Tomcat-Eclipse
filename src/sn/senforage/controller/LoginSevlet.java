package sn.senforage.controller;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sn.senforage.entities.User;
import sn.senforage.model.IUser;
import sn.senforage.model.UserImpl;

/**
 * Servlet implementation class LoginSevlet
 */
@WebServlet(name = "login", urlPatterns = { "/login" })
public class LoginSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private IUser iuser;
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		iuser = new UserImpl();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email = request.getParameter("email").toString();
		String password = request.getParameter("password").toString();
		
		HttpSession session = request.getSession();
		session.setAttribute("email", email);
		
		User user = iuser.getLogin(email,password);
		if (user != null) {
			response.sendRedirect("index.jsp");
		}
		else {
			response.sendRedirect("login");
		}
		//doGet(request, response);
	}

}
