package com.java.crs.Repo;

import com.java.crs.Model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepo extends JpaRepository<Member,String> {
}
