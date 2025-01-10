package com.nt.service;

import java.util.Optional;

import com.nt.entity.JobSeeker;

public interface IJobSeekerMgmtService {
    public  String register(JobSeeker js);
    public   boolean   isJobSeekerExists(int  id);
    public  long    getJobSeekersCount();
    public   Iterable<JobSeeker>  getAllJobSeekers();
    public   Iterable<JobSeeker>  getJobSeekersByIds(Iterable<Integer> ids);
    public    Optional<JobSeeker>  getJobSeekerById(int id);
    public   String   showJobSeekerById(int id);
    public   JobSeeker fetchJobSeekerById(int id);
    public    JobSeeker findJobSeekerById(int id);
    
    public  String   registerOrUpdateJobSeeker(JobSeeker  js);
    public  String    updateJobSeekerInfoById(int id,long newMobileNo);
    public   String  removeJobSeekerById(int id);
    public  String   removeJobSeeker(JobSeeker js);
        public   String   removeAllJobSeekers();
    public  String  removeJobSeekersByIds(Iterable<Integer> ids);
}
