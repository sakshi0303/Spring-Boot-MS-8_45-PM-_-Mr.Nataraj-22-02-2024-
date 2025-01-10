package com.nt.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nt.document.PersonalInfo;

public interface IPersonaInfoRepository extends MongoRepository<PersonalInfo, String> {

}
