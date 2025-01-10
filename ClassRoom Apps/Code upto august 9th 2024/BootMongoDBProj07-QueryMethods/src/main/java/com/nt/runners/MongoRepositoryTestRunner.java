package com.nt.runners;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.IPLTeam;
import com.nt.repository.IIPLTeamRepository;


@Component
public class MongoRepositoryTestRunner implements CommandLineRunner {
	@Autowired
	private  IIPLTeamRepository  teamRepo;
	@Override
	public void run(String... args) throws Exception {
		
		/*	Object[] obj=teamRepo.getTeamByCaptain("Rahul");
			System.out.println(obj==null?"Team not found":Arrays.toString(obj));*/
		
		/*List<Object[]> list=teamRepo.getTeamsByCities("hyd", "Blore", "chennai");
		list.forEach(row->{
			System.out.println(Arrays.toString(row));
		});
		
		*/
		  //teamRepo.getTeamsByBudget(20000000.0, 1000000000.0).forEach(System.out::println);
		    
		 teamRepo.getTeamsDataByNameChars("r").forEach(row->{
			 System.out.println(Arrays.toString(row));
		 });
		  

	}

}
