package com.koenig.projects.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.koenig.projects.domain.Pick;

public interface PickRepository extends MongoRepository<Pick, Integer>{

}
