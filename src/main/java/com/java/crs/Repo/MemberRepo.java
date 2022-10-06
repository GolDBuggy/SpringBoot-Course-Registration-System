package com.java.crs.Repo;

import com.java.crs.Model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepo extends JpaRepository<Member,String> {

    Optional<Member> findByUsername(String username);
}
