package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Doctor;
import com.nt.repository.IDoctorRepository;

@Service("docService")
public class DoctorMgmtServiceImpl implements IDoctorMgmtService {
	@Autowired
	private IDoctorRepository  doctorRepo;

	@Override
	public String registerDoctor(Doctor doctor) {
		int idVal=doctorRepo.save(doctor).getDid();
		return "Doctor is saved with the id value :;"+idVal;
	}
	
	@Override
	public List<Doctor> showAllDoctors() {
		return doctorRepo.findAll();
	}
	
	@Override
	public double getDoctorAgeById(int id) {
		return doctorRepo.showDoctorAgeById(id);
	}

}
