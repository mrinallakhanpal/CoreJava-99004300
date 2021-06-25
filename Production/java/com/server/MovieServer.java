package com.server;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.production.Movie;
import com.productiondao.MovieDao;

/**
 * Servlet implementation class MovieServer
 */
@WebServlet("/MovieServer")
public class MovieServer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MovieServer() {
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
		
		String date=request.getParameter("mdate");
		
		LocalDate mdate=LocalDate.parse(date);
		
		String mlan=request.getParameter("mlan");
		int mlen=Integer.parseInt(request.getParameter("mlen"));
		String mtype=request.getParameter("mtype");
		int mpid=Integer.parseInt(request.getParameter("mpid"));
		
		Movie m=new Movie(mid,mname,mhname,mhername,mdate,mlan,mlen,mtype,mpid);
		
		MovieDao md=new MovieDao();
		boolean b=true;
		try {
			b=md.InsertMovie(m);
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
			rd=request.getRequestDispatcher("insertmovie.html");
			rd.forward(request, response);
			//System.out.println("Some Error");
		}
	}

}
