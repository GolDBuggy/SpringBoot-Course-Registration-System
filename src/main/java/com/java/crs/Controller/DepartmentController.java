package com.java.crs.Controller;

import com.java.crs.Dto.DepartmentDto;
import com.java.crs.Model.Department;
import com.java.crs.Service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
@RequiredArgsConstructor
public class DepartmentController {

    private final DepartmentService departmentService;

    @PostMapping("/create")
    public ResponseEntity<String> facultyCreate(@RequestBody Department department){
        departmentService.saveDepartment(department);
        return ResponseEntity.ok(department.getDepartmentName()+" Created!");
    }


    @GetMapping("/all")
    public ResponseEntity<List<DepartmentDto>> getAll(){
        return ResponseEntity.ok(departmentService.getAllDeprt());
    }
}
