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
	public List<IPLTeam> showTeamsByCities(List<String> cities) {
		return  teamRepo.findByCityIn(cities);
	}

	@Override
	public IPLTeam showTeamByName(String name) {
		
		return  teamRepo.findByName(name);
	}

	@Override
	public List<IPLTeam> showTeamsByOwnerOrCoach(String owner, String coach) {
		
		return teamRepo.findByOwnerOrCoach(owner, coach);
	}
	
	

	
}
