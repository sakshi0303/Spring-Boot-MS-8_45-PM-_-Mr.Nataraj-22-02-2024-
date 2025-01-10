package com.nt.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping
public class StudentOperationsController {
	
	
	/*	@GetMapping("/data")
		public   String   process(@RequestParam("sno") int no, @RequestParam("sname") String name) {
			System.out.println("sno="+no+"........."+"sname="+name);
			
			return "welcome";
		}*/
	
	/*@GetMapping("/data")
	public   String   process(@RequestParam int sno, @RequestParam(required = false) String sname) {
		System.out.println("sno="+sno+"........."+"sname="+sname);
		
		return "welcome";
	}*/
	
	/*	@GetMapping("/data")
		public   String   process(@RequestParam(defaultValue = "3001") int sno, @RequestParam(defaultValue = "kalki") String sname) {
			System.out.println("sno="+sno+"........."+"sname="+sname);
			
			return "welcome";
		}*/
	
	/*@GetMapping("/data")
	public   String   process(@RequestParam(required = false) Integer sno, @RequestParam(defaultValue = "kalki") String sname) {
		System.out.println("sno="+sno+"........."+"sname="+sname);
		
		return "welcome";
	}*/
	
	/*	@GetMapping("/data")
		public   String   process(@RequestParam Integer sno, @RequestParam String sname,
				                                      @RequestParam String [] sadd,@RequestParam(name="sadd") List<String> listAddrs,
				                                      @RequestParam(name="sadd") Set<String> setAddrs) {
			System.out.println("sno="+sno+"........."+"sname="+sname+"....."+Arrays.toString(sadd)+"....."+listAddrs+"......"+setAddrs);
			
			return "welcome";
		}
	*/
	
	@GetMapping("/data")
	public   String   process(@RequestParam Integer sno, @RequestParam String sname,@RequestParam String sadd) {
		System.out.println("sno="+sno+"........."+"sname="+"....."+sadd);
		
		return "welcome";  // LVN
	}
	
	
	
}
