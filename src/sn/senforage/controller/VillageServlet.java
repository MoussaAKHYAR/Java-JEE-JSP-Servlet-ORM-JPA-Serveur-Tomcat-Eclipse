package sn.senforage.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sn.senforage.dao.IVillage;
import sn.senforage.dao.VillageImpl;
import sn.senforage.entities.Village;



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
			Village village = null;
			HttpSession session = request.getSession();
			int id = (int) session.getAttribute("id");
			villagedao.delete(id,village);
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
