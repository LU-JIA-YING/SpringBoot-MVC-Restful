package com.example.springrestfulpractice.Service;


import com.example.springrestfulpractice.Model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private List<Student> studentList;

    public StudentService() {
        this.studentList = new ArrayList<>();
        this.studentList.add(new Student(1,"M121427564", "Maggie"));
        this.studentList.add(new Student(2,"G222184047", "Bill"));
        this.studentList.add(new Student(3,"A126496653", "Joey"));
        this.studentList.add(new Student(4,"B222829125", "Joyce"));
        this.studentList.add(new Student(5,"N224959851", "Angle"));
        this.studentList.add(new Student(6,"H225380827", "Emily"));
        this.studentList.add(new Student(7,"N126504703", "Brian"));
        this.studentList.add(new Student(8,"B223320218", "Liliana"));
        this.studentList.add(new Student(9,"P124430117", "Jack"));
        this.studentList.add(new Student(10,"L125124505", "Jef"));
    }

    public List<Student> getAllStudents() {
        return this.studentList;
    }

    public Student getStudent(int keyId) {
        for (Student studentKeyId : this.studentList) {
            if (keyId == studentKeyId.getKeyId()) {
                return studentKeyId;
            }
        }
        return null;
    }

    public Student createStudent(Student student) {
        this.studentList.add(student);
        return student;
    }

    public Student updateStudent(int keyId, Student student) {
        for (Student updatedStudent : this.studentList) {
            if (keyId == updatedStudent.getKeyId()) {
                updatedStudent.setId(student.getId());
                updatedStudent.setName(student.getName());
                return updatedStudent;
            }
        }
        return null;
    }

    public Student deleteStudent(int keyId) {
        for (Student student : this.studentList) {
            if (keyId == student.getKeyId()) {
                this.studentList.remove(student);
                return student;
            }
        }
        return null;
    }

}