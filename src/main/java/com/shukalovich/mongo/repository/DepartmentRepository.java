package com.shukalovich.mongo.repository;

import com.shukalovich.mongo.entity.DepartmentEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DepartmentRepository extends MongoRepository<DepartmentEntity, String> {
}
