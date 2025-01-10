package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.service.ISeasonFinderService;

@Controller
@RequestMapping("/weather-report")
public class SeasonFinderController {
	@Autowired
	private ISeasonFinderService  seasonService;
	
	//@RequestMapping("/")
	@RequestMapping
	public  String showHomePage() {
		System.out.println("SeasonFinderController.showHomePage()");
		
		//return LVN
		return "welcome";
	}
	
	
	@RequestMapping("/season")  //default is GET mode
	public  String  showSeason(Map<String,Object> map) {
		//use  service
		String  seasonName=seasonService.findSeason();
		//keep the results in Model attribute
		map.put("season", seasonName);
		//return LVN
		return "display";
	}
	
	//@RequestMapping(value="/report",method=RequestMethod.GET)
	@GetMapping("/report")
	public   String  showReport() {
		System.out.println("SeasonFinderController.showReport()");
		
		return "show_result";
	}
	
   

}
