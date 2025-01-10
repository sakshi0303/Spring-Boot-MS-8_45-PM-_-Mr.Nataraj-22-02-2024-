package com.nt.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer-api")
public class CustomerOperationsRestController {

	
	@GetMapping("/report")
	public  ResponseEntity<String>  showReport(){
		System.out.println("CustomerOperationsRestController.showReport()");
		return  new ResponseEntity<String>("Reporting Customer Data", HttpStatus.OK);
	}
	
	@PostMapping("/save")
	public  ResponseEntity<String>  registerCustomer(){
		System.out.println("CustomerOperationsRestController.registerCustomer()");
		return new ResponseEntity<String>("Saving the Customer", HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public  ResponseEntity<String>  updateCustomer(){
		System.out.println("CustomerOperationsRestController.updateCustomer()");
		return new ResponseEntity<String>("Updating the Customer Info", HttpStatus.OK);
	}
	
	
	@PatchMapping("/pupdate")
	public  ResponseEntity<String>  updateCustomerMobileNo(){
		System.out.println("CustomerOperationsRestController.updateCustomerMobileNo()");
		return new ResponseEntity<String>("Updating the Partial  Customer Info", HttpStatus.OK);
	}
	
	@DeleteMapping("/remove")
	public  ResponseEntity<String> deleteCustomer(){
		System.out.println("CustomerOperationsRestController.deleteCustomer()");
		return new  ResponseEntity<String>("Customer Delete operation",HttpStatus.OK);
		
	}
	
	
	
	
	
}
