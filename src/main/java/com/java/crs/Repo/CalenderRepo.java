package com.java.crs.Repo;

import com.java.crs.Model.Calender;
import com.java.crs.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalenderRepo extends JpaRepository<Calender,String> {
}
