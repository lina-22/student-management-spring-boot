package com.studentmanagementsystem.service;
import com.studentmanagementsystem.entity.Student;

import java.util.List;
public interface StudentService {
    List<Student>getAllStudent();
    Student saveStudent(Student student);
}
