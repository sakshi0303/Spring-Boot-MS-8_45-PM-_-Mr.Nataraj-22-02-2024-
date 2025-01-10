package com.nt.runners;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.DrivingLicense;
import com.nt.document.PersonDetails;
import com.nt.service.IDrivingLicenseMgmtService;

@Component
public class OneToOneAssociationTestRunner implements CommandLineRunner {
	@Autowired
	private IDrivingLicenseMgmtService  licenseService;

	@Override
	public void run(String... args) throws Exception {
		/*	//parent to child save object
			  //child object  
			DrivingLicense license=new DrivingLicense();
			  license.setType("2-wheeler"); license.setValidateFrom(LocalDateTime.now());
			  license.setValidTo(LocalDateTime.of(2054,10,20,12,10,20));
			  //parent obj
			  PersonDetails  details=new PersonDetails();
			  details.setAddrs("hyd"); details.setName("raja");
			  
			  //set child to parent
			    details.setLicenseDetails(license);
			    
			   //save object
			     String msg=licenseService.savePersonAndHisLicense(details);
			     System.out.println(msg);*/
		
		//child to parent save object
		  //child object  
		DrivingLicense license=new DrivingLicense();
		  license.setType("4-wheeler"); license.setValidateFrom(LocalDateTime.now());
		  license.setValidTo(LocalDateTime.of(2044,10,20,12,10,20));
		  //parent obj
		  PersonDetails  details=new PersonDetails();
		  details.setAddrs("vizag"); details.setName("mahesh");
		  
		  //set  parent to child
		    license.setDetails(details);
		    
		   //save object
		     String msg=licenseService.saveDrivingLicenseAndItsPersonInfo(license);
		     System.out.println(msg);
	
		  

	}

}
