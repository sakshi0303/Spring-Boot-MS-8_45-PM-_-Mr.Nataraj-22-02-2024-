package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.Doctor;

public interface IDoctorRepository extends JpaRepository<Doctor, Integer> {
	
	//@Query(value="select datediff(now(),dob)/365.25	  from doctor where did=:id",nativeQuery=true)
	@Query(value="select    ( sysdate-trunc(dob))/365.25   from doctor where did=:id",nativeQuery=true)
	public  double  showDoctorAgeById(int id);

}
