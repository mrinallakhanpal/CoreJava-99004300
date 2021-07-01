package com.example.Movie.Controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.Movie.Dao.TicketDao;
import com.example.Movie.Ticket.Ticket;

@RestController
public class MovieController {
	
	@Autowired
	TicketDao td;
	
	
	@RequestMapping("/")
	public ModelAndView firstMethod() {
		return new ModelAndView("index");
	}
	@RequestMapping("/bookticket")
	public ModelAndView secondMethod()
	{
		return new ModelAndView("book");
	}
	
	
	@RequestMapping(value="/insertticket", method=RequestMethod.POST)
	public ModelAndView movieInsertMethod(HttpServletRequest request) {
		String moviename=request.getParameter("bmname");
		String bookdate=request.getParameter("bdate");
		String booktype=request.getParameter("btype");
		String showdate=request.getParameter("sdate");
		String shows=request.getParameter("bshows");
		int noticket=Integer.parseInt(request.getParameter("noticket"));
		
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		//  String date = "16/08/2016";

		LocalDate bookdate1 = LocalDate.parse(bookdate, formatter);
		LocalDate showdate1 = LocalDate.parse(showdate, formatter);
		
		
		
		Ticket m=new Ticket(moviename,booktype,bookdate1,showdate1,noticket,shows);
		boolean b=td.insertdata(m);
		if(b==false)
		{
			return new ModelAndView("success");
		}
		return new ModelAndView("error");
	}
	
	@RequestMapping("/viewdetails")
	public ModelAndView viewAllPlayers(Model model) {
		ModelAndView mv=new ModelAndView("viewdetails");
		List<Ticket> li=td.getAllPlayers();
		
		model.addAttribute("list", li);
		return mv;
	}
}
