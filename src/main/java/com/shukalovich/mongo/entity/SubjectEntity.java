package com.shukalovich.mongo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "subject")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SubjectEntity {

    @Id
    private String id;

    @Field(name = "subject_name")
    private String subjectName;

    @Field(name = "marks_obtained")
    private Integer marksObtained;
}
