package com.nt.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.JobSeeker;
import com.nt.repository.IJobSeekerRepository;


@Component
public class QueryMethodTestRunner implements CommandLineRunner {
	@Autowired
	private IJobSeekerRepository jsRepo;

	@Override
	public void run(String... args) throws Exception {
		
		/*  List<JobSeeker> list=jsRepo.showAllJobSeekers();
		  list.forEach(js->{
			  System.out.println(js);
		  });*/
		  //jsRepo.showAllJobSeekersByPercentageRange(45.0, 78.9).forEach(System.out::println);
		
		 // List<Object[]> list=jsRepo.showJobSeekerDataByQualifications("B.E", "B.sc", "B.tech");
	/*	  list.forEach(row->{
			  for(Object val:row) {
				  System.out.print(val+"  ");
			  }
			  System.out.println();
		  }); */
		  
	/*list.forEach(row->{
	   System.out.println(Arrays.toString(row));
	});
	*/
		
	/* List<Long> list=jsRepo.showJobSeekersMobileNumbersByNameStartChars("m%");
	  list.forEach(System.out::println);*/
		
	/*System.out.println(" Job Seeker details ::"+jsRepo.getJobSeekerByMobileNo(88888811L));
	System.out.println("----------------------");
	System.out.println(" Job Seeker details::");
	  Object details[]=(Object[])jsRepo.getJobSeekerDataByMobileNo(88888811L);
	  System.out.println(Arrays.toString(details));
		System.out.println("----------------------");
		String jsName=jsRepo.getJobSeekerNameByMobileNo(88888811L);
		System.out.println(jsName);*/
		
		
	/*System.out.println("JobSeekers count::"+jsRepo.showJobSkeersCount());
	
	System.out.println("------------------");
	 Object[] details=(Object[])jsRepo.showJobSeekerAggregateResults();
	 System.out.println(" aggregate results ::"+Arrays.toString(details));
	 System.out.println("count::"+details[0]+"  max avg:"+details[1]+" min avg:"+details[2]+" sum avg:"+details[3]+"..."+"avg of avg::"+details[4]);
	 */
	
		
	/*int count=jsRepo.modifyPercentageByQualification("B.E", 5.0);
	System.out.println("no.of JobSeekers that are effected:: "+count);*/
		
	//	System.out.println("no.of records that are deleted::"+jsRepo.removeJobSeekersWithNoQualificationAndMobileNumber());
		
		System.out.println("Sys date::"+jsRepo.showSysDate()); 
		
		
		
		
		
		
		
		
	   
			  
		}

}
