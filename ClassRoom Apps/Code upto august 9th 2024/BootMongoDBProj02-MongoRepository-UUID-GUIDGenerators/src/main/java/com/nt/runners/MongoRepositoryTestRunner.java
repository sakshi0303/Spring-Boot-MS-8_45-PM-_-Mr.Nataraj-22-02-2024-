package com.nt.runners;

import java.util.List;
import java.util.UUID;

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
		/*	//create  Document class obj
			  IPLTeam team=new IPLTeam();
			  team.setId(UUID.randomUUID().toString());
			  team.setName("RCB");
			  //team.setOwner("Vijay M");
			  team.setCity("Blore");
			  //team.setCaptain("Faf Duplesis");
			  String  msg=teamService.registerIPLTeam(team);
			  System.out.println(msg);*/
		
		  IPLTeam team1=new IPLTeam();
		  team1.setId(UUID.randomUUID().toString());
		  team1.setName("SRH");
		  team1.setOwner("kavya");
		  team1.setCity("hyd");
		  team1.setCaptain("pat cummins");
		  team1.setCoach("muralidharan");
		  
		  IPLTeam team2=new IPLTeam();
		  team2.setId(UUID.randomUUID().toString());
		  team2.setName("CSK");
		  team2.setOwner("srinivasan");
		  team2.setCity("chennai");
		  team2.setCaptain("RituRaj");
		  team1.setCoach("d. Vettori");
		  
		  String msg=teamService.registerTeams(List.of(team1,team2));
		  System.out.println(msg);
		
		
	
		  
		  
		  
		

	}

}
