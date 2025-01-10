package com.nt.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nt.document.PersonDetails;

public interface IPersonDetailsRepository extends MongoRepository<PersonDetails, String> {

}
