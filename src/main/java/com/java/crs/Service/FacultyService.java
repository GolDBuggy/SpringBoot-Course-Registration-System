package com.java.crs.Service;

import com.java.crs.Model.Department;
import com.java.crs.Model.Faculty;
import com.java.crs.Repo.DepartmentRepo;
import com.java.crs.Repo.FacultyRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FacultyService {

    private final FacultyRepo facultyRepo;

    public void saveFaculty(Faculty faculty){
       facultyRepo.save(faculty);
    }
}
