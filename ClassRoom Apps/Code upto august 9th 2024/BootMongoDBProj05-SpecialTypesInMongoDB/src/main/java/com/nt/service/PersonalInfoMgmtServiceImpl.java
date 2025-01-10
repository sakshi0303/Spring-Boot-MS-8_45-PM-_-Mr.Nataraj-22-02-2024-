package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.document.PersonalInfo;
import com.nt.repository.IPersonaInfoRepository;

@Service
public class PersonalInfoMgmtServiceImpl implements IPersonalInfoMgmtService {
	@Autowired
	private IPersonaInfoRepository  personalRepo;

	@Override
	public String registerPersonalInfo(PersonalInfo info) {
		String  idVal=personalRepo.save(info).getId();
		return  "PersonInfo Document is saved with the idValue:"+idVal;
	}

}
