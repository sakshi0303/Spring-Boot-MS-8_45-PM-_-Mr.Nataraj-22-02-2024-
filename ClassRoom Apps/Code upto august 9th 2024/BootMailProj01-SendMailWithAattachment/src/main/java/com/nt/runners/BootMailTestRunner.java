package com.nt.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.IPurchaseOrderMgmtService;


@Component
public class BootMailTestRunner implements CommandLineRunner {
	@Autowired
	private  IPurchaseOrderMgmtService  service;

	@Override
	public void run(String... args) throws Exception {
	     String msg=service.purchase(new String[] {"shirt","trouser","hat"}, new double[] {5000.0,6000.0,2000.0}, 
	    		                                                  new String[] {"nataraz@gmail.com","samarpratap9708@gmail.com","dadavali2002@gmail.com","laviverma299@gmail.com",
	    		                                                		 "skmahajan265@gmail.com", "gauravkelode3107@gmail.com"}); 
	     System.out.println(msg);

	}

}
