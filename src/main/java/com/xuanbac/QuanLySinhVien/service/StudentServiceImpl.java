package com.xuanbac.QuanLySinhVien.service;

import com.xuanbac.QuanLySinhVien.dao.StudentReponsitory;
import com.xuanbac.QuanLySinhVien.entity.Student;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentServiceImpl implements StudentService{

    private StudentReponsitory studentReponsitory;

    @Autowired
    public StudentServiceImpl(StudentReponsitory studentReponsitory) {
        this.studentReponsitory = studentReponsitory;
    }

    @Override
    public List<Student> getAllStudents(){
        return studentReponsitory.findAll();
    }

    @Override
    public Student getStudentById(int id) {
        return studentReponsitory.getById(id);
    }

    @Override
    @Transactional
    public Student addStudent(Student student) {
        return studentReponsitory.save(student);
    }

    @Override
    @Transactional
    public Student updateStudent(Student student) {
        return studentReponsitory.saveAndFlush(student);
    }

    @Override
    @Transactional
    public void deleteStudent(int id) {
        studentReponsitory.deleteById(id);
    }
}
