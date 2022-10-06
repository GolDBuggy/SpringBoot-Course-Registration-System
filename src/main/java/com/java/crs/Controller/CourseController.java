package com.java.crs.Controller;

import com.java.crs.Dto.LoginDto;
import com.java.crs.Model.Course;
import com.java.crs.Model.Member;
import com.java.crs.Service.CourseService;
import com.java.crs.Service.JwtService;
import com.java.crs.Service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/course")
@RequiredArgsConstructor
public class CourseController {

    private final CourseService courseService;


    @PostMapping("/create")
    public ResponseEntity<Course> home(@RequestBody Course course){
        courseService.saveCourse(course);
        return ResponseEntity.ok(course);
    }


}
