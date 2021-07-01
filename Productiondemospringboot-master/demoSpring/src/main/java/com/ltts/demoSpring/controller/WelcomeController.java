package com.ltts.demoSpring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ltts.demoSpring.Dao.ProductionDao;
import com.ltts.demoSpring.model.Production;


@Controller
public class WelcomeController {
	
	
	@Autowired
	ProductionDao md;
	@RequestMapping("/")
	public ModelAndView firstMethod() {
		return new ModelAndView("index");
	}
	
	
	
	
	@RequestMapping("/production")
	public ModelAndView movieMethod()
	{
		return new ModelAndView("addproduction");
	}
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	public ModelAndView movieInsertMethod(HttpServletRequest request) {
		int production_id=Integer.parseInt(request.getParameter("mname"));
		String productionname=request.getParameter("cast1");
		String address=request.getParameter("mtype1");
		int year=Integer.parseInt(request.getParameter("mdate"));
		String ownername = request.getParameter("oname");
		
		Production m=new Production(production_id,productionname,address,year,ownername);
		boolean b=md.insertdata(m);
		if(b==false)
		{
			return new ModelAndView("success");
		}
		return new ModelAndView("error");
	
	
	}
	
	@RequestMapping("/viewdetails")
	public ModelAndView viewProduction(Model model) {
		
 	ModelAndView mv=new ModelAndView("viewdetails");
		
		List<Production> li =(List<Production>) md.findAll();
		
		
		model.addAttribute("list", li);
		return mv;
	}

}
