package com.xuanbac.QuanLySinhVien.service;

import com.xuanbac.QuanLySinhVien.entity.Student;

import java.util.List;

public interface StudentService {
    public List<Student> getAllStudents();

    public Student getStudentById(int id);

    public Student addStudent(Student student);

    public Student updateStudent(Student student);

    public void deleteStudent(int id);


}
