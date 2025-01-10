package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.document.DrivingLicense;
import com.nt.document.PersonDetails;
import com.nt.repository.IDrivingLicenseRepository;
import com.nt.repository.IPersonDetailsRepository;

@Service
public class DrivingLicenseMgmtServiceImpl implements IDrivingLicenseMgmtService {
	@Autowired
	private IPersonDetailsRepository  personRepo;
	@Autowired
	private IDrivingLicenseRepository  licenseRepo;

	@Override
	public String savePersonAndHisLicense(PersonDetails person) {
		String idVal=personRepo.save(person).getId();
		return "Person object is saved having id Value:"+idVal;
	}

	@Override
	public String saveDrivingLicenseAndItsPersonInfo(DrivingLicense license) {
		 String idVal=licenseRepo.save(license).getId();
		return idVal;
	}

}
