package com.server;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.production.Production;
import com.productiondao.ProductionDao;


/**
 * Servlet implementation class Updateproduction
 */
@WebServlet("/Updateproduction")
public class Updateproduction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Updateproduction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		
		int no=Integer.parseInt(request.getParameter("pid"));
		String name=request.getParameter("pname");
		String address=request.getParameter("address");
		int dob=Integer.parseInt(request.getParameter("dob"));
		String oname=request.getParameter("oname");
		
		//1
		Production p=new Production(no, name, address, dob, oname);
		
		ProductionDao pd=new ProductionDao();
		int check = 0;
		try {
			//2
			//check = pd.update(no, name, address, dob, oname);
			check = pd.update(p);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher rd=null;
		if(check!=0)
		{
			rd=request.getRequestDispatcher("sucess.html");
			rd.forward(request, response);
		}
		else
		{
			rd=request.getRequestDispatcher("editproduction.jsp");
			rd.forward(request, response);
			System.out.println("Not updated");
		}
		
		
	}

}
