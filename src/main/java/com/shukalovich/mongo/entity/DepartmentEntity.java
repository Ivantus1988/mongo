package com.shukalovich.mongo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "department")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DepartmentEntity {

    @Id
    private String id;

    @Field(name = "department_name")
    private String departmentName;

    public String location;
}
