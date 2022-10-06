package com.java.crs.Service;

import com.java.crs.Model.Course;
import com.java.crs.Repo.CourseRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CourseService {

    private final CourseRepo courseRepo;

    public void saveCourse(Course course){
        courseRepo.save(course);
    }

    public Course findCourseByCode(String courseCode){
        return courseRepo.findByCourseCode(courseCode).get();
    }
}
