package com.nt.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.nt.entity.Employee;
@Component
public class EmployeeValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		System.out.println("EmployeeValidator.supports()");
		return clazz.isAssignableFrom(Employee.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		System.out.println("EmployeeValidator.validate()");
		//type cast with Model class obj
		Employee  emp=(Employee)target;
		if(emp.getEname()==null || emp.getEname().equals("") || emp.getEname().length()==0) //required rule
			errors.rejectValue("ename", "emp.ename.required");
		else if (emp.getEname().length()<3  || emp.getEname().length()>10)  //min length rule
		    errors.rejectValue("ename", "emp.ename.length");	
		
		if(emp.getJob()==null || emp.getJob().equals("") || emp.getJob().length()==0) //required rule
			errors.rejectValue("job", "emp.job.required");
		else if (emp.getJob().length()<3  || emp.getJob().length()>10)  //min length rule
		    errors.rejectValue("job", "emp.job.length");
		
		if(emp.getSal()==null ) //required rule
			errors.rejectValue("sal", "emp.sal.required");
		else if (emp.getSal()<1000  || emp.getSal()>100000)  // range rule
		    errors.rejectValue("sal", "emp.sal.range");
		
		if(emp.getDeptno()==null ) //required rule
			errors.rejectValue("deptno", "emp.deptno.required");
		else if (emp.getDeptno()<10  || emp.getDeptno()>90)  // range rule
		    errors.rejectValue("deptno", "emp.deptno.range");
	
	}
	

}
