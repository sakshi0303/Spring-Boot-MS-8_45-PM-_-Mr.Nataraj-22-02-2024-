package com.nt.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nt.document.IPLTeam;

public interface IIPLTeamRepository extends MongoRepository<IPLTeam, Integer> {

}
