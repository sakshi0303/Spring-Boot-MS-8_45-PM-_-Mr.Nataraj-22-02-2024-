package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.Company;

public interface ICompanyRepository extends JpaRepository<Company, Integer> {
	
	//@Query("select c.cid,c.name,c.addrs,c.pinCode,j.jobId,j.roleName,j.minSalary,j.maxSalary,j.vacanciesCount  from Company c  inner join c.openings  j ")
	//@Query("select c.cid,c.name,c.addrs,c.pinCode,j.jobId,j.roleName,j.minSalary,j.maxSalary,j.vacanciesCount  from Company c  left join c.openings  j ")
	//@Query("select c.cid,c.name,c.addrs,c.pinCode,j.jobId,j.roleName,j.minSalary,j.maxSalary,j.vacanciesCount  from Company c  right join c.openings  j ")
	@Query("select c.cid,c.name,c.addrs,c.pinCode,j.jobId,j.roleName,j.minSalary,j.maxSalary,j.vacanciesCount  from Company c  full join c.openings  j ")

	public   List<Object[]>   getDataUisngParentToChildJoins();
	

}
