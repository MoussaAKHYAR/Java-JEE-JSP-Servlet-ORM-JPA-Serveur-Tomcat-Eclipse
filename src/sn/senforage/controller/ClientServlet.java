package sn.senforage.controller;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sn.senforage.entities.Client;
import sn.senforage.entities.Village;
import sn.senforage.model.ClientImpl;
import sn.senforage.model.IClient;
import sn.senforage.model.IUser;
import sn.senforage.model.IVillage;
import sn.senforage.model.UserImpl;
import sn.senforage.model.VillageImpl;

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
		request.getRequestDispatcher("/WEB-INF/view/client/add.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nomDeFamille = request.getParameter("nomDefamille");
		String telephone = request.getParameter("telephone");
		String adresse = request.getParameter("adresse");
		String nomVillage = request.getParameter("village");
		Village village = villagedao.getVillageByName(nomVillage);
		HttpSession session = request.getSession();
	    int userId = (int) session.getAttribute("id");
	    Client client=new Client();
	       
	    client.setNomDeFamille(nomDeFamille);;
	    client.setTelephone(telephone);
	    client.setAdresse(adresse);
	    client.setVillage(village);
	    client.setUser(userdao.get(userId));
	    clientdao.add(client);
	    
		doGet(request, response);
	}

}
