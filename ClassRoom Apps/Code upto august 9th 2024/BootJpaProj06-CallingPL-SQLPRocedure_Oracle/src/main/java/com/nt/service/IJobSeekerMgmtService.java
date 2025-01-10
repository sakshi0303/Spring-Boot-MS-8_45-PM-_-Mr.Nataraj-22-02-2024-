package com.nt.service;

import java.util.List;

import com.nt.entity.JobSeeker;

public interface IJobSeekerMgmtService {
   public  List<JobSeeker>  showJSDetailsByPercentage(double start,double end);
}
