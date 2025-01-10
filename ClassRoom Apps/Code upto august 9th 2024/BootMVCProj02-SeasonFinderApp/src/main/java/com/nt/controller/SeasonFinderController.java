package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.service.ISeasonFinderService;

@Controller
public class SeasonFinderController {
	@Autowired
	private ISeasonFinderService  seasonService;
	
	@RequestMapping("/")
	public  String showHomePage() {
		//return LVN
		return "welcome";
	}
	
	
	@RequestMapping("/season")
	public  String  showSeason(Map<String,Object> map) {
		//use  service
		String  seasonName=seasonService.findSeason();
		//keep the results in Model attribute
		map.put("season", seasonName);
		//return LVN
		return "display";
	}

}
