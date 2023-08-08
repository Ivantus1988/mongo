package com.shukalovich.mongo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Document(collection = "student")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentEntity {

    @Id
    private String id;
    public String name;
    private String email;
    private DepartmentEntity department;
    private List<SubjectEntity> subjects;
}
