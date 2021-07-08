package com.example.demo.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
import java.util.List;

//import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


import com.example.demo.Dao.MovieDao;
import com.example.demo.Dao.ProductionsDao;
import com.example.demo.Dao.bookdao;
import com.example.demo.Dao.housefulldao;
import com.example.demo.Dao.userdetailsdao;

import com.example.demo.model.Movie;
import com.example.demo.model.Productions;
import com.example.demo.model.book;
import com.example.demo.model.cost;
import com.example.demo.model.housefull;
import com.example.demo.model.prodmov;
import com.example.demo.model.userdetails;



@RestController
public class WelcomeController {
	
	@Autowired
	MovieDao md;
	@Autowired
	ProductionsDao pd;
	@Autowired
	userdetailsdao ud;
	@Autowired
	bookdao bd;
	@Autowired
	housefulldao hf;
	
	
	//starting part 
	@RequestMapping("/")
	public ModelAndView firstMethod() {
		return new ModelAndView("index");
	}

	/*
	 * @RequestMapping("register") public ModelAndView reg() { return new
	 * ModelAndView("newuserreg"); }
	 */
	//insert movie jsp
	@RequestMapping("/movie")
	public ModelAndView secondMethod()
	{
		return new ModelAndView("insertmovie");
	}
	
	//insert movie method 
	@RequestMapping(value="/insert" , method=RequestMethod.POST)
	public ModelAndView insertmovieMethod(HttpServletRequest request) {
		ModelAndView mv=null;
		int movieid=Integer.parseInt(request.getParameter("mid"));
		String mname =(request.getParameter("mname"));
		String hero =(request.getParameter("hname"));
		String heroine =(request.getParameter("hename"));
		String mdate =(request.getParameter("d"));
		System.out.println(mdate);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		 LocalDate localDate = LocalDate.parse(mdate, formatter);
		System.out.println(localDate);
		String lang =(request.getParameter("lang"));
		int length=Integer.parseInt(request.getParameter("len"));
		String type =(request.getParameter("type"));
		int pid=Integer.parseInt(request.getParameter("pid"));
		Movie m=new Movie(movieid,localDate,hero,heroine,lang,length,mname,pid,type);
		boolean b=md.insertmovie( m);
		if(b==false) {
			return mv= new ModelAndView("success");
		}
		else {
			return mv= new ModelAndView("error");
		}
	}
	
	
	//insert productionjsp
	@RequestMapping("/production")
	public ModelAndView sMethod()
	{
		return new ModelAndView("insertproduction");
	}
	
	
	//insert production method
	@RequestMapping(value="/insertp" , method=RequestMethod.POST)
	public ModelAndView insertproductionMethod(HttpServletRequest request) {
		ModelAndView mv=null;
		int n=Integer.parseInt(request.getParameter("pid"));
		String name =(request.getParameter("pname"));
		String add =(request.getParameter("add"));
		String year =(request.getParameter("year"));
		String owner =(request.getParameter("oname"));
		Productions p=new Productions(n,name,add,year,owner);
		boolean b=pd.insertProduction( p);
		if(b==false) {
			return mv= new ModelAndView("success");
		}
		else {
			return mv= new ModelAndView("error");
		}
	}
	
	
	//view all movies
	@RequestMapping("/viewmovies")
	public ModelAndView viewm(Model model) {
		ModelAndView mv=new ModelAndView("viewmovie");
		List<Movie> ml= md.getAllMovies();
		System.out.println(ml);
		model.addAttribute("movie",ml);
		return mv;
		
	}
	
	
	//view all production
	@RequestMapping("/viewproduction")
	public ModelAndView viewp(Model model) {
		ModelAndView mv=new ModelAndView("viewproduction");
		List<Productions> pl= pd.getAllProduction();
		System.out.println(pl);
		model.addAttribute("Productions",pl);
		return mv;
		
	}
	
	
	
	//edit movie 
	@RequestMapping("/editmovie")
	public ModelAndView editmovie(@RequestParam int id,Model model) {
		ModelAndView mv=new ModelAndView("editmovie");
		Movie m=md.getMovieById(id);
		model.addAttribute("movie",m);
		return mv;
		
	}
	
	//edit production
	@RequestMapping("/editproduction")
	public ModelAndView editproduction(@RequestParam int id,Model model) {
		ModelAndView mv=new ModelAndView("editproduction");
		Productions p=pd.getProductionById(id);
		model.addAttribute("Productions",p);
		return mv;
		
	}
	
	@RequestMapping("/editmovieid")
	public ModelAndView editm()
	{
		return new ModelAndView("editmoviebyid");
	}
	
	@RequestMapping(value="/editmoviebyid",method=RequestMethod.POST)
	public ModelAndView editmovieMethod(HttpServletRequest request, Model model)
	{
		int n=Integer.parseInt(request.getParameter("mid"));
		ModelAndView mv=new ModelAndView("editmovie");
		Movie m=md.getMovieById(n);
		model.addAttribute("movie",m);
		return mv;
	}
	
