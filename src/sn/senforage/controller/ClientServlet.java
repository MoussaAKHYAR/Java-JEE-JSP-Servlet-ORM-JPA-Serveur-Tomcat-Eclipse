package sn.senforage.controller;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sn.senforage.dao.ClientImpl;
import sn.senforage.dao.IClient;
import sn.senforage.dao.IUser;
import sn.senforage.dao.IVillage;
import sn.senforage.dao.UserImpl;
import sn.senforage.dao.VillageImpl;
import sn.senforage.entities.Client;


/**
 * Servlet implementation class ClientServlet
 */
@WebServlet("/Client")

public class ClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private IClient clientdao ;
	private IVillage villagedao;
	private IUser userdao;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		clientdao = new ClientImpl();
		villagedao = new VillageImpl();
		userdao = new UserImpl();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("villages", villagedao.villages());
		request.setAttribute("clients", clientdao.clients());
		request.setAttribute("users", userdao.users());
		request.getRequestDispatcher("/WEB-INF/view/client/add.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nomDeFamille = request.getParameter("nomDeFamille");
		String telephone = request.getParameter("telephone");
		String adresse = request.getParameter("adresse");
		
		//String nomVillage = request.getParameter("village");
		//Village village = villagedao.getVillageByName(nomVillage);
		
		HttpSession session = request.getSession();
	    int userId = (int) session.getAttribute("id");
	    Client client=new Client();
	       
	    client.setNomDeFamille(nomDeFamille);;
	    client.setTelephone(telephone);
	    client.setAdresse(adresse);
	    client.setVillage(villagedao.get(Integer.parseInt(request.getParameter("village"))));
	    client.setUser(userdao.get(userId));
	    clientdao.add(client);
	    
		doGet(request, response);
	}

}
