package com.shukalovich.mongo.repository;

import com.shukalovich.mongo.entity.SubjectEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SubjectRepository extends MongoRepository<SubjectEntity, String> {
}
