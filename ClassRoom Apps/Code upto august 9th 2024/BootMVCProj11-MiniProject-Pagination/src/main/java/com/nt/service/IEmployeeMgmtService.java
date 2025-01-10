package com.nt.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.nt.entity.Employee;

public interface IEmployeeMgmtService {
    public   Iterable<Employee>  showAllEmployees();
    public   Page<Employee>  showAllEmployeesByPagination(Pageable  pageable);
    public   String    registerEmployee(Employee emp);
    public    Employee   findEmployeeByNo(int no);
    public   String    updateEmployee(Employee emp);
    public  String   removeEmployeeById(int id);
}
