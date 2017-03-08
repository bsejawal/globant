package com.globant.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.globant.domains.Show;
import com.globant.services.ShowService;

@Controller
public class ShowController {

	@Autowired
	ShowService showService;
	
	
	@RequestMapping(value = "/show/getAll", method = RequestMethod.GET)
	public @ResponseBody List jsonResponse(){
		
		List<Show> jsonList = showService.getAll();
		return jsonList;
	}
	
	@RequestMapping(value = "/html", method = RequestMethod.GET)
	public String htmlResponse(){
		
		return "index.html";
	}
	
	@RequestMapping(value = "/show/add", method = RequestMethod.POST)
	public String addEvent(@ModelAttribute Show show){
		System.out.println("Addddddd");
		showService.addEvent(show);
		
		return "redirect:/html";
	}
}
