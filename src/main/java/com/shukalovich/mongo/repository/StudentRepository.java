package com.shukalovich.mongo.repository;

import com.shukalovich.mongo.entity.StudentEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends MongoRepository<StudentEntity, String> {

    List<StudentEntity> findByName(String name);

    List<StudentEntity> findByNameAndEmail(String name, String email);

    List<StudentEntity> findByNameOrEmail(String name, String email);

    List<StudentEntity> findByDepartmentDepartmentName(String departmentName);

    List<StudentEntity> findBySubjectsSubjectName(String subName);

    List<StudentEntity> findAllByEmailLike(String string);

    List<StudentEntity> findAllByNameStartsWith(String name);

}
