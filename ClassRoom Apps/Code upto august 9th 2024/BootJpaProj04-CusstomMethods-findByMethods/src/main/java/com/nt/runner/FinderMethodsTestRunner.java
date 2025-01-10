package com.nt.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.JobSeeker;
import com.nt.repository.IJobSeekerRepository;


@Component
public class FinderMethodsTestRunner implements CommandLineRunner {
	@Autowired
	private IJobSeekerRepository jsRepo;

	@Override
	public void run(String... args) throws Exception {
		
		/*List<JobSeeker> list=jsRepo.findByJsNameEquals("mahesh");
		list.forEach(System.out::println);
		*/
		/*   jsRepo.readByJsName("mahesh").forEach(System.out::println);
		   System.out.println("----------------------");
		   jsRepo.getByJsNameIs("mahesh").forEach(System.out::println);*/
		
		  // jsRepo.findByPercentageBetween(45.0, 89.0).forEach(System.out::println);
		
		  //jsRepo.findByJsNameStartingWith("M").forEach(System.out::println);
		   // jsRepo.findByJsNameEndingWithIgnoreCase("H").forEach(System.out::println);
		    //jsRepo.findByJsNameContainingIgnoreCase("ah").forEach(System.out::println);
		    
			/*    jsRepo.findByJsNameLikeIgnoreCase("m%").forEach(System.out::println);
			    System.out.println("_____________________");
			    jsRepo.findByJsNameLikeIgnoreCase("%h").forEach(System.out::println);
			    System.out.println("_____________________");
			    jsRepo.findByJsNameLikeIgnoreCase("%sh").forEach(System.out::println);*/
		
		    //  jsRepo.findByQlfyIn(List.of("B.E","B.Sc")).forEach(System.out::println);
		          //jsRepo.readByMobileNoIsNull().forEach(System.out::println);
		   jsRepo.findByQlfyInOrderByQlfyAsc(List.of("B.E","B.sc","B.Tech")).forEach(System.out::println);
		      
		    
			    
		    
		  
		
		  
		}

}
