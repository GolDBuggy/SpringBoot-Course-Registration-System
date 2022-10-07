package com.java.crs.Dto;

import com.java.crs.Model.Departments;
import com.java.crs.Model.Faculty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentDto {

    private Departments departmentName;
    private FacultyDto faculty;
}
