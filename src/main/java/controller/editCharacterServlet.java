package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Cast;

/**
 * Servlet implementation class editCharacterServlet
 */
@WebServlet("/editCharacterServlet")
public class editCharacterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public editCharacterServlet() {
        super();
        // TODO Auto-generated constructor stub
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
		CastHelper dao = new CastHelper();
		
		String name = request.getParameter("name");
		String rank = request.getParameter("rank");
		String actor = request.getParameter("actor");
		
		Integer holdID = Integer.parseInt(request.getParameter("id"));
		
		Cast cast = dao.searchById(holdID);
		
		cast.setCharacter(name);
		cast.setRank(rank);
		cast.setActor(actor);
		
		dao.update(cast);
		getServletContext().getRequestDispatcher("/viewCastServlet").forward(request, response);
	}

}
