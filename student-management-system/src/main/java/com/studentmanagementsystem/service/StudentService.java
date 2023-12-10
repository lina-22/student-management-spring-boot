package com.studentmanagementsystem.service;
import com.studentmanagementsystem.entity.Student;

import java.util.List;
public interface StudentService {
    public abstract List<Student>getAllStudents();
    public abstract Student saveStudent(Student student);

    public abstract Student getStudentById(Long id);
    public abstract Student updateStudent(Student student);

    public abstract void deleteStudentById(Long id);
}
