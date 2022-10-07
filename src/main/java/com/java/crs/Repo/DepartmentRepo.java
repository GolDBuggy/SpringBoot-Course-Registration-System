package com.java.crs.Repo;

import com.java.crs.Model.Department;
import com.java.crs.Model.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepo extends JpaRepository<Department,String> {
}
