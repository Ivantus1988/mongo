package com.shukalovich.mongo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SubjectEntity {

    @Field(name = "subject_name")
    private String subjectName;

    @Field(name = "marks_obtained")
    private Integer marksObtained;
}
