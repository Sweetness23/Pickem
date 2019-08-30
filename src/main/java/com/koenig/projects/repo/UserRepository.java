package com.koenig.projects.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.koenig.projects.domain.Pick;
import com.koenig.projects.domain.User;

public interface UserRepository extends MongoRepository<User, Integer>{

	User findByNameIgnoreCaseAndEmailIgnoreCase(String name, String email);
}
