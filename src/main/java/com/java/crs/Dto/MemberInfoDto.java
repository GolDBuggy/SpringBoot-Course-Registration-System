package com.java.crs.Dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberInfoDto {

    private String firstName;
    private String lastName;
    private List<CourseDto> courses;
}
