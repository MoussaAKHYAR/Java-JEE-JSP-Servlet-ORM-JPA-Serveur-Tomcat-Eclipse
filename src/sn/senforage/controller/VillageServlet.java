package sn.senforage.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.senforage.entities.Village;
import sn.senforage.model.IVillage;
import sn.senforage.model.VillageImpl;

/**
 * Servlet implementation class VillageServlet
 */
@WebServlet("/Village")
public class VillageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private IVillage villagedao;
  
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		villagedao = new VillageImpl();
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		List<Village> villages = villagedao.villages();
		request.setAttribute("villages", villages);
		request.getRequestDispatcher("/WEB-INF/view/village/add.jsp").forward(request, response);
		String path = request.getServletPath();
		if (path.equals("/supprimer")) {
			villagedao.delete(id);
			request.getRequestDispatcher("/WEB-INF/view/village/add.jsp").forward(request, response);

		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nomVillage = request.getParameter("nomVillage").toString();
		
		if (!(nomVillage.isEmpty())) {
			Village village = new Village();
			village.setNomVillage(nomVillage);
				
			villagedao.add(village);	
			doGet(request, response);
			
		}else {
			List<Village> villages = villagedao.villages();
			request.setAttribute("villages", villages);
			request.getRequestDispatcher("/WEB-INF/view/village/add.jsp").forward(request, response);
			
		}
		
		
		
	}

}
