package com.nt.service;

import com.nt.document.DrivingLicense;
import com.nt.document.PersonDetails;

public interface IDrivingLicenseMgmtService {
	
	public  String  savePersonAndHisLicense(PersonDetails person);  //parent to child
	public  String  saveDrivingLicenseAndItsPersonInfo(DrivingLicense license);  //child to parent
	

}
