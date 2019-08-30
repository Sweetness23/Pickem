package com.koenig.projects.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.koenig.projects.domain.Pick;

public interface PickRepository extends MongoRepository<Pick, Integer>{

	List<Pick> findAllByOrderByDateDesc();
}
