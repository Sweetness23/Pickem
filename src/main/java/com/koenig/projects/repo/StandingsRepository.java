package com.koenig.projects.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.koenig.projects.domain.Standing;

public interface StandingsRepository extends MongoRepository<Standing, Integer>{

}