	@RequestMapping(value="/updatemovie",method=RequestMethod.POST)
	public ModelAndView updatemovieMethod(HttpServletRequest request) {
		ModelAndView mv=null;
		int movieid=Integer.parseInt(request.getParameter("mid"));
		String mname =(request.getParameter("mname"));
		String hero =(request.getParameter("hname"));
		String heroine =(request.getParameter("hename"));
		String mdate =(request.getParameter("d"));
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		 LocalDate localDate = LocalDate.parse(mdate, formatter);
		System.out.println(localDate);
		String lang =(request.getParameter("lang"));
		int length=Integer.parseInt(request.getParameter("len"));
		String type =(request.getParameter("type"));
		int pid=Integer.parseInt(request.getParameter("pid"));
		Movie m=new Movie(movieid,localDate,hero,heroine,lang,length,mname,pid,type);
		boolean b=md.updatemovie(m);
		if(b==false) {
			return mv= new ModelAndView("success");
		}
		else {
			return mv= new ModelAndView("error");
		}
	}
	
	
	
	@RequestMapping("/editproductionid")
	public ModelAndView editp()
	{
		return new ModelAndView("editproductionbyid");
	}
	
	@RequestMapping(value="/editproductionbyid",method=RequestMethod.POST)
	public ModelAndView editproductionMethod(HttpServletRequest request, Model model)
	{
		int n=Integer.parseInt(request.getParameter("pid"));
		ModelAndView mv=new ModelAndView("editproduction");
		Productions p=pd.getProductionById(n);
		model.addAttribute("production",p);
		return mv;
	}
	@RequestMapping(value="/updateproduction",method=RequestMethod.POST)
	public ModelAndView updateproductionMethod(HttpServletRequest request) {
		ModelAndView mv=null;
		int n=Integer.parseInt(request.getParameter("pid"));
		String name =(request.getParameter("pname"));
		String add =(request.getParameter("add"));
		String year =(request.getParameter("year"));
		String owner =(request.getParameter("oname"));
		Productions p=new Productions(n,name,add,year,owner);
		boolean b=pd.updateProduction( p);
		if(b==false) {
			return mv= new ModelAndView("success");
		}
		else {
			return mv= new ModelAndView("error");
		}
	}
	
	


	
	
	
	
	
	@RequestMapping("/searchmovie")
	public ModelAndView searchmovie() {
		ModelAndView mv=new ModelAndView("searchmovie");
		return mv;
	}
	
	@SuppressWarnings("null")
	@RequestMapping(value="/search2",method=RequestMethod.POST)
	public ModelAndView method(HttpServletRequest request,Model model) {
		ModelAndView mv=new ModelAndView("viewsearchmovie");
		
		String date =(request.getParameter("date"));
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		 LocalDate localDate = LocalDate.parse(date, formatter);
		List<Movie> ml=md.getAllMovies();
		
		List<Movie> ml2=new ArrayList<Movie>();
		for(Movie m:ml) {
			
			if(m.getDate().compareTo(localDate) > 0)
				ml2.add(m);
		}
		
		model.addAttribute("movie",ml2);
		return mv;
	}
	
	@RequestMapping("/viewmoviebydate")
	public ModelAndView searchmoviebydate() {
		ModelAndView mv=new ModelAndView("moviedate");
		return mv;
	}
	@SuppressWarnings("null")
	@RequestMapping(value="/search",method=RequestMethod.POST)
	public ModelAndView method2(HttpServletRequest request,Model model) {
		ModelAndView mv=new ModelAndView("viewsearchmovie");
		
		String lang =(request.getParameter("lang"));
		List<Movie> ml=md.getAllMovies();
		
		List<Movie> ml2=new ArrayList<Movie>();
		for(Movie m:ml) {
			
			if((m.getLang().equals(lang)))
				ml2.add(m);
		}
		
		model.addAttribute("movie",ml2);
		return mv;
	}
	
	
	@RequestMapping("/viewmoviebydandl")
	public ModelAndView searchmoviebydateandlang() {
		ModelAndView mv=new ModelAndView("viewmoviebylanganddate");
		return mv;
	}
	@SuppressWarnings("null")
	@RequestMapping(value="/search3",method=RequestMethod.POST)
	public ModelAndView methodviewbylanganddate(HttpServletRequest request,Model model) {
		ModelAndView mv=new ModelAndView("viewsearchmovie");
		String lang =(request.getParameter("lang"));
		String date =(request.getParameter("date"));
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		 LocalDate localDate = LocalDate.parse(date, formatter);
		List<Movie> ml=md.getAllMovies();
		
		List<Movie> ml2=new ArrayList<Movie>();
		for(Movie m:ml) {
			
			if((m.getDate().equals(localDate)) && (m.getLang().equals(lang)) )
				ml2.add(m);
		}
		
		model.addAttribute("movie",ml2);
		return mv;
	}
	
	
	
	
	@RequestMapping("/viewmovieandproduction")
	public ModelAndView viewmandp(Model model) {
		System.out.println("inside function");
		ModelAndView mv=new ModelAndView("viewmovieandproductions");
		List<Productions> pl= pd.getAllProduction();
		List<Movie> ml= md.getAllMovies();
		List<Movie> ml2=new ArrayList<Movie>();
		List<Productions> pl2=new ArrayList<Productions>();
		List<prodmov> lis=new ArrayList<prodmov>();
		for(Movie m:ml) {
			for(Productions p:pl) {
				
			if(m.getProdid()==p.getProductionid())
			{
				
				prodmov pm=new prodmov(m.getMovieid(),m.getMoviename(),m.getHero(),m.getHeroine(),p.getProductionid(),p.getProductionname());
				lis.add(pm);
				System.out.println(pm);
				
			}
			}
		}
		System.out.println(lis);
		
		
		model.addAttribute("prmo",lis);
		return mv;
		
	}
	
	
	
	
	@RequestMapping("/userreg")
	public ModelAndView user()
	{
		return new ModelAndView("userreg");
	}
	@RequestMapping(value = "/insertuser", method = RequestMethod.POST)
	public ModelAndView insertuserMethod(HttpServletRequest request) {
		ModelAndView mv = null;
		int uid=Integer.parseInt(request.getParameter("uid"));
		String uname = (request.getParameter("uname"));
		String pass = (request.getParameter("pass"));
		
		userdetails u=new userdetails(uid,uname,pass);
		boolean b=ud.insertuser(u);

		
		if (b == false) {
			return mv = new ModelAndView("newuser");
		} else {
			return mv = new ModelAndView("error");
		}
	}
	
