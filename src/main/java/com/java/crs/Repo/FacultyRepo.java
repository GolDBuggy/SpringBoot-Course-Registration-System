package com.java.crs.Repo;

import com.java.crs.Model.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacultyRepo extends JpaRepository<Faculty,String> {
}
