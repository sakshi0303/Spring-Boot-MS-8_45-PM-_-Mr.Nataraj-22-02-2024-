package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.MarriageProfile;

public interface IMarriageProfileRepository extends JpaRepository<MarriageProfile, Integer> {

}
