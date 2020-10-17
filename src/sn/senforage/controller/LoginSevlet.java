package sn.senforage.controller;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sn.senforage.entities.Utilisateur;
import sn.senforage.model.IUtilisateur;
import sn.senforage.model.UtilisateurImpl;

/**
 * Servlet implementation class LoginSevlet
 */
@WebServlet(name = "login", urlPatterns = { "/login" })
public class LoginSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private IUtilisateur iUtilisateur;
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		iUtilisateur = new UtilisateurImpl();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
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
		
		Utilisateur utilisateur = iUtilisateur.getLogin(email, password);
		if (utilisateur != null) {
			response.sendRedirect("index");
		}
		else {
			response.sendRedirect("login");
		}
		//doGet(request, response);
	}

}
