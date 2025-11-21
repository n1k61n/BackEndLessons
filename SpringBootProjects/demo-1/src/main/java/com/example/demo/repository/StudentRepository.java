package com.example.demo.repository;

import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Student findByLogin(String login) {
        String sql = "SELECT * FROM students WHERE login = ?";
        return jdbcTemplate.queryForObject(sql, (rs, rowNum) -> {
            Student s = new Student();
            s.setId(rs.getInt("id"));
            s.setFirstName(rs.getString("first_name"));
            s.setLastName(rs.getString("last_name"));
            s.setLogin(rs.getString("login"));
            s.setPasswordHash(rs.getString("password_hash"));
            return s;
        });
    }
}