package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.nt.entity.JobSeeker;

public interface IJobSeekerRepository extends JpaRepository<JobSeeker, Integer> {
   
	//@Query("from JobSeeker")
	//@Query("from com.nt.entity.JobSeeker")
	//@Query("from com.nt.entity.JobSeeker as js")
	//@Query("from com.nt.entity.JobSeeker  js")
	@Query("select js from com.nt.entity.JobSeeker  js")
	public List<JobSeeker>   showAllJobSeekers();
	
	/*@Query(" from JobSeeker where  percentage>=:min and percentage<=:max")
	public  List<JobSeeker>  showAllJobSeekersByPercentageRange(@Param("min") double start,@Param("max")  double end);*/
	
	/*@Query(" from JobSeeker where  percentage>=:start and percentage<=:end")
	public  List<JobSeeker>  showAllJobSeekersByPercentageRange( double start,  double end);*/
	
	@Query(" from JobSeeker where  percentage>=:start and percentage<=:end")
	public  List<JobSeeker>  showAllJobSeekersByPercentageRange(double start,  double end);
	
	@Query(" select jsId,jsName,qlfy from JobSeeker where  qlfy in(:qlfy1,:qlfy2,:qlfy3) order by qlfy  desc" )
	public  List<Object[]>  showJobSeekerDataByQualifications(String qlfy1,String qlfy2,String qlfy3);
	
	@Query(" select mobileNo from JobSeeker where jsName like :initChars " )
		public  List<Long>   showJobSeekersMobileNumbersByNameStartChars(String  initChars);
	
	//========================= Seelect single  record  ===================
	@Query("from  JobSeeker where  mobileNo=:no")
	public   JobSeeker   getJobSeekerByMobileNo(long no);
	@Query("select  jsId,jsName,qlfy from  JobSeeker where  mobileNo=:no")
	public   Object   getJobSeekerDataByMobileNo(long no);
	@Query("select  jsName from  JobSeeker where  mobileNo=:no")
	public  String   getJobSeekerNameByMobileNo(long no);
	
	//===============Aggragate operations====================
   @Query("select count(*)  from JobSeeker")
	  public  long    showJobSkeersCount();
	
   @Query("select count(*),max(percentage),min(percentage),avg(percentage),sum(percentage)  from JobSeeker")
	     public Object   showJobSeekerAggregateResults();
	
	//=====================Non-Select Operations========================
   @Query("update JobSeeker set percentage=percentage+(percentage*:percent/100.0) where qlfy=:degree")
   @Modifying
   @Transactional
   public  int  modifyPercentageByQualification(String degree,double percent);
   
   @Query("delete  from JobSeeker where mobileNo is NULL or qlfy is NULL")
   @Modifying
   @Transactional
    public int    removeJobSeekersWithNoQualificationAndMobileNumber();
   
   //===================Native SQL Queries ===================
   @Query(value="select now() from dual  ", nativeQuery = true)
   public   String   showSysDate();
   
   
	
	
	
}
