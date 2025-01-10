package com.nt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.MarriageProfile;
import com.nt.repository.IMarriageProfileRepository;

@Service
public class MarriageProfileMgmtServiceImpl implements IMarriageProfileMgmtService {
	@Autowired
	private IMarriageProfileRepository  profileRepo;

	@Override
	public String registerMarriageProfile(MarriageProfile profile) {
		int idVal=profileRepo.save(profile).getPid();
		return "Marriage Profile is saved with the id Value :"+idVal;
	}
	
	@Override
	public Optional<MarriageProfile> showProfileById(int id) {
		// TODO Auto-generated method stub
		return profileRepo.findById(id);
	}

}
