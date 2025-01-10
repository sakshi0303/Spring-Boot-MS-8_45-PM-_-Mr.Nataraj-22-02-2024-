package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.nt.entity.JobSeeker;
import com.nt.repository.IJobSeekerRepository;

@Service("jsService")
public class JobSeekerMgmtServiceImpl implements IJobSeekerMgmtService {
	@Autowired
	private  IJobSeekerRepository  jsRepo;

	@Override
	public String removeJobSeekersByIds(List<Integer> ids) {
		  //check  the availability of the records
		Iterable<JobSeeker> it=jsRepo.findAllById(ids);
		//get the count of records
		long count=((List<JobSeeker>)it).size();
		//delete the records in batch
		jsRepo.deleteAllByIdInBatch(ids);
		return  count+" no.of records are deleted";
		
	}
	
	@Override
	public List<JobSeeker> searchJobSeekersByExampleData(JobSeeker js, boolean ascOrder, String... properties) {
		 //prepare the Sort object
		Sort sort=Sort.by(ascOrder?Sort.Direction.ASC:Sort.Direction.DESC,properties);
		//create Example Object
		Example<JobSeeker> example=Example.of(js);
		//execute the logics
		List<JobSeeker> list=jsRepo.findAll(example,sort);
		return list;
	}
	
	@Override
	public Optional<JobSeeker> getJSById(int id) {
		return  jsRepo.findById(id);
	}
	
	@Override
	public JobSeeker findJsById(int id) {
		return jsRepo.getReferenceById(id);
	}
	
	



}
