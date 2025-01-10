package com.nt.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.JobSeeker;
import com.nt.service.IJobSeekerMgmtService;

@Component
public class PL_SQLProcedureTestRunner implements CommandLineRunner {
	@Autowired
	private  IJobSeekerMgmtService  jsService;

	@Override
	public void run(String... args) throws Exception {
		List<JobSeeker> list=jsService.showJSDetailsByPercentage(40.0, 98.0);
		list.forEach(System.out::println);
		

	}

}
