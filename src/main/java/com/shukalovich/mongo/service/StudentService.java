package com.shukalovich.mongo.service;

import com.shukalovich.mongo.entity.StudentEntity;
import com.shukalovich.mongo.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public List<StudentEntity> getAllStudents() {
        return studentRepository.findAll();
    }

    public StudentEntity createStudent(StudentEntity student) {
        return studentRepository.save(student);
    }

    public StudentEntity getStudentById(String id) {
        return studentRepository.findById(id).get();
    }

    public StudentEntity update(StudentEntity student) {
        return studentRepository.save(student);
    }

    public String deleteStudent(String id) {
        studentRepository.deleteById(id);
        return "Student has been deleted.";
    }

    public List<StudentEntity> getStudentsByName(String name) {
        return studentRepository.findByName(name);
    }

    public List<StudentEntity> getStudentsByNameAndEmail(String name, String email) {
        return studentRepository.findByNameAndEmail(name, email);
    }

    public List<StudentEntity> getStudentsByNameOrEmail(String name, String email) {
        return studentRepository.findByNameOrEmail(name, email);
    }

    public List<StudentEntity> getAllWithPagination(Integer pageNo, Integer pageSize) {
        PageRequest pageable = PageRequest.of(pageNo - 1, pageSize);

        return studentRepository.findAll(pageable).getContent();
    }

    public List<StudentEntity> getAllWithSorting() {
        Sort sort = Sort.by(Sort.Direction.ASC, "name", "email");

        return studentRepository.findAll(sort);
    }

    public List<StudentEntity> byDepartmentName(String departmentName) {
        return studentRepository.findByDepartmentDepartmentName(departmentName);
    }

    public List<StudentEntity> bySubjectName(String subName) {
        return studentRepository.findBySubjectsSubjectName(subName);
    }

    public List<StudentEntity> emailLike(String string) {
        return studentRepository.findAllByEmailLike(string);
    }

    public List<StudentEntity> nameStartWith(String name) {
        return studentRepository.findAllByNameStartsWith(name);
    }
}
