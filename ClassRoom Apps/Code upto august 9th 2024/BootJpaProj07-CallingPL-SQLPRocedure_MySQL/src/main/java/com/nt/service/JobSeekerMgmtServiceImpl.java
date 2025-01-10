package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.JobSeeker;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;

@Service("jsMgmtService")
public class JobSeekerMgmtServiceImpl implements IJobSeekerMgmtService {
	@Autowired
	private EntityManager  manager;
	
	
	/*CREATE DEFINER=`root`@`localhost` PROCEDURE `p_get_JsDetailsByPercentage`(in  min float , in  max float)
			BEGIN
			select * from job_seeker_info  where js_percentage>=min and js_percentage<=max;
	
			END*/

	@Override
	public List<JobSeeker> showJSDetailsByPercentage(double start, double end) {
		// create StoredProcedureQuery object
		StoredProcedureQuery  query=manager.createStoredProcedureQuery("p_get_JsDetailsByPercentage",JobSeeker.class );
		//register paramns
		query.registerStoredProcedureParameter(1, Double.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(2, Double.class, ParameterMode.IN);
		//set values to IN params
		query.setParameter(1 ,start);
		query.setParameter(2, end);
		//call PL/SQL PRocedure
		List<JobSeeker> list=query.getResultList();
		return  list;
	}

}
