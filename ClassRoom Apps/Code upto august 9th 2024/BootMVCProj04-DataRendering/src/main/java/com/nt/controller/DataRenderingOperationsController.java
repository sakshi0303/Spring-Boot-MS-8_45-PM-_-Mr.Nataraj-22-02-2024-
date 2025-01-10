package com.nt.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.nt.model.Customer;

@Controller
public class DataRenderingOperationsController {
	/*@GetMapping("/data")
	public   String  sendData(Map<String,Object> map) {
		//simple values as the model attributes
		 map.put("name","raja");
		 map.put("age", 30);
		 //return LVN
		 return "show_data";
		
	}*/
	
	/*	@GetMapping("/data")
		public   String  sendData(Map<String,Object> map) {
			//arrays  and collections  as the model attribute
			  map.put("favColors", new String[] {"red","blue","yellow"});
			  map.put("friends", List.of("srinivas","ramesh","srinath","karan"));
			  map.put("phoneNumbers",Set.of(9999999,8888888,77777777));
			  map.put("idDetails", Map.of("aadhar",5454545,"voterid",454455,"panNo",454545));
			  
			 //return LVN
			 return "show_data";
			
		}*/
	
	/*	@GetMapping("/data")
		public   String  sendData(Map<String,Object> map) {
			//Model class obj  as the model attribute
			 Customer cust=new Customer(1001, "raja", "hyd", 9000.0f);
			 
			 map.put("custData", cust);
			
			  
			 //return LVN
			 return "show_data";
			
		}*/
	
	
		@GetMapping("/data")
		public   String  sendData(Map<String,Object> map) {
			//Passing Collection of Model class objs  as the model attribute
			 Customer cust1	=new Customer(1001, "raja1", "hyd1", 9000.0f);
			 Customer cust2	=new Customer(1002, "raja1", "vizag", 8000.0f);
			 Customer cust3	=new Customer(1003, "suresh", "hyd", 7000.0f);
			 
			 map.put("custData", List.of(cust1,cust2,cust3));
			
			  
			 //return LVN
			 return "show_data";
			
		}
	
	
	
	
	
	
	
	
	
	

}
