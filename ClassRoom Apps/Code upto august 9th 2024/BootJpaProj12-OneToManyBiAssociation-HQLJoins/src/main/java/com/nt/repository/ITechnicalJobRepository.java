package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.TechnicalJob;

public interface ITechnicalJobRepository extends JpaRepository<TechnicalJob, Integer> {

	//@Query("select j.jobId,j.roleName,j.minSalary,j.maxSalary,j.vacanciesCount,c.cid,c.name,c.addrs,c.pinCode  from TechnicalJob j  inner join j.company  c ")
	@Query("select j.jobId,j.roleName,j.minSalary,j.maxSalary,j.vacanciesCount,c.cid,c.name,c.addrs,c.pinCode  from TechnicalJob j  full join j.company  c ")
	
	public  List<Object[]>  getDataUsingChildToParentJoins();
}
