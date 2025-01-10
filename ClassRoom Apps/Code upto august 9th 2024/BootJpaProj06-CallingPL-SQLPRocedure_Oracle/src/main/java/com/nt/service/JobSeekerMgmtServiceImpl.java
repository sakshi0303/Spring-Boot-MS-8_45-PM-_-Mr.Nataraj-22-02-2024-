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
	
	
	/*	CREATE OR REPLACE PROCEDURE P_GET_JS_BY_PERCENTAGE 
		(
		  MIN IN FLOAT 
		, MAX IN FLOAT 
		, DETAILS OUT SYS_REFCURSOR 
		) AS 
		BEGIN
		  
		  open DETAILS for
		    SELECT *  FROM job_seeker_info WHERE  JS_PERCENTAGE>=min  and JS_PERCENTAGE<=max ;
		  
		END P_GET_JS_BY_PERCENTAGE;*/

	@Override
	public List<JobSeeker> showJSDetailsByPercentage(double start, double end) {
		// create StoredProcedureQuery object
		StoredProcedureQuery  query=manager.createStoredProcedureQuery("P_GET_JS_BY_PERCENTAGE",JobSeeker.class );
		//register paramns
		query.registerStoredProcedureParameter(1, Double.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(2, Double.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(3, Object.class, ParameterMode.REF_CURSOR);
		//set values to IN params
		query.setParameter(1 ,start);
		query.setParameter(2, end);
		//call PL/SQL PRocedure
		List<JobSeeker> list=query.getResultList();
		return  list;
	}

}
