package com.java.crs.Dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseDto {

    private String courseCode;
    private String courseName;
    private AcademicianDto member;
    private List<CalenderDto> calenders;
}
