package com.nt.runner;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.JobSeeker;
import com.nt.service.IJobSeekerMgmtService;

@Component
public class JpaRepositoryRunner implements CommandLineRunner {
	@Autowired
	private IJobSeekerMgmtService jsService;

	@Override
	public void run(String... args) throws Exception {
		
		// System.out.println(jsService.removeJobSeekersByIds(List.of(1007,1008,1122,1133,1144)));		
		
		/*  JobSeeker  js=new JobSeeker();
		  js.setJsName("mahesh");
		  js.setQlfy("B.E");
		  //js.setPercentage(56.78);
		  jsService.searchJobSeekersByExampleData(js, false, "mobileNo").forEach(System.out::println);*/
		
		   //Optional<JobSeeker> opt=jsService.getJSById(1010);
			/*  if(opt.isPresent()) {
			   System.out.println("record::"+opt.get());
			  }
			  else {
			    System.out.println("Record not found");
			  }*/
		   
			/*    JobSeeker  js=jsService.findJsById(1007);
			    System.out.println("class name::"+js.getClass());
			    System.out.println("-------------");
			    System.out.println(" id  value ::"+js.getJsId());
			    System.out.println("------------------------");
			    System.out.println("name::"+js.getJsName());
			    System.out.println("++++++++++++++++");
			    System.out.println("name::"+js.getQlfy());*/
		
		try {
			JobSeeker  js=jsService.findJsById(1010);
			System.out.println("record is ::"+js.toString());
		}
		catch(Exception e) {
			System.out.println("record found");
		}
		    
		    
		   
		  
		}

}
