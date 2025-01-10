package com.nt.runners;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.ICompanyMgmtService;


@Component
public class AssociationMappingTestRunner implements CommandLineRunner {
	@Autowired
	private  ICompanyMgmtService  compService;

	@Override
	public void run(String... args) throws Exception {
		
		/*List<Object[]>list=	compService.showParentToChildJoinsData();
		list.forEach(row->{
			System.out.println(Arrays.toString(row));
		});*/
		  
		List<Object[]>  list=compService.showChildToParentJoinsData();
		list.forEach(row->{
			System.out.println(Arrays.toString(row));
		});
		
	}


}
