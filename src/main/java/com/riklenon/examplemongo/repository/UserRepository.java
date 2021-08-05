package com.riklenon.examplemongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.riklenon.examplemongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
