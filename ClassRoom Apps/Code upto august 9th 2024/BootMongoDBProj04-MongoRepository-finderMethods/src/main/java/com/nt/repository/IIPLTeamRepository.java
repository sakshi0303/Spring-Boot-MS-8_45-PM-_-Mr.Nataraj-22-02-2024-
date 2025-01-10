package com.nt.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nt.document.IPLTeam;

public interface IIPLTeamRepository extends MongoRepository<IPLTeam, String> {
	
	public List<IPLTeam>  findByCityIn(List<String> cities);
	public  IPLTeam   findByName(String name);
	public List<IPLTeam>findByOwnerOrCoach(String owner,String coach);
	

}
