package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.ScrollPosition.Direction;
import org.springframework.stereotype.Service;

import com.nt.document.IPLTeam;
import com.nt.repository.IIPLTeamRepository;

@Service("teamService")
public class IPLTeamMgmtServiceImpl implements IIPLTeamMgmtService {
	@Autowired
	private IIPLTeamRepository  teamRepo;

	@Override
	public String registerIPLTeam(IPLTeam team) {
		 // insert the doc
		   String idVal=teamRepo.insert(team).getId();
		return  "Document is saved with  the id Value:"+idVal;
	}
	
	@Override
	public String registerTeams(List<IPLTeam> teams) {
		      teamRepo.insert(teams);  //it is like saveAll(-)
		return teams.size()+" no.of docs are inserted";
	}
	
	@Override
	public List<IPLTeam> showAllTeams() {
		return teamRepo.findAll();
	}
	
	@Override
	public IPLTeam  showTeamById(String id) {
	     return  teamRepo.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid Team Id"));
	}
	
	@Override
	public List<IPLTeam> showAllTeamsBySorted(boolean ascOrder, String... props) {
		  Sort  sort=Sort.by(ascOrder?Sort.Direction.ASC:Sort.Direction.DESC, props);
		  List<IPLTeam> list=teamRepo.findAll(sort);
		return list;
	}

}
