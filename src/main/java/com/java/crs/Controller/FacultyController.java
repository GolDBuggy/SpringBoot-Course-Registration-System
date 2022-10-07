package com.java.crs.Controller;

import com.java.crs.Dto.DepartmentDto;
import com.java.crs.Model.Department;
import com.java.crs.Model.Faculty;
import com.java.crs.Service.FacultyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/faculty")
@RequiredArgsConstructor
public class FacultyController {

    private final FacultyService facultyService;

    @PostMapping("/create")
    public ResponseEntity<String> facultyCreate(@RequestBody Faculty faculty){
        facultyService.saveFaculty(faculty);
        return ResponseEntity.ok(faculty.getFacultyName()+" Created!");
    }



}
