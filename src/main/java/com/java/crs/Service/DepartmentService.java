package com.java.crs.Service;

import com.java.crs.Dto.DepartmentDto;
import com.java.crs.Model.Department;
import com.java.crs.Repo.DepartmentRepo;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DepartmentService {

    private final DepartmentRepo departmentRepo;
    private final ModelMapper modelMapper;

    public void saveDepartment(Department department){
        departmentRepo.save(department);
    }


    public List<DepartmentDto> getAllDeprt(){
        return departmentRepo.findAll().stream().map(d -> modelMapper.map(d,DepartmentDto.class)).collect(Collectors.toList());
    }
}
