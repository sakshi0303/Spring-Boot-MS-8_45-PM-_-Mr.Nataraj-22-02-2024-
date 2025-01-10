package com.nt.service;

import java.util.List;

import com.nt.entity.Doctor;

public interface IDoctorMgmtService {
   public  String  registerDoctor(Doctor doctor);	
   public   List<Doctor>  showAllDoctors();
   public  double    getDoctorAgeById(int id);
}
