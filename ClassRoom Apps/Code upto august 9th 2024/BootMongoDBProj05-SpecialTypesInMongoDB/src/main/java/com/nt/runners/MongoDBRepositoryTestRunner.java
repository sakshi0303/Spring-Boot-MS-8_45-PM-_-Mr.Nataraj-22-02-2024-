package com.nt.runners;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.PersonalInfo;
import com.nt.service.IPersonalInfoMgmtService;


@Component
public class MongoDBRepositoryTestRunner implements CommandLineRunner {
	@Autowired
	private IPersonalInfoMgmtService   personService;

	@Override
	public void run(String... args) throws Exception {
		    Properties qlfyProps=new Properties();
		    qlfyProps.put("BE", "OU"); qlfyProps.put("+2", "BIE"); qlfyProps.put("10th", "SBSE");
		    
		  PersonalInfo info=new PersonalInfo("raja", "hyd", new String[] {"red","green","blue"},
				                                                                 List.of("karan","shiva","rajani"),
				                                                                 Set.of(9999999L,8888888L,77777777L),
				                                                                 Map.of("aadhar",54353545,"voterId",54545555,"passportNo",454545455),
				                                                                 qlfyProps);
		     String msg=personService.registerPersonalInfo(info);
		     System.out.println(msg);

	}

}
