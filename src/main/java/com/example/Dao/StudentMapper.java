package com.example.Dao;

import com.example.models.Student;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentMapper {
    @Select("SELECT * FROM student WHERE id=#{id}")
    Student getStudentByID(int id);
}
