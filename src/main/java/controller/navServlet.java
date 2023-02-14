package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Cast;

/**
 * Servlet implementation class navServlet
 */
@SuppressWarnings("unused")
@WebServlet("/navServlet")
public class navServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public navServlet() {
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
		
		CastHelper dao = new CastHelper();
		String action = request.getParameter("changeCharacter");
		
		String path = "/viewCastServlet";
		
		if(action.equals("delete"))
		{
			try
			{
				Integer holdID = Integer.parseInt(request.getParameter("id"));
				dao.delete(holdID);
			}
			catch (NumberFormatException e)
			{
				System.out.println("No input");
			}
		}
		else if (action.equals("edit"))
		{
			try
			{
				Integer holdID = Integer.parseInt(request.getParameter("id"));
				Cast editItem = dao.searchById(holdID);
				request.setAttribute("changeCharacter", editItem);
				path = "/edit-character.jsp";
				
			}
			catch (NumberFormatException e)
			{
				System.out.println("No input");
			}
		}
		else if (action.equals("add"))
		{
			path = "/index";
		}
		
		getServletContext().getRequestDispatcher(path).forward(request, response);
	}

}
