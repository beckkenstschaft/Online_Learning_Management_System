package com.lms.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.lms.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {}
