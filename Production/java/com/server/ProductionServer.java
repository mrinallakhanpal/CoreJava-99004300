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
 * Servlet implementation class ProductionServer
 */
@WebServlet("/ProductionServer")
public class ProductionServer extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ProductionServer() {
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
		int pid=Integer.parseInt(request.getParameter("pid"));
		String pname=request.getParameter("pname");
		String paddress=request.getParameter("paddress");
		int pdate=Integer.parseInt(request.getParameter("pdate"));
		String poname=request.getParameter("poname");
		
		boolean b=false;
		
		Production p=new Production(pid,pname,paddress,pdate,poname);
		ProductionDao pd=new ProductionDao();
		try {
			System.out.println("aaa");
			b=pd.Insertproduction(p);
			System.out.println("bbb");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		RequestDispatcher rd=null;
		if(b==false)
		{
			rd=request.getRequestDispatcher("sucess.html");
			rd.forward(request, response);
		}
		else
		{
			rd=request.getRequestDispatcher("insertproduction.html");
			rd.forward(request, response);
			//System.out.println("Some Error");
		}
		
	}

}