	@RequestMapping("/loginuser")
	public ModelAndView userlogin()
	{
		return new ModelAndView("login");
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView logincheck(HttpServletRequest request) {
		ModelAndView mv = null;
		
		String uname = (request.getParameter("uname"));
		String pass = (request.getParameter("pass"));
		List<userdetails> ul= ud.getAlluser();
		
		for(userdetails u:ul) {
			if((u.getUsername().equals(uname)) && (u.getUserpassword().equals(pass))){
				return mv = new ModelAndView("bookmovie");
			}
			
		}

		
		
	
			return mv = new ModelAndView("wrong");
		}
	
	@RequestMapping("/booking")
	public ModelAndView bookings(Model model)
	{
		ModelAndView mv=new ModelAndView("bookingmovie");
		List<Movie> ml= md.getAllMovies();
		System.out.println(ml);
		model.addAttribute("movie",ml);
		return mv;
	}
	
	@RequestMapping("/book")
	public ModelAndView bookmovie(@RequestParam int id,Model model) {
		ModelAndView mv=new ModelAndView("book");
		Movie m=md.getMovieById(id);
		model.addAttribute("movie",m);
		return mv;
		
	}
	
	@RequestMapping(value = "/b", method = RequestMethod.POST)
	public ModelAndView bookticketmethod(HttpServletRequest request ,Model model) {
		System.out.println("enter");
		ModelAndView mv = new ModelAndView("ticketbooked");
		int mid = Integer.parseInt(request.getParameter("mid"));
		System.out.println("enter");
		System.out.println(mid);
		
		String mname = (request.getParameter("mname"));
		System.out.println(mname);
		int number = Integer.parseInt(request.getParameter("tno"));
		System.out.println(number);
		String cl = (request.getParameter("class"));
		System.out.println(cl);
		String date = (request.getParameter("date"));
		System.out.println(date);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate localDate = LocalDate.parse(date, formatter);
		String show = (request.getParameter("show"));
		System.out.println(show);
		book b = new book(mid, mname, number, cl, localDate, show);
		System.out.println(b);
		List<book> bl= bd.getAllbookedMovies();
		
		
		int totaltickets=0;
		int diff=0;
		
		for(book bo:bl) {
		            if(bo.getShow().equals(show) && (bo.getDate().compareTo(localDate)==0))
		            {
					totaltickets=bo.getTickets()+totaltickets;
					diff=totaltickets-500;
					if(totaltickets >= 500 ) {
						housefull h=new housefull(mid,mname,show,localDate);
						hf.inserthousefullmovie(h);
						return mv = new ModelAndView("housefull");
					}
				}
		}
			
		
		boolean bo = bd.insertbooking(b);
		List<cost> lis=new ArrayList<cost>();
		if (bo == false) {
			int totalprice=0;
			if(cl.equals("King")){
				totalprice=150*number;
				cost pm=new cost(totalprice);
				lis.add(pm);
			}
			else if(cl.equals("Queen")) {
				totalprice=250*number;
				cost pm=new cost(totalprice);
				lis.add(pm);
			}
			model.addAttribute("price",lis);
			return mv;
		} else {
			return mv = new ModelAndView("bookingerror");
		}
	
	}
	@RequestMapping("/housefull")
	public ModelAndView viewhousefull(Model model) {
		ModelAndView mv=new ModelAndView("housefullmovies");
		List<housefull> ml= hf.getAllMovies();
		System.out.println(ml);
		model.addAttribute("movie",ml);
		return mv;
		
	}
	
	
	
	}


