package com.skill.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.skill.model.Course;

public interface CourseRepo extends JpaRepository<Course, Integer> {

    List<Course> findByTitleIgnoreCase(String title);
}