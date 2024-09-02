package com.xuanbac.QuanLySinhVien.dao;

import com.xuanbac.QuanLySinhVien.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentReponsitory extends JpaRepository<Student, Integer> {

}
