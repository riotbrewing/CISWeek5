package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Cast;

/**
 * Servlet implementation class addCastServlet
 */
@WebServlet("/addCastServlet")
public class addCastServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addCastServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String characterName = request.getParameter("name");
		String characterRank = request.getParameter("rank");
		String actorName = request.getParameter("actor");
		
		Cast cast = new Cast(characterName, characterRank, actorName);
		CastHelper dao = new CastHelper();
		dao.addCast(cast);
		
		getServletContext().getRequestDispatcher("/index.html").forward(request, response);
	}

}
