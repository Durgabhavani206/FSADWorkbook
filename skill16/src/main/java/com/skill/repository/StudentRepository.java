package com.skill.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.skill.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}