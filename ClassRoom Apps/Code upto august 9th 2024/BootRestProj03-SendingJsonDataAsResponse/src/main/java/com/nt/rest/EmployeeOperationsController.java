//EmployeeOperationsController.java
package com.nt.rest;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.Employee;
import com.nt.entity.JobDetails;

@RequestMapping("/employee-api")
@RestController
public class EmployeeOperationsController {

	@GetMapping("/report1")
	 public  ResponseEntity<Employee>  showReport1(){
		 System.out.println("EmployeeOperationsController.showReport1()");
		 Employee  emp=new Employee();
		 emp.setEno(1001); emp.setEname("Raja"); emp.setSalary(90000.0f);
		 return new ResponseEntity<Employee>(emp,HttpStatus.OK);
	 }
	
	
	@GetMapping("/report2")
	 public  ResponseEntity<Employee>  showReport2(){
		 System.out.println("EmployeeOperationsController.showReport2()");
		 Employee  emp=new Employee();
		 emp.setEno(1001); emp.setEname("Rajesh"); emp.setSalary(90000.0f);
		 emp.setFavColors(new String[] {"red","green","blue"});
		 emp.setNickNames(List.of("raja","king","chinna","munna"));
		 emp.setPhoneNumbers(Set.of(999999L,8888888L,77777777L));
		 emp.setIdDetails(Map.of("aadhar",45545L,"voterid",45455,"panNo",45455));
		 JobDetails details=new JobDetails("MANAGER","HCL",101);
		 emp.setJobInfo(details);
		 return new ResponseEntity<Employee>(emp,HttpStatus.OK);
	 }
	
	@GetMapping("/report3")
	 public  ResponseEntity<List<Employee>>  showReport3(){
		 System.out.println("EmployeeOperationsController.showReport3()");
		 Employee  emp1=new Employee(1001,"raja","hyd",9100.0f);
		 Employee  emp2=new Employee(1002,"rajesh","delhi",9200.0f);
		 Employee  emp3=new Employee(1003,"sunil","vizag",9000.0f);
		 List<Employee> empsList=List.of(emp1,emp2,emp3);
		 return new ResponseEntity<List<Employee>>(empsList,HttpStatus.OK);
	 }
	
	
}
