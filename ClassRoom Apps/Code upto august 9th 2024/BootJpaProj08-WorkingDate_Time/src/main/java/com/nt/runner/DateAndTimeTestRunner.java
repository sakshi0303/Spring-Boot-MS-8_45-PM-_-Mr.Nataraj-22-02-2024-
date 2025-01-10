package com.nt.runner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Doctor;
import com.nt.repository.IDoctorRepository;
import com.nt.service.IDoctorMgmtService;

@Component
public class DateAndTimeTestRunner implements CommandLineRunner {
	@Autowired
	private IDoctorMgmtService  docService;

	@Override
	public void run(String... args) throws Exception {
		/*		//prepare Doctor object
				Doctor doc=new Doctor("raja1", "dental",LocalDateTime.of(1981,11,20,8,20,30), 
						                                                                        LocalTime.of(21, 10,30),
						                                                                        LocalDate.of(2011, 10, 20));
				String msg=docService.registerDoctor(doc);
				System.out.println(msg);
			*/
		
		 //  docService.showAllDoctors().forEach(System.out::println);
		
		      System.out.println("Doctor age::"+docService.getDoctorAgeById(100));
		      

	}

}
