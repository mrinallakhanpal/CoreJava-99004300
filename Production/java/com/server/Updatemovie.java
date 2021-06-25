package com.server;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.productiondao.MovieDao;

/**
 * Servlet implementation class Updatemovie
 */
@WebServlet("/Updatemovie")
public class Updatemovie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Updatemovie() {
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
		
		int mid=Integer.parseInt(request.getParameter("mid"));
		String mname=request.getParameter("mname");
		String mhname=request.getParameter("mhname");
		String mhername=request.getParameter("mhername");
		LocalDate dob=LocalDate.parse(request.getParameter("dob"));
		String lan=request.getParameter("lan");
		int len=Integer.parseInt(request.getParameter("len"));
		String mtype=request.getParameter("mtype");
		int pid=Integer.parseInt(request.getParameter("pid"));
		
		MovieDao md=new MovieDao();
		
		int check = 0;
		try {
			check = md.update(mid,mname,mhname,mhername,dob,lan,len,mtype,pid);
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
