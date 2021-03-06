package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ArcadeInventory;

/**
 * Servlet implementation class AddItemServlet
 */
@WebServlet("/addItemServlet")
public class AddItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddItemServlet() {
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

		
		String title = request.getParameter("title");		
		double costPerPlay = Double.parseDouble(request.getParameter("costPerPlay"));
		double purchasePrice = Double.parseDouble(request.getParameter("purchasePrice"));
		
		ArcadeInventory ai = new ArcadeInventory(title, costPerPlay, purchasePrice);
		ArcadeInventoryHelper aih = new ArcadeInventoryHelper();
		aih.insertArcade(ai);
		
		getServletContext().getRequestDispatcher("/index.html").forward(request, response);
	}

}
