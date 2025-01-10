package com.nt.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.IPLTeam;
import com.nt.service.IIPLTeamMgmtService;

@Component
public class MongoRepositoryTestRunner implements CommandLineRunner {
	@Autowired
	private IIPLTeamMgmtService  teamService;

	@Override
	public void run(String... args) throws Exception {
			  
	   IPLTeam team=teamService.showTeamByName("CSK");
	     System.out.println(team==null?"Tean not found":"Team ::"+team);
	     System.out.println("--------------------------------------");
	   teamService.showTeamsByCities(List.of("hyd","chennai","blore")).forEach(System.out::println);
	     System.out.println("--------------------------------------");
	     teamService.showTeamsByOwnerOrCoach("srinivasan", "Vettori").forEach(System.out::println);
	   
		  
		  
		

	}

}
