package com.java.crs.Repo;

import com.java.crs.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CourseRepo extends JpaRepository<Course,String> {
    Optional<Course> findByCourseCode(String courseCode);
}
