package com.example.springrestfulpractice.Controller;

import com.example.springrestfulpractice.Model.Student;
import com.example.springrestfulpractice.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/information")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping() //取得所有學生資訊
    public List<Student> getAllStudents() {
        List<Student> studentList = this.studentService.getAllStudents();
        return studentList;
    }

    @GetMapping("/{keyId}") //取得某位學生
    public Student getStudent(@PathVariable int keyId) {
        Student student = this.studentService.getStudent(keyId);
        return student;
    }

    @PostMapping() //新增資料
    public Student createStudent(@RequestBody Student student) {
        Student createdStudent = this.studentService.createStudent(student);
        return createdStudent;
    }

    @PutMapping("/{keyId}") //修改已存在學生資料
    public Student updateStudent(@PathVariable int keyId, @RequestBody Student student) {
        Student updatedStudent = this.studentService.updateStudent(keyId, student);
        return updatedStudent;
    }

    @DeleteMapping("/{keyId}") //刪除某位學生
    public Student deleteStudent(@PathVariable int keyId) {
        Student deletedStudent = this.studentService.deleteStudent(keyId);
        return deletedStudent;
    }
}