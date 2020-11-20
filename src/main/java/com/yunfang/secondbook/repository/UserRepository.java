package com.yunfang.secondbook.repository;

import com.yunfang.secondbook.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Long> {
}
