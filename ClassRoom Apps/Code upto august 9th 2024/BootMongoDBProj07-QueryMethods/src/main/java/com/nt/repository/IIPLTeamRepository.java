package com.nt.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.nt.document.IPLTeam;

public interface IIPLTeamRepository extends MongoRepository<IPLTeam, String> {
	
	@Query(value="{captain:?0 }",fields="{id:0,name:1,city:1,captain:1}")
	public  Object[]  getTeamByCaptain(String cap1);

	@Query(value="{$or:[{city:?0},{city:?1},{city:?2}]}",fields="{id:0,name:1,city:1,captain:1}")
	public  List<Object[]>  getTeamsByCities(String city1,String city2,String city3);
	
	@Query(value="{budget:{ $gte:?0}, budget:{$lte:?1}}",fields="{ }")
	public  List<IPLTeam>   getTeamsByBudget(double start, double end);
	
	@Query(value="{name:{'$regex':?0, '$options':'i'}}",fields="{id:0,name:1,city:1,captain:1,owner:1,coach:1}")
	//@Query(value="{name:{'$regex':?0}}",fields="{id:0,name:1,city:1,captain:1,owner:1,coach:1}")
	public  List<Object[]>  getTeamsDataByNameChars(String chars);
	

}
