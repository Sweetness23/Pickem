package com.koenig.projects.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.koenig.projects.domain.Standings;

public interface StandingsRepository extends MongoRepository<Standings, Integer>{

}
