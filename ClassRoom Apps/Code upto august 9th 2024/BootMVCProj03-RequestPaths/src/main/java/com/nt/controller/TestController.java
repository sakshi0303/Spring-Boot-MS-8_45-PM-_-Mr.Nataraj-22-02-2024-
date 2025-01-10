package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test-operations")
public class TestController {
	
	 //@RequestMapping(value="/report",method=RequestMethod.POST)
		//@PostMapping("/report")
		@GetMapping("/report")
		public   String  showReport1() {
			System.out.println("SeasonFinderController.showReport1()");
			
			return "show_result1";
		}
		

}
