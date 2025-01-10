package com.nt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.nt.entity.JobSeeker;

public interface IJobSeekerRepository extends CrudRepository<JobSeeker, Integer>,
                                                                                         PagingAndSortingRepository<JobSeeker, Integer> {

}
