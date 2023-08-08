package com.shukalovich.mongo.controller;

import com.shukalovich.mongo.entity.StudentEntity;
import com.shukalovich.mongo.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/student")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @PostMapping("/create")
    public StudentEntity createStudent(@RequestBody StudentEntity student) {
        return studentService.createStudent(student);
    }

    @GetMapping("/getById/{id}")
    public StudentEntity getStudentById(@PathVariable String id) {
        return studentService.getStudentById(id);
    }

    @GetMapping("/findAll")
    public List<StudentEntity> getStudentById() {
        return studentService.getAllStudents();
    }

    @PutMapping("/update")
    public StudentEntity updateStudent(@RequestBody StudentEntity student) {
        return studentService.update(student);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudentById(@PathVariable String id) {
        return studentService.deleteStudent(id);
    }

    @GetMapping("/studentsByName/{name}")
    public List<StudentEntity> studentsByName(@PathVariable String name) {
        return studentService.getStudentsByName(name);
    }

    @GetMapping("/studentsByNameAndEmail")
    public List<StudentEntity> studentsByNameAndEmail(@RequestParam String name,
                                                      @RequestParam String email) {
        return studentService.getStudentsByNameAndEmail(name, email);
    }

    @GetMapping("/studentsByNameOrEmail")
    public List<StudentEntity> studentsByNameOrEmail(@RequestParam String name,
                                                     @RequestParam String email) {
        return studentService.getStudentsByNameOrEmail(name, email);
    }

    @GetMapping("/allWithPagination")
    public List<StudentEntity> getAllWithPagination(@RequestParam Integer pageNo,
                                                    @RequestParam Integer pageSize) {
        return studentService.getAllWithPagination(pageNo, pageSize);
    }

    @GetMapping("/allWithSorting")
    public List<StudentEntity> getAllWithSorting() {
        return studentService.getAllWithSorting();
    }

    @GetMapping("/byDepartmentName")
    public List<StudentEntity> byDepartmentName(@RequestParam String departmentName) {
        return studentService.byDepartmentName(departmentName);
    }

    @GetMapping("/bySubjectName")
    public List<StudentEntity> bySubjectName(@RequestParam String subName) {
        return studentService.bySubjectName(subName);
    }

    @GetMapping("/emailLike")
    public List<StudentEntity> emailLike(@RequestParam String string) {
        return studentService.emailLike(string);
    }

    @GetMapping("/nameStartWith")
    public List<StudentEntity> nameStartWith(@RequestParam String name) {
        return studentService.nameStartWith(name);
    }
}
