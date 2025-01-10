package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.JobSeeker;
import com.nt.repository.IJobSeekerRepository;

@Service("jsService")
public class JobSeekerMgmtServiceImpl implements IJobSeekerMgmtService {
	@Autowired
	private  IJobSeekerRepository  jsRepo;

	@Override
	public String register(JobSeeker js) {
		/*	System.out.println("jsRepo  obj class name(InMemory Proxy class name)::"+jsRepo.getClass());
			System.out.println("Proxy class implemented interfaces::"+Arrays.toString(jsRepo.getClass().getInterfaces()));
			System.out.println("Proxy class methods::"+Arrays.toString(jsRepo.getClass().getDeclaredMethods()));*/
		
		
		//save the object
		JobSeeker  savedJs=jsRepo.save(js);
		
		return "Job Seeker  obj saved(record inserted)  having the id value ::"+savedJs.getJsId();
	}
	
	@Override
	public boolean isJobSeekerExists(int id) {
		boolean  flag=jsRepo.existsById(id);
		return flag;
	}
	
	@Override
	public long getJobSeekersCount() {
		return jsRepo.count();
	}
	
	@Override
	public Iterable<JobSeeker> getAllJobSeekers() {
		return jsRepo.findAll();
	}
	
	@Override
	public Iterable<JobSeeker> getJobSeekersByIds(Iterable<Integer> ids) {
		
		return jsRepo.findAllById(ids);
	}
	
	@Override
	public Optional<JobSeeker> getJobSeekerById(int id) {
		return   jsRepo.findById(id);
	}
	
	@Override
	public String showJobSeekerById(int id) {
		Optional<JobSeeker>  opt=jsRepo.findById(id);
		if(opt.isEmpty())
			return "Record not found";
		else
			return "record found"+opt.get().toString();
		
	}
	
	@Override
	public JobSeeker fetchJobSeekerById(int id) {
		 JobSeeker  js=jsRepo.findById(id).orElseThrow(()->new IllegalArgumentException("invalid id"));
		 return js;
	}
	
	@Override
	public JobSeeker findJobSeekerById(int id) {
		return jsRepo.findById(id).orElse(new JobSeeker("freelancer", "freelancer work", 0.0f, 000000L));
	
	}
	
	/*@Override
	public String registerOrUpdateJobSeeker(JobSeeker js) {
		   jsRepo.save(js);
		   return "JobSeeker is  saved or updated";
	}*/
	
	@Override
	public String registerOrUpdateJobSeeker(JobSeeker js) {
		   Optional<JobSeeker>  opt=jsRepo.findById(js.getJsId());
		   if(opt.isPresent()) {
			   int idVal=jsRepo.save(js).getJsId();
			   return idVal+" JobSeeker is  updated";
		   }
		   else {
			   int idVal=jsRepo.save(js).getJsId();
			   return idVal+" JobSeeker is  inserted";
		   }
	}
	
	@Override
	public String updateJobSeekerInfoById(int id, long newMobileNo) {
		Optional<JobSeeker> opt=jsRepo.findById(id);
		if(opt.isPresent()) {
			JobSeeker  js=opt.get();
			js.setMobileNo(newMobileNo);
			jsRepo.save(js);
			return id+" JobSeeker is updated";
		}
		return id+" JobSeeker is not found";
	}
	
	@Override
	public String removeJobSeekerById(int id) {
		Optional<JobSeeker> opt=jsRepo.findById(id);
		if(opt.isPresent()) {
			jsRepo.deleteById(id);
			return id+" JobSeeker is deleted";
		}
		return id+" JobSeeker is not found for deletion";
	}
	
	@Override
	public String removeJobSeeker(JobSeeker js) {
		Optional<JobSeeker> opt=jsRepo.findById(js.getJsId());
		if(opt.isPresent()) {
			jsRepo.delete(js);
			return  js.getJsId()+"  JobSeeker is deleted";
		}
		return js.getJsId()+" jobseeker is not found";
	}
	
	
	@Override
	public String removeAllJobSeekers() {
		long count=jsRepo.count();
		if(count==0)
		    return "records not found ";
		else {
			jsRepo.deleteAll();
			return count+" no.of records are deleted";
		}
	}
	
	@Override
	public String removeJobSeekersByIds(Iterable<Integer> ids) {
		    Iterable<JobSeeker>  it=jsRepo.findAllById(ids);
		      List<JobSeeker> list=(List<JobSeeker>)it;
		      int count=list.size();
		      jsRepo.deleteAllById(ids);
		      
		return count+" no.of records are found and deleted ";
	}

}
